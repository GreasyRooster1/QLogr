package core;

public abstract class FormatTemplate {
    private String prefix;
    private String suffix;

    private String logTypeSeparator;
    private String timestampSeparator;

    private Color seperatorColor;
    private Color timestampColor;
    private Color messageColor;
    private Color[] logTypeColors;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public String getLogTypeSeparator() {
        return logTypeSeparator;
    }

    public void setLogTypeSeparator(String logTypeSeparator) {
        this.logTypeSeparator = logTypeSeparator;
    }

    public String getTimestampSeparator() {
        return timestampSeparator;
    }

    public void setTimestampSeparator(String timestampSeparator) {
        this.timestampSeparator = timestampSeparator;
    }

    public Color getSeperatorColor() {
        return seperatorColor;
    }

    public void setSeperatorColor(Color seperatorColor) {
        this.seperatorColor = seperatorColor;
    }

    public Color getTimestampColor() {
        return timestampColor;
    }

    public void setTimestampColor(Color timestampColor) {
        this.timestampColor = timestampColor;
    }

    public Color getMessageColor() {
        return messageColor;
    }

    public void setMessageColor(Color messageColor) {
        this.messageColor = messageColor;
    }

    public Color[] getLogTypeColors() {
        return logTypeColors;
    }

    public void setLogTypeColors(Color[] logTypeColors) {
        this.logTypeColors = logTypeColors;
    }
}
