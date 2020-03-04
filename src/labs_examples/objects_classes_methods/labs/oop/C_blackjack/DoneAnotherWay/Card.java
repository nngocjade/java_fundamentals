package labs_examples.objects_classes_methods.labs.oop.C_blackjack.DoneAnotherWay;

/*
An implementation of a card type.
 */
public class Card {

    //One of he four valid suits for this card
    private Suit mySuit;
    //The number of this card, where Ace: 1, Jack-King: 11-13
    private int myNumber;

    //Card constructor
    public Card(Suit mySuit, int myNumber) {
        this.mySuit = mySuit;
        this.myNumber = myNumber;
    }

    public int getMyNumber() {
        return myNumber;
    }

    //custom tostring method
    public String toString(){

        String numStr;

        switch (this.myNumber){
            case 2:
                numStr = "Two";
                break;
            case 3:
                numStr = "Three";
                break;
            case 4:
                numStr = "Four";
                break;
            case 5:
                numStr = "Five";
                break;
            case 6:
                numStr = "Six";
                break;
            case 7:
                numStr = "Seven";
                break;

        }
    }
}
