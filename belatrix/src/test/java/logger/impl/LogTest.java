package logger.impl;

import jdk.nashorn.internal.ir.annotations.Ignore;
import logger.enums.Level;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

@Ignore
class LogTest {

    @Test
    void error() {
        Log log = new Log();
        log.append(new ConsoleLogger(Level.ERROR));
        log.append(new FileLogger(Level.ERROR));
        log.append(new DBLogger(Level.ERROR));

        log.error("ERROR message!");
        log.info("INFO message!");
        log.warning("WARNING message!");
    }

    @Test
    void warning() {
        Log log = new Log();
        log.append(new ConsoleLogger(Level.WARNING));
        log.append(new FileLogger(Level.WARNING));
        log.append(new DBLogger(Level.WARNING));

        log.error("ERROR message!");
        log.info("INFO message!");
        log.warning("WARNING message!");
    }

    @Test
    void info() {
        Log log = new Log();
        log.append(new ConsoleLogger(Level.INFO));
        log.append(new FileLogger(Level.INFO));
        log.append(new DBLogger(Level.INFO));

        log.error("ERROR message!");
        log.info("INFO message!");
        log.warning("WARNING message!");
    }
}