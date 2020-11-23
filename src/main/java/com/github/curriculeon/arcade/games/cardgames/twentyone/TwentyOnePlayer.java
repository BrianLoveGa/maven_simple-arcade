package com.github.curriculeon.arcade.games.cardgames.twentyone;

import com.github.curriculeon.arcade.ArcadeAccount;
import com.github.curriculeon.arcade.games.AbstractPlayer;
import com.github.curriculeon.arcade.games.PlayerInterface;
import com.github.curriculeon.utils.IOConsole;

public class TwentyOnePlayer extends AbstractPlayer {


    public TwentyOnePlayer(ArcadeAccount arcadeAccount) {
        super(arcadeAccount);
    }


    @Override
    public String play() {
        return new IOConsole().getStringInput("Your options are [ hit ], [ stand ], [ quit ]");
    }
}
