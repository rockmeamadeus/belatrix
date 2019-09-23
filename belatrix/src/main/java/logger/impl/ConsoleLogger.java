package logger.impl;

import logger.enums.Level;

public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(Level level) {
        super(level);
    }

    @Override
    public void handleError(String message) {
        System.out.println("[ERROR] printing error to console:" + message);
    }

    @Override
    public void handleInfo(String message) {
        System.out.println("[INFO] printing info to console:" + message);
    }

    @Override
    public void handleWarning(String message) {
        System.out.println("[WARNING] printing warning to console:" + message);
    }

}
