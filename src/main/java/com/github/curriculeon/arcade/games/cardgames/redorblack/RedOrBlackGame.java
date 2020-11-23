package com.github.curriculeon.arcade.games.cardgames.redorblack;

import com.github.curriculeon.arcade.games.AbstractGame;
import com.github.curriculeon.arcade.games.GameInterface;
import com.github.curriculeon.arcade.games.PlayerInterface;
import com.github.curriculeon.arcade.games.cardgames.utils.Card;
import com.github.curriculeon.arcade.games.cardgames.utils.Deck;
import com.github.curriculeon.utils.AnsiColor;
import com.github.curriculeon.utils.IOConsole;

import java.util.ArrayList;
import java.util.List;

public class RedOrBlackGame extends AbstractGame<RedOrBlackPlayer> {
    private final Deck deck = new Deck();

    @Override
    public void run() {
        IOConsole console = getIOConsole(AnsiColor.CYAN);
        String userInput = null;
        int good = 0;
        int bad = 0;
        do {
            deck.shuffle();
            Card card = deck.pop();
            for (RedOrBlackPlayer player : getPlayerList()) {
                userInput = player.play();
                boolean userInputIsRed = "red".equalsIgnoreCase(userInput);
                boolean userInputIsBlack = "black".equalsIgnoreCase(userInput);
                boolean userInputIsValid = userInputIsRed || userInputIsBlack;
                boolean cardIsRed = card.isRed();
                boolean userIsCorrectAboutRed = cardIsRed && userInputIsRed;
                boolean userIsCorrectAboutBlack = (!cardIsRed) && userInputIsBlack;
                boolean userIsCorrect = userIsCorrectAboutBlack || userIsCorrectAboutRed;

                if (userInputIsValid) {
                    if (userIsCorrect) {
                        console.println("You were correct!");
                        getWinnerList().add(player);
                        good++;
                    } else {
                        console.println("You were incorrect!");
                        bad++;
                    }
                    console.println("The value of the card was [ %s ]", card.toString());
                    console.println("The following is a list of winners:");
                    console.println(getWinnerList().toString());
                    console.println("# correct " + good + "  number wrong : " + bad);
                }
            }
            deck.push(card);
        } while (!"quit".equalsIgnoreCase(userInput));
    }
}
