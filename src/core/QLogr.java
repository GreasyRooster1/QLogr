package core;

public class QLogr {
    private static int logLevel = 5;

    public static void info(String msg) {
        LogHandler.logMessage(msg,LogType.INFO,logLevel);
    }
    public static void warn(String msg) {
        LogHandler.logMessage(msg,LogType.WARNING,logLevel);
    }
    public static void err(String msg) {
        LogHandler.logMessage(msg,LogType.ERROR,logLevel);
    }

    public static int getLogLevel() {
        return logLevel;
    }

    public static void setLogLevel(int _logLevel) {
        logLevel = _logLevel;
    }
}
