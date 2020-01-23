package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

/**
 *  Deck.java (POJO - this will hold deck data)
 *  *         Card[] cards;
 *  *         ArrayList<Integer> usedCards;
 */

class Deck{
    Card[] cards;
    ArrayList<Integer> usedCards;

    public Deck(Card[] cards, ArrayList<Integer> usedCards) {
        this.cards = cards;
        this.usedCards = usedCards;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    public ArrayList<Integer> getUsedCards() {
        return usedCards;
    }

    public void setUsedCards(ArrayList<Integer> usedCards) {
        this.usedCards = usedCards;
    }
}