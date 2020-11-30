package com.github.curriculeon.redorbackgame;

import com.github.curriculeon.arcade.ArcadeAccount;
import com.github.curriculeon.arcade.games.cardgames.redorblack.RedOrBlackGame;
import com.github.curriculeon.arcade.games.cardgames.redorblack.RedOrBlackPlayer;
import com.github.curriculeon.arcade.games.cardgames.utils.Card;
import com.github.curriculeon.arcade.games.cardgames.utils.Deck;
import com.github.curriculeon.arcade.games.cardgames.utils.Rank;
import com.github.curriculeon.arcade.games.cardgames.utils.Suit;
import com.github.curriculeon.utils.AnsiColor;
import com.github.curriculeon.utils.IOConsole;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;


public class GetWinnerListTest {
//    @Test
//    public void CorrectRedAndBlackWinnerListTest() {
//        // given
//        Deck deck = new Deck();
//        RedOrBlackGame redOrBlackGame = new RedOrBlackGame(deck);
//        redOrBlackGame.setup();
//        RedOrBlackPlayer redOrBlackPlayer = new RedOrBlackPlayer(new ArcadeAccount("M", "1")) {
//            @Override
//            public IOConsole getIOConsole(AnsiColor color, InputStream inputStream, PrintStream printStream) {
//                String userInput = redOrBlackGame.getCard().getSuit().getColor();
//                byte[] inputBytes = userInput.getBytes();
//                ByteArrayInputStream inputByteArray = new ByteArrayInputStream(inputBytes);
//                return new IOConsole(color, inputByteArray, printStream) {
//                    @Override
//                    public String getStringInput(String prompt, Object... args) {
//                        new IOConsole().println(userInput);
//                        return super.getStringInput(prompt, args);
//                    }
//                };
//            }
//        };
//        redOrBlackGame.add(redOrBlackPlayer);
//        List<RedOrBlackPlayer> actualWinners = redOrBlackGame.getWinnerList();
//        Assert.assertFalse(actualWinners.contains(redOrBlackPlayer));
//        redOrBlackGame.run();
//        redOrBlackGame.tearDown();
//        // when
//        actualWinners = redOrBlackGame.getWinnerList();
//
//        // then
//        Assert.assertTrue(actualWinners.contains(redOrBlackPlayer));
//    }

//    @Test
//    public void IncorrectRedAndBlackWinnerListTest() {
//        // given
//        Deck deck = new Deck();
//        RedOrBlackGame redOrBlackGame = new RedOrBlackGame(deck);
//        redOrBlackGame.setup();
//        RedOrBlackPlayer redOrBlackPlayer = new RedOrBlackPlayer(new ArcadeAccount("M", "1")) {
//            @Override
//            public IOConsole getIOConsole(AnsiColor color, InputStream inputStream, PrintStream printStream) {
//                String userInput = redOrBlackGame.getCard().getSuit().getColor();
//                String oppositeInput = userInput == "red"? "black" : "red";
//                byte[] inputBytes = oppositeInput.getBytes();
//                ByteArrayInputStream inputByteArray = new ByteArrayInputStream(inputBytes);
//                return new IOConsole(color, inputByteArray, printStream) {
//                    @Override
//                    public String getStringInput(String prompt, Object... args) {
//                        new IOConsole().println(oppositeInput);
//                        return super.getStringInput(prompt, args);
//                    }
//                };
//            }
//        };
//        redOrBlackGame.add(redOrBlackPlayer);
//        List<RedOrBlackPlayer> actualWinners = redOrBlackGame.getWinnerList();
//        Assert.assertFalse(actualWinners.contains(redOrBlackPlayer));
//        redOrBlackGame.run();
//        redOrBlackGame.tearDown();
//        // when
//        actualWinners = redOrBlackGame.getWinnerList();
//
//        // then
//        Assert.assertFalse(actualWinners.contains(redOrBlackPlayer));
//    }
}