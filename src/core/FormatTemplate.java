package core;

public abstract class FormatTemplate {
    private String logPrefix;
    private String logSuffix;

    public String getLogPrefix() {
        return logPrefix;
    }

    public void setLogPrefix(String logPrefix) {
        this.logPrefix = logPrefix;
    }

    public String getLogSuffix() {
        return logSuffix;
    }

    public void setLogSuffix(String logSuffix) {
        this.logSuffix = logSuffix;
    }
}
