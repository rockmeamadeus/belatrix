package logger.impl;

import logger.enums.Level;

public class FileLogger extends AbstractLogger {

    public FileLogger(Level level) {
        super(level);
    }

    @Override
    public void handleError(String message) {
        System.out.println("[ERROR] saving error to file:" + message);
    }

    @Override
    public void handleInfo(String message) {
        System.out.println("[INFO] saving info to file:" + message);
    }

    @Override
    public void handleWarning(String message) {
        System.out.println("[WARNING] saving warning to file:" + message);
    }
}
