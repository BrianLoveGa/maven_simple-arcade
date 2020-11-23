package com.github.curriculeon.arcade.games.cardgames.highlowcard;

import com.github.curriculeon.arcade.games.AbstractGame;
import com.github.curriculeon.arcade.games.cardgames.utils.Card;
import com.github.curriculeon.arcade.games.cardgames.utils.Deck;
import com.github.curriculeon.utils.AnsiColor;
import com.github.curriculeon.utils.IOConsole;



/**
 * Created by BWL on 11/20/2020.
 */

public class HighLowCardGame extends AbstractGame<HighLowPlayer> {

    private final Deck deck = new Deck();

    @Override
    public void run() {
        IOConsole console = getIOConsole(AnsiColor.YELLOW);
        String userInput = null;
        int good = 0;
        int bad = 0;
        do {
            deck.shuffle();
            Card card = deck.pop();
            for (HighLowPlayer player : getPlayerList()) {
                console.println("The value of the current card is [ %s ]", card.toString());
                console.println(player.getArcadeAccount().getName() +
                        "  Will the next card be [higher] , or [lower] ? or you can  [quit]");
                userInput = player.play();
                Card nextCard = deck.pop();
                boolean cardIsHigher = card.getRank().getValue()<=nextCard.getRank().getValue();
                boolean cardIsLower = card.getRank().getValue()>=nextCard.getRank().getValue();
                if(userInput.equalsIgnoreCase("higher") && cardIsHigher){
                    console.println("you guessed correct");
                    console.println("The value of the next card  [ %s ] was higher than [%s]", nextCard.toString(), card.toString());
                    getWinnerList().add(player);
                    good++;
                } else if (userInput.equalsIgnoreCase("lower") && cardIsLower){
                    console.println("you guessed correct");
                    console.println("The value of the next card  [ %s ] was lower than [%s]", nextCard.toString(), card.toString());
                    getWinnerList().add(player);
                    good++;
                } else {
                    console.println("you guessed incorrect  :-( ");
                    console.println("The value of the next card  was [ %s ] ", nextCard.toString());
                    bad++;

                }

            } console.println("Your score is _-_ correct :" +good+" wrong :" +bad);
            console.println("The following is a list of winners:");
            console.println(getWinnerList().toString());


        } while (!"quit".equalsIgnoreCase(userInput));
    }
}