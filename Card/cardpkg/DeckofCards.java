/*  
Alice Lily
Creates a new class, DeckofCards, based on the previously created
Card class (included in cardpkg). Generates a complete deck of 52
cards (no jokers), which can be shuffled and dealt via their 
respective methods. Displays the whole deck back via toString method. */
package cardpkg;
import java.util.Random;

public class DeckofCards {
    private Card[] deck;
    private int currentCard = 0;
    Random rand = new Random();

    public DeckofCards() {
        deck = new Card[52];
        int i = 0;
		
		//Goes through each suit, adding one of each face value until it gets to 13 then next suit
        for (int s = 0; s < 4; s++) {
            for (int f = 0; f < 13; f++) {
                deck[i++] = new Card(f + 1, s + 1); //Stores the card, index goes up each time
            }
        }
    }
	
	//Allows user to deal a card
    public String deal() {
        String dealtCard;
        if (currentCard == 52)
            return "Deck is empty"; //Deck is empty once card reaches max, must be shuffled.
        else {
			//If deck not empty, deal card and go to next card for next deal
            dealtCard = "The " + deck[currentCard] + " has been dealt.";
            currentCard++;
            return dealtCard;
        }
    }

	//Allows user to shuffle the deck
    public String shuffle() {
		
		//Randomly "shuffle" 100 times - switch the places of two cards picked at random
        for (int i = 0; i < 100; i++) {
            int index = rand.nextInt(52);
            int index2 = rand.nextInt(52);
            Card temp = deck[index2];
            deck[index2] = deck[index];
            deck[index] = temp;
        }
        currentCard = 0;        //Assume when deck is shuffled, all dealt cards are reclaimed
        return "The deck has been shuffled.";
    }

	//Returns the remaining amount of cards in the deck
    public int cardsLeft() {
        return deck.length - currentCard;
    }

	//Prints the whole deck back to user
    public String toString() {
        String result = "";
        for (int i = 0; i < deck.length ; i++) {
                if ((i+1)%13 == 0 && i != 0)
                    result += deck[i] + ", \n"; //New line after each suit
                else
                    result += deck[i] + ", ";
            }
        return result;
    }
}
