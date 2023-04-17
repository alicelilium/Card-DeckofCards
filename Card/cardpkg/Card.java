/*  
Alice Lily
Creates the Card class - a digital representation of a playing card.
Each card object created with the class has a suit and a face, and those
values can be displayed back to the individual via integer or text.
toString method neatly displays the face and suit in text. 				*/
package cardpkg;
import java.util.Random;

public class Card {

    //Create Random object for default constructor
    Random rand = new Random();

    //Create variables & constants for face, suit, and their max values
    private int face;
    private int suit;
    private final int MAX_FACE = 13;
    private final int MAX_SUIT = 4;

    //Constructor using inputted values for face and suit
    public Card(int userFace, int userSuit) {

        //If values are within bounds, use them, otherwise use random value like default
        if (userFace <= MAX_FACE && userFace > 0)
            face = userFace;
        else
            face = rand.nextInt(13)+1;

        if (userSuit <= MAX_SUIT && userSuit > 0)
            suit = userSuit;
        else
            suit = rand.nextInt(4)+1;
    }

    //Default constructor; creates random values within range
    public Card() {
        face = rand.nextInt(MAX_FACE)+1;
        suit = rand.nextInt(MAX_SUIT)+1;
    }

    //Return numerical value of suit
    public int getSuit() {
        return suit;
    }

    //Return numerical value of face
    public int getFace() {
        return face;
    }

    //Return suit as text
    public String getSuitText() {
        switch (suit) {
            case 1:
                return "Spades";
            case 2:
                return "Hearts";
            case 3:
                return "Diamonds";
            case 4:
                return "Clubs";
            default:
                return "None";
        }
    }

    public String getFaceText() {
        switch (face) {
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            case 1:
                return "Ace";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
            default:
                return "";
        }
    }

    public String toString() {
            return getFaceText() + " of " + getSuitText();
    }

}
