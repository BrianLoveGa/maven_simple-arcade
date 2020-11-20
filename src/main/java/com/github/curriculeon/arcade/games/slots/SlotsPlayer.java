package com.github.curriculeon.arcade.games.slots;

import com.github.curriculeon.arcade.ArcadeAccount;
import com.github.curriculeon.arcade.PlayerInterface;
import com.github.curriculeon.utils.IOConsole;

import java.util.StringJoiner;

/**
 * Created by leon on 7/21/2020.
 */
public class SlotsPlayer implements PlayerInterface {
    ArcadeAccount arcadeAccount;

    public SlotsPlayer(ArcadeAccount arcadeAccount) {
        this.arcadeAccount = arcadeAccount;
    }

    @Override
    public ArcadeAccount getArcadeAccount() {
        return arcadeAccount;
    }

    @Override
    public String play() {
        return new IOConsole().getStringInput(String.format(new StringJoiner("\n")
                .add("[ %s ] it's your turn!")
                .add("From here you can select any of the following options:")
                .add("[ pull-lever ], [ view-slots ], [ exit ]")
                .toString(), arcadeAccount.getName()));
    }
}