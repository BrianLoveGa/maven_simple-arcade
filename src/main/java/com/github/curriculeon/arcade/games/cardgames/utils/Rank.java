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

    private final int value;
    private final int secondaryValue;

    Rank(int value, int secondaryValue) {
        this.value = value;
        this.secondaryValue = secondaryValue;
    }

    Rank(int value) {
        this(value, value);
    }

    public int getValue() {
        return value;
    }

    public int getSecondaryValue() {
        return secondaryValue;
    }
}
