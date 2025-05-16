package com.skm.algo.inter;

public class Card {
    CardType cardType;
    //todo change to enum
    String cardName;

    public Card(CardType cardType, String cardName) {
        this.cardType = cardType;
        this.cardName = cardName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Card{");
        sb.append("cardType=").append(cardType);
        sb.append(", cardName='").append(cardName).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //override hascode and equals
}
