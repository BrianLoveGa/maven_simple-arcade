package com.github.curriculeon;

import com.github.curriculeon.arcade.ArcadeAccount;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

    public void setup(){
        String testName = "testName";
        String password = "pass";
        ArcadeAccount testAccount = new ArcadeAccount( testName, password);
    }

    @Test
    public void testCreateAccountName(){
        /// given
        String testName = "testName";
        String password = "pass";

        /// when
        ArcadeAccount testAccount = new ArcadeAccount( testName, password);

        /// then
        String check = testAccount.getAccountName();
        Assert.assertEquals(testName, check);
    }


    @Test
    public void testCreateAccountPassword(){

        // given
        // when
        //   setup();

        String testName = "testName";
        String password = "pass";
        ArcadeAccount testAccount = new ArcadeAccount( testName, password);

        // then
        String passwordCheck = testAccount.getAccountPassword();
        Assert.assertEquals(passwordCheck,password);
        
    }

}
