package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

/**
 * It will not ask for bets. The user and the computer will each start with a small pot and bets will be taken automatically.
 *
 * 1) Create four classes (each in their own file with the same name as the class):
 *     BlackjackController.java (this will contain the main())
 *
 *     Player.java (POJO - this will contain player info)
 *         String name;
 *         Hand hand;
 *         int potValue; (the amount of money they have)
 *
 *     Card.java (POJO - this will hold card data)
 *         char[] suit = new char[]{'♠', '♦', '♥', '♣'};
 *         int cardValue;
 *
 *     Deck.java (POJO - this will hold deck data)
 *         Card[] cards;
 *         ArrayList<Integer> usedCards;
 *
 *     Hand.java (POJO - this will hold Hand data)
 *         ArrayList<Card> cards;
 *         int handValue;
 *
 *
 * 2) Fill out each POJO above to the best of your ability. Also create a main() method in the BlackJackController class.
 */

public class BlackjackController {
    public static void main(String[] args) {

    }
}
class Player{
    String name;
    Hand hand;
    int potValue; //amount of money they have

}
class Card{
    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    int cardValue;

}
class Deck{
    Card[] cards;
    ArrayList<Integer> usedCards;

}
class Hand{
    ArrayList<Card> cards;
    int handValue;

}
