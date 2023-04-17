/*  
Alice Lily
Tests the DeckofCards class (and therefore, the card class) and its methods. */
import cardpkg.*;

public class DeckTester {
    public static void main(String[] args) {
        //Makes a fresh deck
        DeckofCards deck = new DeckofCards();

        System.out.println(deck);				//Prints the deck
        System.out.println(deck.deal());		//Deals a card
        System.out.println(deck.cardsLeft()+" cards remain.");	//Displays # of cards left
        System.out.println(deck.shuffle()+"\n");		//Shuffles deck, thus "resetting" to 52 cards
        for (int i = 0; i < 52; i++) {
            if (i%5 == 0 && i != 0) {
                System.out.print("\n"+deck.deal()+" ");
            } else
                System.out.print(deck.deal() + " ");
        }
    }
}

