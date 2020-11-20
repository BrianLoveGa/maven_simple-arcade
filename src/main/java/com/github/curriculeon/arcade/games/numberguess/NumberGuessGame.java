package com.github.curriculeon.arcade.games.numberguess;

import com.github.curriculeon.arcade.GameInterface;
import com.github.curriculeon.arcade.PlayerInterface;
import com.github.curriculeon.utils.AnsiColor;
import com.github.curriculeon.utils.IOConsole;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by leon on 7/21/2020.
 */
public class NumberGuessGame implements GameInterface<NumberGuessPlayer> {
    private final List<NumberGuessPlayer> players;

    public NumberGuessGame() {
        this(new ArrayList<>());
    }

    public NumberGuessGame(List<NumberGuessPlayer> players) {
        this.players = players;
    }

    @Override
    public List<NumberGuessPlayer> getPlayerList() {
        return players;
    }

    @Override
    public void run() {
        IOConsole console = new IOConsole(AnsiColor.RED);
        List<PlayerInterface> winnerList = new ArrayList<>();
        Integer mysteryNumber = ThreadLocalRandom.current().nextInt(0, 10);
        for (PlayerInterface player : players) {
            Integer numberGuessedByPlayer = player.play();
            if (numberGuessedByPlayer == mysteryNumber) {
                winnerList.add(player);
            }
        }
        console.println("The following is a list of players who guessed the correct value:");
        console.println(winnerList.toString());
    }
}