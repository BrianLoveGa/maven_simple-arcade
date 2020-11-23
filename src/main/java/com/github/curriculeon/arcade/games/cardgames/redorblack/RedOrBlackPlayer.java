package com.github.curriculeon.arcade.games.cardgames.redorblack;

import com.github.curriculeon.arcade.ArcadeAccount;
import com.github.curriculeon.arcade.games.AbstractPlayer;


public class RedOrBlackPlayer extends AbstractPlayer {
    public RedOrBlackPlayer(ArcadeAccount arcadeAccount) {
        super(arcadeAccount);
    }

    @Override
    public String play() {
        return getIOConsole().getStringInput("Your options are [ red ], [ black ], [ quit ]");
    }
}
