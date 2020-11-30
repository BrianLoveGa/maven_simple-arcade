package com.github.curriculeon.arcade.games.cardgames.utils;

public enum Suit {
    HEARTS("red"),
    DIAMONDS("red"),
    SPADES("black"),
    CLUBS("black");

    private final String color;

    Suit(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public boolean isRed() {
        return "red".equalsIgnoreCase(getColor());
    }
}
