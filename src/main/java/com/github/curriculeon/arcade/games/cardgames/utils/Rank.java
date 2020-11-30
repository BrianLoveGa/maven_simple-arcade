package com.github.curriculeon.arcade.games.cardgames.utils;

public enum Rank {
    ACE(1, 11),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(11, 10),
    QUEEN(12, 10),
    KING(13, 10);

    private final int primaryValue;
    private final int secondaryValue;

    Rank(int primaryValue, int secondaryValue) {
        this.primaryValue = primaryValue;
        this.secondaryValue = secondaryValue;
    }

    Rank(int primaryValue) {
        this(primaryValue, primaryValue);
    }

    public int getPrimaryValue() {
        return primaryValue;
    }

    public int getSecondaryValue() {
        return secondaryValue;
    }
}
