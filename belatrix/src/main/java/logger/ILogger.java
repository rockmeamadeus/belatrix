package logger;

public interface ILogger {

    void handleError(final String message);

    void handleInfo(final String message);

    void handleWarning(final String message);
}
