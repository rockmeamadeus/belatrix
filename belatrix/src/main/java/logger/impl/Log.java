package logger.impl;

import logger.enums.Level;

import java.util.ArrayList;
import java.util.List;

public class Log {

    private List<AbstractLogger> loggers = new ArrayList<>();

    public void append(AbstractLogger logger) {
        loggers.add(logger);
    }

    public void error(String message) {
        loggers.stream().
                filter(logger -> logger.isAllowed(Level.ERROR)).
                forEach(l -> l.handleError(message));
    }

    public void warning(String message) {
        loggers.stream().
                filter(logger -> logger.isAllowed(Level.WARNING)).
                forEach(l -> l.handleWarning(message));


    }

    public void info(String message) {
        loggers.stream().
                filter(logger -> logger.isAllowed(Level.INFO)).
                forEach(l -> l.handleInfo(message));
    }

}
