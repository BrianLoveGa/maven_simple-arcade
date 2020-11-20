package com.github.curriculeon.arcade.games.cardgames.redorblack;

import com.github.curriculeon.arcade.ArcadeAccount;
import com.github.curriculeon.arcade.PlayerInterface;
import com.github.curriculeon.utils.IOConsole;

public class RedOrBlackPlayer implements PlayerInterface {
    private ArcadeAccount arcadeAccount;

    public RedOrBlackPlayer(ArcadeAccount arcadeAccount) {
        this.arcadeAccount = arcadeAccount;
    }

    @Override
    public ArcadeAccount getArcadeAccount() {
        return arcadeAccount;
    }

    @Override
    public String play() {
        return new IOConsole().getStringInput("Your options are [ red ], [ black ], [ quit ]");
    }
}
