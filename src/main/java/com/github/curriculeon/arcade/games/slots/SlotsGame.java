package com.github.curriculeon.arcade.games.slots;

import com.github.curriculeon.arcade.games.AbstractGame;
import com.github.curriculeon.arcade.games.GameInterface;
import com.github.curriculeon.arcade.games.PlayerInterface;
import com.github.curriculeon.utils.IOConsole;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame extends AbstractGame<SlotsPlayer> {

    @Override
    public void run() {
        for (PlayerInterface player : getPlayerList()) {
            SlotsReelImage image1 = null;
            SlotsReelImage image2 = null;
            SlotsReelImage image3 = null;
            String userInput;
            do {
                userInput = player.play();
                if ("pull-lever".equalsIgnoreCase(userInput)) {
                    image1 = SlotsReelImage.getRandom();
                    image2 = SlotsReelImage.getRandom();
                    image3 = SlotsReelImage.getRandom();
                } else if ("view-slots".equalsIgnoreCase(userInput)) {
                    getIOConsole().println("|| %s || %s || %s ||", image1, image2, image3);
                } else if ("exit".equalsIgnoreCase(userInput)) {
                    break;
                }
            } while (!"exit".equalsIgnoreCase(userInput));
        }
    }
}