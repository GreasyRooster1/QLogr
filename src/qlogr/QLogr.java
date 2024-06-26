package qlogr;

public class QLogr {
    private static int logLevel = 5;
    private static boolean outputToFile = false;

    public static void debug(String msg) {
        LogHandler.logMessage(msg,LogType.DEBUG,logLevel);
    }
    public static void info(String msg) {
        LogHandler.logMessage(msg,LogType.INFO,logLevel);
    }
    public static void warn(String msg) {
        LogHandler.logMessage(msg,LogType.WARNING,logLevel);
    }
    public static void err(String msg) {
        LogHandler.logMessage(msg,LogType.ERROR,logLevel);
    }
    public static void critical(String msg) {
        LogHandler.logMessage(msg,LogType.CRITICAL,logLevel);
    }
    public static void fatal(String msg) {
        LogHandler.logMessage(msg,LogType.FATAL,logLevel);
    }
    public static void trace(String msg) {
        LogHandler.stackTrace(msg);
    }

    public static int getLogLevel() {
        return logLevel;
    }

    public static void setLogLevel(int _logLevel) {
        logLevel = _logLevel;
    }

    public static boolean outputToFile() {
        return outputToFile;
    }

    public static void enableFileOutput(String path) {
        outputToFile = true;
        FileHandler.setOutputFilePath(path);
        FileHandler.createLogFile();
        info("Bound logs to "+path);
    }

    public static void disableFileOutput() {
        outputToFile = false;
    }
}
