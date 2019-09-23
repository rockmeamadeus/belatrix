package logger.impl;

import logger.ILogger;
import logger.enums.Level;

public abstract class AbstractLogger implements ILogger {

    Level level;

    public AbstractLogger(Level level) {
        this.level = level;
    }

    public boolean isAllowed(Level level) {
        return this.level.getValue() <= level.getValue();
    }

}
