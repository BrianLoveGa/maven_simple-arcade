package com.github.curriculeon.account;

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
        String check = testAccount.getName();
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
        String passwordCheck = testAccount.getPassword();
        Assert.assertEquals(passwordCheck,password);
        System.out.println("Account Password Test Passed");

    }

    @Test
    public void testChangeAccountName(){
        // given
        String testName = "testName";
        String password = "pass";
        ArcadeAccount testAccount = new ArcadeAccount( testName, password);
        Assert.assertEquals(testName, testAccount.getName());
        // when
        String newName = "somethingNew";
        testAccount.setName(newName);
        // then
        Assert.assertEquals(newName, testAccount.getName());
        System.out.println("Account change name Test Passed");

    }


    @Test
    public void testChangeAccountPassword(){
        // given
        String testName = "testName";
        String password = "pass";
        ArcadeAccount testAccount = new ArcadeAccount( testName, password);
        Assert.assertEquals(password, testAccount.getPassword());
        // when
        String newPass = "somethingNew";
        testAccount.setPassword(newPass);
        // then
        Assert.assertEquals(newPass, testAccount.getPassword());
        System.out.println("Account change password Test Passed");
    }

    @Test // (expected = NullPointerException.class)
    public void testNullName(){
        // given
        String nullName = null;
        String nullPass = null;

        // when
        ArcadeAccount badAccount = new ArcadeAccount(nullName, nullPass);

        // then
        Assert.assertNull(badAccount.getName());
        System.out.println("Account null name Test Passed");
    }

    @Test // (expected = NullPointerException.class)
    public void testNullPassword(){
        // given
        String nullName = null;
        String nullPass = null;

        // when
        ArcadeAccount badAccount = new ArcadeAccount(nullName, nullPass);

        // then
        Assert.assertNull(badAccount.getPassword());
        System.out.println("Account null password Test Passed");
    }

}
