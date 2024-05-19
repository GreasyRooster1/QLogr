package core;

import java.util.ArrayList;
import java.util.Collection;

public abstract class FormatTemplate {
    private String prefix="";
    private String suffix="";

    private String logTypeSeparator="";
    private String timestampSeparator="";

    private Color seperatorColor = Color.RESET_ALL;
    private Color timestampColor = Color.RESET_ALL;
    private Color prefixColor = Color.RESET_ALL;
    private Color suffixColor = Color.RESET_ALL;

    private ArrayList<Color> logTypeColors = new ArrayList<>();
    private ArrayList<Color> messageColors = new ArrayList<>();

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

    public Color[] getLogTypeColors() {
        return logTypeColors;
    }

    public void setLogTypeColors(Color[] logTypeColors) {
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

    public Color[] getMessageColors() {
        return messageColors;
    }

    public void setMessageColors(Color[] messageColors) {
        this.messageColors = messageColors;
    }
}
