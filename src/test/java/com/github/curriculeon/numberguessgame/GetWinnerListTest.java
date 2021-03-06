package com.github.curriculeon.numberguessgame;

import com.github.curriculeon.arcade.ArcadeAccount;
import com.github.curriculeon.arcade.games.numberguess.NumberGuessGame;
import com.github.curriculeon.arcade.games.numberguess.NumberGuessPlayer;
import com.github.curriculeon.utils.AnsiColor;
import com.github.curriculeon.utils.IOConsole;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.List;

public class GetWinnerListTest {


    /// number is changing after peeking before guessing....
    @Test
    public void testNotAWinner() {
        // given
        NumberGuessGame numberGuessGame = new NumberGuessGame();
        numberGuessGame.setup();
        Integer mysteryNumber = numberGuessGame.getMysteryNumber();
        ArcadeAccount arcadeAccount = new ArcadeAccount("leon", "hunter");
        NumberGuessPlayer numberGuessPlayer = new NumberGuessPlayer(arcadeAccount) {
            @Override
            public IOConsole getIOConsole() {
                String userInput = mysteryNumber.toString();
                byte[] inputBytes = userInput.getBytes();
                ByteArrayInputStream inputByteArray = new ByteArrayInputStream(inputBytes);
                return new IOConsole(AnsiColor.AUTO, inputByteArray, System.out) {
                    @Override
                    public String getStringInput(String prompt, Object... args) {
                        new IOConsole().println(userInput);
                        return super.getStringInput(prompt, args);
                    }
                };
            }
        };
        numberGuessGame.add(numberGuessPlayer);
        List<NumberGuessPlayer> winnerList = numberGuessGame.getWinnerList();
        Assert.assertFalse(winnerList.contains(numberGuessPlayer));
        numberGuessGame.run();

        // when
        winnerList = numberGuessGame.getWinnerList();

        // then
        Assert.assertFalse(winnerList.contains(numberGuessPlayer));
    }
}