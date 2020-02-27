package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

/**
 *  Deck.java (POJO - this will hold deck data)
 *  *         Card[] cards;
 *  *         ArrayList<Integer> usedCards;
 */

public class Deck{

    private Card[] deck = new Card[52];
    private ArrayList<Integer> usedCards = new ArrayList<>();
    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    private static int freshDecksLoaded;

    public Deck(){
        loadFreshDeck();
        freshDecksLoaded++;
    }

    private void loadFreshDeck() {
        int count = 0;

        for (int x = 0; x < 4; x++){
            for (int i = 1; i < 14; i++){
                if (i == 1){
                    deck[count] = new Card(suit[x], "ACE");

                }
            }
        }
    }
}