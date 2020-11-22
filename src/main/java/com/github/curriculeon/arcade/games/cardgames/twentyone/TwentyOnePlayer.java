package com.github.curriculeon.arcade.games.cardgames.twentyone;

import com.github.curriculeon.arcade.ArcadeAccount;
import com.github.curriculeon.arcade.PlayerInterface;
import com.github.curriculeon.utils.IOConsole;

public class TwentyOnePlayer implements PlayerInterface {
    private ArcadeAccount arcadeAccount;

    public TwentyOnePlayer(ArcadeAccount arcadeAccount) {
        this.arcadeAccount = arcadeAccount;
    }

    @Override
    public ArcadeAccount getArcadeAccount() {
        return arcadeAccount;
    }

    @Override
    public String play() {
        return new IOConsole().getStringInput("Your options are [ hit ], [ stand ], [ quit ]");
    }
}
