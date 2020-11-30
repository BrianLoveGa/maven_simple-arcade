package com.github.curriculeon.arcade.games;


import com.github.curriculeon.arcade.ArcadeAccount;

public abstract class AbstractPlayer implements PlayerInterface {
    private ArcadeAccount arcadeAccount;

    public AbstractPlayer(ArcadeAccount arcadeAccount) {
        this.arcadeAccount = arcadeAccount;
    }

    @Override
    public ArcadeAccount getArcadeAccount() {
        return arcadeAccount;
    }

    @Override
    abstract public <SomeReturnType> SomeReturnType play();

    @Override
    public String toString() {
        return "AbstractPlayer{" +
                "arcadeAccount=" + arcadeAccount +
                '}';
    }
}