package com.github.curriculeon.arcade.games.slots;

import com.github.curriculeon.arcade.GameInterface;
import com.github.curriculeon.arcade.PlayerInterface;
import com.github.curriculeon.utils.IOConsole;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsGame implements GameInterface<SlotsPlayer> {
    private SlotsReelImage image1;
    private SlotsReelImage image2;
    private SlotsReelImage image3;
    private IOConsole console = new IOConsole();
    private List<SlotsPlayer> playerList;


    public SlotsGame() {
        this(new ArrayList<>());
    }

    public SlotsGame(List<SlotsPlayer> playerList) {
        this.playerList = playerList;
    }

    public void spin() {
        this.image1 = SlotsReelImage.getRandom();
        this.image2 = SlotsReelImage.getRandom();
        this.image3 = SlotsReelImage.getRandom();
    }

    @Override
    public List<SlotsPlayer> getPlayerList() {
        return playerList;
    }

    @Override
    public void run() {
        for (PlayerInterface player : playerList) {
            String userInput;
            do {
                userInput = player.play();
                switch (userInput.toLowerCase()) {
                    case "pull-lever":
                        spin();
                        break;

                    case "view-slots":
                        console.println("Results: || %s || %s || %s", image1, image2, image3);
                        break;

                    case "exit":
                        break;
                }
            } while (!"exit".equalsIgnoreCase(userInput));
        }
    }
}
