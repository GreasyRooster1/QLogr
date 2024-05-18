package core;

public class QLogr {
    private static int logLevel = 0;

    public static void info(String msg) {
        LogHandler.logMessage(msg,LogType.INFO,logLevel);
    }
    public static void warn(String msg) {
        LogHandler.logMessage(msg,LogType.WARNING,logLevel);
    }
    public static void err(String msg) {
        LogHandler.logMessage(msg,LogType.ERROR,logLevel);
    }

    public int getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(int logLevel) {
        this.logLevel = logLevel;
    }
}
