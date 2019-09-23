package logger.impl;

import logger.enums.Level;

public class DBLogger extends AbstractLogger {

    public DBLogger(Level level) {
        super(level);
    }

    @Override
    public void handleError(String message) {
        System.out.println("[ERROR] saving error to database:" + message);
    }

    @Override
    public void handleInfo(String message) {
        System.out.println("[INFO] saving info to database:" + message);
    }

    @Override
    public void handleWarning(String message) {
        System.out.println("[WARNING] saving warning to database:" + message);
    }
}
