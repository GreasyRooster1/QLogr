package core;

import core.Styling.Color;

public abstract class FormatTemplate {
    private String prefix="";
    private String suffix="";

    private String logTypeSeparator="";
    private String timestampSeparator="";

    private Color seperatorColor = Color.RESET_ALL;
    private Color timestampColor = Color.RESET_ALL;
    private Color prefixColor = Color.RESET_ALL;
    private Color suffixColor = Color.RESET_ALL;

    private String[] logTypeColors = {Color.RESET_ALL.toString(),Color.RESET_ALL.toString(),Color.RESET_ALL.toString(),Color.RESET_ALL.toString(),Color.RESET_ALL.toString(),Color.RESET_ALL.toString()};
    private String[] messageColors = {Color.RESET_ALL.toString(),Color.RESET_ALL.toString(),Color.RESET_ALL.toString(),Color.RESET_ALL.toString(),Color.RESET_ALL.toString(),Color.RESET_ALL.toString()};

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

    public String[] getLogTypeColors() {
        return logTypeColors;
    }

    public void setLogTypeColors(String[] logTypeColors) {
        this.logTypeColors = logTypeColors;
    }

    public Color getPrefixColor() {
        return prefixColor;
    }

    public void setPrefixColor(Color prefixColor) {
        this.prefixColor = prefixColor;
    }

    public Color getSuffixColor() {
        return suffixColor;
    }
    public void setSuffixColor(Color suffixColor) {
        this.suffixColor = suffixColor;
    }

    public String[] getMessageColors() {
        return messageColors;
    }

    public void setMessageColors(String[] messageColors) {
        this.messageColors = messageColors;
    }
}
