package com.github.curriculeon;


import com.github.curriculeon.account.AccountTest;
import com.github.curriculeon.highlowgame.GetWinnerListTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        // com.github.curriculeon.redorbackgame.GetWinnerListTest.class, //red or black
        // com.github.curriculeon.highlowgame.GetWinnerListTest.class, //high low
        // com.github.curriculeon.numberguessgame.GetWinnerListTest.class, // number guess
        AccountTest.class
})

public class FullTestSuite {
}
