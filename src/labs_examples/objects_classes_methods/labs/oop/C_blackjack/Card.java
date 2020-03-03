package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

/**
 *  Card.java (POJO - this will hold card data)
 *  *         char[] suit = new char[]{'♠', '♦', '♥', '♣'};
 *  *         int cardValue;
 */
public class Card{
    private char suit;
    private String value;
    private int scareValue;

    public Card(char suit, String value){
        this.suit = suit;
        this.value = value;
    }



}