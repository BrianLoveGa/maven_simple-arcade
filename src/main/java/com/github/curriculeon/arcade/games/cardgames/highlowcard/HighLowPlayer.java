package com.github.curriculeon.arcade.games.cardgames.highlowcard;

import com.github.curriculeon.arcade.ArcadeAccount;
import com.github.curriculeon.arcade.PlayerInterface;
import com.github.curriculeon.utils.IOConsole;

/**
 * Created by BWL on 11/20/2020.
 */

public class HighLowPlayer implements PlayerInterface {

    private ArcadeAccount arcadeAccount;

    public HighLowPlayer(ArcadeAccount arcadeAccount) {
        this.arcadeAccount = arcadeAccount;
    }

    @Override
    public ArcadeAccount getArcadeAccount() {
        return arcadeAccount;
    }

    @Override
    public String play() {
        return new IOConsole().getStringInput("Welcome to the higher or lower card game !");
    }
}

