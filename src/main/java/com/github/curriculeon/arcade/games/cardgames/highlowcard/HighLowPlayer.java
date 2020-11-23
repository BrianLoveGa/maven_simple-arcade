package com.github.curriculeon.arcade.games.cardgames.highlowcard;

import com.github.curriculeon.arcade.ArcadeAccount;
import com.github.curriculeon.arcade.games.AbstractPlayer;

/**
 * Created by BWL on 11/20/2020.
 */

public class HighLowPlayer extends AbstractPlayer {
    public HighLowPlayer(ArcadeAccount arcadeAccount) {
        super(arcadeAccount);
    }

    @Override
    public String play() {
        return getIOConsole().getStringInput("Ace is the lowest (1) & King is highest (13) !! Let's Play \n " +
                " all number cards are their face value with Jacks  (11) and Queens  (12) ");
    }
}

