package com.skm.algo.inter;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Deck {
    int total;
    Set<Card> cards;


    public void initiateCards() {
        //initiate clubs card...
        initiateCard(CardType.CLUBS);
        //initiate clubs card...
        initiateCard(CardType.DIAMONDS);
        //initiate clubs card...
        initiateCard(CardType.HEARTS);
        //initiate clubs card...
        initiateCard(CardType.SPADES);
    }

    private void initiateCard(CardType cardType) {
        /*Card card = new Card(cardType, "Ace");
        for(int i=2; i<11; i++){
            Card card = new Card(cardType, i+"");
            cards.add(card);
        }
        Card card = new Card(cardType, "Ace");
        Card card = new Card(cardType, "Ace");
        Card card = new Card(cardType, "Ace");*/

    }
}
