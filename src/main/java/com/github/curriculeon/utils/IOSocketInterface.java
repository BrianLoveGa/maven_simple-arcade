package com.github.curriculeon.utils;

import java.io.InputStream;
import java.io.PrintStream;

public interface IOSocketInterface {
    default IOConsole getIOConsole() {
        return new IOConsole();
    }

    default IOConsole getIOConsole(AnsiColor color) {
        return new IOConsole(color);
    }

    default IOConsole getIOConsole(AnsiColor color, InputStream inputStream, PrintStream outPutStream) {
        return new IOConsole(color, inputStream, outPutStream);
    }
}
