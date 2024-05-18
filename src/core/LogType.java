package core;

public enum LogType {
    DEBUG(5,"Debug"),
    INFO(4, "Info"),
    WARNING(3, "Warn"),
    ERROR(2, "Error"),
    CRITICAL(1, "Critical"),
    FATAL(0, "Fatal");


    public final int level;
    public final String label;

    LogType(int _level, String _label) {
        level = _level;
        label = _label;
    }

    public int getLevel() {
        return level;
    }
    public String getLabel() {
        return label;
    }
}
