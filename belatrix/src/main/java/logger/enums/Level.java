package logger.enums;

public enum Level {

    INFO(0),

    WARNING(1),

    ERROR(2);

    int value;

    public int getValue() {
        return value;
    }

    Level(int value) {
        this.value = value;
    }
}
