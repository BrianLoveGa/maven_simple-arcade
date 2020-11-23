package com.github.curriculeon.arcade.games.cardgames.twentyone;
import com.github.curriculeon.arcade.games.AbstractGame;
import com.github.curriculeon.arcade.games.PlayerInterface;
import com.github.curriculeon.arcade.games.cardgames.utils.Card;
import com.github.curriculeon.arcade.games.cardgames.utils.Deck;
import com.github.curriculeon.utils.AnsiColor;
import com.github.curriculeon.utils.IOConsole;



/**
 * Created by BWL on 11/20/2020.
 */

public class TwentyOne extends AbstractGame<TwentyOnePlayer> {

    private final Deck deck = new Deck();



    @Override
    public void run() {
        IOConsole console = getIOConsole(AnsiColor.YELLOW);
        String userInput = null;
        int handsWon = 0;
        int handsLost = 0;
        do {
            deck.shuffle();
            Card playerFirstCard = deck.pop();
            Card playerSecondCard = deck.pop();
            Card dealerFirstCard = deck.pop();
            Card dealerSecondCard = deck.pop();
            Card nextCard = deck.pop();
            Card secondNextCard = deck.pop();
            Card thirdNextCard = deck.pop();
            Card fourthNextCard = deck.pop();
            Card fifthNextCard = deck.pop();
            Card sixthNextCard = deck.pop();
            Card seventhNextCard = deck.pop();
            Card eighthNextCard = deck.pop();


            for (TwentyOnePlayer player : getPlayerList()) {
                console.println("Your current cards are [ %s ] & [ %s ]", playerFirstCard.toString(), playerSecondCard.toString());
                console.println("The dealer currently has [ %s ] & a card face down",dealerFirstCard.toString());
                console.println(player.getArcadeAccount().getName() +
                        "  Will you [hit] , or [stand] ? or you can  [quit]");

                userInput = player.play();

                boolean hasTwentyOne = playerFirstCard.getRank().getValue() + playerSecondCard.getRank().getValue() == 21;
                boolean hasTwentyOneAlt = playerFirstCard.getRank().getSecondaryValue() + playerSecondCard.getRank().getSecondaryValue() == 21;
                boolean hasTwentyOneAltAlt = playerFirstCard.getRank().getSecondaryValue() + playerSecondCard.getRank().getValue() == 21;
                boolean hasTwentyOneAltAlready = playerFirstCard.getRank().getValue() + playerSecondCard.getRank().getSecondaryValue() == 21;


                if(userInput.equalsIgnoreCase("hit")){
                    console.println("your next card is [ %s ] ", nextCard) ;
                    console.println("You now have  [ %s ] & [%s] & [%s]", playerFirstCard.toString(),playerSecondCard.toString(),nextCard.toString() );
                    String afterHitInput = player.play();
                    console.println("  Will you [hit] , or [stand] ?");
                        if(afterHitInput.equalsIgnoreCase("hit")){
                            console.println("your next card is [ %s ] ", secondNextCard.toString()) ;
                            console.println("You now have  [ %s ] & [%s] & [%s] & [%s]", playerFirstCard.toString(),playerSecondCard.toString(),nextCard.toString(),secondNextCard.toString() );
                        }
                // } else if(userInput.equalsIgnoreCase("stand")){
                    console.println("You chose to stand with those cards");
                    console.println("Now it's the dealers turn");
                    if(dealerFirstCard.getRank().getValue() + dealerSecondCard.getRank().getValue() >= 16){
                        // dealer should stand
                    } else if (dealerFirstCard.getRank().getSecondaryValue() + dealerSecondCard.getRank().getSecondaryValue() >= 16){
                        // dealer should stand
                    }

              //  } else{

                }

            } console.println("Your score is _-_ won :" +handsWon+" lost :" +handsLost);


        } while (!"quit".equalsIgnoreCase(userInput));
    }
}