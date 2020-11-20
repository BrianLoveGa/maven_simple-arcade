package com.github.curriculeon.arcade.games.slots;


import com.github.curriculeon.utils.RandomUtils;

public enum SlotsReelImage {
    CHERRY(500),
    ORANGE(500),
    WATERMELON(500),
    LEMON(500),
    BAR(500),
    DOUBLEBAR(1000),
    TRIPLEBAR(2000),
    LUCKYSEVEN(5000);

    private int value;

    SlotsReelImage(int value) {
        this.value = value;
    }

    int getValue() {
        return this.value;
    }

    static SlotsReelImage getRandom() {
        //TODO - replace values() with ReelImage[] object
        return RandomUtils.selectElement(values());
    }

    @Override
    public String toString() {
        return name();
    }
}