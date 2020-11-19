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
        System.out.println("Account Name Test Passed");
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
        System.out.println("Account Password Test Passed");

    }

    @Test
    public void testChangeAccountName(){
        // given
        String testName = "testName";
        String password = "pass";
        ArcadeAccount testAccount = new ArcadeAccount( testName, password);
        Assert.assertEquals(testName, testAccount.getAccountName());
        // when
        String newName = "somethingNew";
        testAccount.setAccountName(newName);
        // then
        Assert.assertEquals(newName, testAccount.getAccountName());
        System.out.println("Account change name Test Passed");

    }


    @Test
    public void testChangeAccountPassword(){
        // given
        String testName = "testName";
        String password = "pass";
        ArcadeAccount testAccount = new ArcadeAccount( testName, password);
        Assert.assertEquals(password, testAccount.getAccountPassword());
        // when
        String newPass = "somethingNew";
        testAccount.setAccountPassword(newPass);
        // then
        Assert.assertEquals(newPass, testAccount.getAccountPassword());
        System.out.println("Account change password Test Passed");
    }
}
