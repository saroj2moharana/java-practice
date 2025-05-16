package com.skm.algo.inter;

public class DeckController {
    Deck deck = null;
    public DeckController(Deck deck) {
        //initiate deck
        this.deck = new Deck();
        deck.initiateCards();
    }


    //try insert all the cards inside deck....
    public boolean insertCard(CardType cardType, String cardName){
        //check deck size;
        //Duplicate card check
        //initiate card and
        Card card = new Card(cardType, cardName);

        return true;
    }

    private boolean checkDuplicate(Deck deck){
        //deck
        return false;
    }

    //display all cards...
    //shuffling of deck

}
