package com.github.curriculeon.arcade.games.numberguess;

import com.github.curriculeon.arcade.games.AbstractGame;
import com.github.curriculeon.arcade.games.GameInterface;
import com.github.curriculeon.arcade.games.PlayerInterface;
import com.github.curriculeon.utils.AnsiColor;
import com.github.curriculeon.utils.IOConsole;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by leon on 7/21/2020.
 */
public class NumberGuessGame extends AbstractGame<NumberGuessPlayer> {
    private int mysteryNumber;

    @Override
    public void setup() {
        this.mysteryNumber = ThreadLocalRandom.current().nextInt(0, 10);
    }

    @Override
    public void run() {
        IOConsole console = getIOConsole(AnsiColor.GREEN);
        String guessInput = "";
        int good = 0;
        int bad = 0;
        do {
            List<String> winnerList = new ArrayList<>();
            int mysteryNumber = ThreadLocalRandom.current().nextInt(0, 10);
            for (NumberGuessPlayer player : getPlayerList()) {
                guessInput = player.play();

                String x = String.valueOf(mysteryNumber);
                if (guessInput.equals(x)) {
                    console.println("You guessed the number :-) !! ");
                    winnerList.add(player.getArcadeAccount().getName());
                    good++;
                } else {
                    console.println("you did not guess the number :-( ");
                    bad++;
                }
            }
            console.println("the mystery number was : " + mysteryNumber + " !");
            console.println("The following is a list of players who guessed the correct value:");
            console.println(winnerList.toString());
            console.println("correct = " + good + "  incorrect = " + bad);

        } while (!"quit".equalsIgnoreCase(guessInput));
    }

    public int getMysteryNumber() {
        return mysteryNumber;
    }
}
