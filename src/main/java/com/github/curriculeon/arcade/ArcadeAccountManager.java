package com.github.curriculeon.arcade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 7/21/2020.
 * `ArcadeAccountManager` stores, manages, and retrieves `ArcadeAccount` objects
 * it is advised that every instruction in this class is logged
 */
public class ArcadeAccountManager {
    private List<ArcadeAccount> arcadeAccountList;

    public ArcadeAccountManager() {
        this(new ArrayList<>());
    }

    public ArcadeAccountManager(ArcadeAccount... arcadeAccounts) {
        this(Arrays.asList(arcadeAccounts));
    }


    public ArcadeAccountManager(List<ArcadeAccount> arcadeAccountList) {
        this.arcadeAccountList = arcadeAccountList;
    }

    /**
     * @param accountName     name of account to be returned
     * @param accountPassword password of account to be returned
     * @return `ArcadeAccount` with specified `accountName` and `accountPassword`
     */
    public ArcadeAccount getAccount(String accountName, String accountPassword) {
        return arcadeAccountList
                .stream()
                .filter(account -> {
                    String currentAccountName = account.getName();
                    String currentAccountPassword = account.getPassword();
                    boolean validName = currentAccountName.equals(accountName);
                    boolean validPassword = currentAccountPassword.equals(accountPassword);
                    boolean validLogin = validName && validPassword;
                    return validLogin;
                })
                .findFirst()
                .get();
    }

    /**
     * logs & creates a new `ArcadeAccount`
     *
     * @param accountName     name of account to be created
     * @param accountPassword password of account to be created
     * @return new instance of `ArcadeAccount` with specified `accountName` and `accountPassword`
     */
    public ArcadeAccount createAccount(String accountName, String accountPassword) {
        return new ArcadeAccount(accountName, accountPassword);
    }

    /**
     * logs & registers a new `ArcadeAccount` to `this.getArcadeAccountList()`
     *
     * @param arcadeAccount the arcadeAccount to be added to `this.getArcadeAccountList()`
     */
    public void registerAccount(ArcadeAccount arcadeAccount) {
        arcadeAccountList.add(arcadeAccount);
    }
}
