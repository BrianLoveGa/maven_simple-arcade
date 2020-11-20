package com.github.curriculeon.arcade.games.numberguess;

import com.github.curriculeon.arcade.ArcadeAccount;
import com.github.curriculeon.arcade.PlayerInterface;
import com.github.curriculeon.utils.IOConsole;

/**
 * Created by leon on 7/21/2020.
 */
public class NumberGuessPlayer implements PlayerInterface {
    private ArcadeAccount arcadeAccount;

    public NumberGuessPlayer(ArcadeAccount arcadeAccount) {
        this.arcadeAccount = arcadeAccount;
    }

    @Override
    public ArcadeAccount getArcadeAccount() {
        return arcadeAccount;
    }

    @Override
    public String play() {
        return new IOConsole().getStringInput("Please enter the number you would like to guess [ 0 - 9 ] or [quit]");
    }
}