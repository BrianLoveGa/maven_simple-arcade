package com.github.curriculeon.arcade.games.cardgames.utils;

import java.util.Objects;

public class Card implements Comparable<Card> {
    private final Suit suit;
    private final Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank
                .name()
                .concat(" of ")
                .concat(suit.name());
    }

    @Override
    public int compareTo(Card card) {
        return this.getRank().getPrimaryValue() - card.getRank().getPrimaryValue();
    }

    @Override
    public boolean equals(Object o) {
        boolean isSameInstance = this == o;
        boolean isNull = o == null;
        boolean isSameClass = getClass() == o.getClass();
        if (isSameInstance) return true;
        if (isNull || !isSameClass) return false;
        Card card = (Card) o;
        boolean isSuit = suit.equals(card.suit);
        boolean isRank = rank.equals(card.rank);
        boolean isEqual = isSuit && isRank;
        return isEqual;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }
}