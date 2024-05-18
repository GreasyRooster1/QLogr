package core;

public class QLogr {
    private int logLevel = 0;

    public static void info(String msg) {
        System.out.println(msg);
    }
    public static void warn(String msg) {
        System.out.println(msg);
    }
    public static void err(String msg) {
        System.out.println(msg);
    }

    public int getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(int logLevel) {
        this.logLevel = logLevel;
    }
}
