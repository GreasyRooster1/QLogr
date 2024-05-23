package java;

import java.Styling.Style;

import static java.Styling.Style.*;

public abstract class FormatTemplate {
    private String prefix="";
    private String suffix="";

    private String logTypeSeparator="";
    private String timestampSeparator="";

    private Style seperatorStyle = RESET_ALL;
    private Style timestampStyle = RESET_ALL;
    private Style prefixStyle = Style.RESET_ALL;
    private Style suffixStyle = Style.RESET_ALL;

    private String[] logTypeColors = {Style.RESET_ALL.toString(), Style.RESET_ALL.toString(), Style.RESET_ALL.toString(), Style.RESET_ALL.toString(), Style.RESET_ALL.toString(), Style.RESET_ALL.toString()};
    private String[] messageColors = {Style.RESET_ALL.toString(), Style.RESET_ALL.toString(), Style.RESET_ALL.toString(), Style.RESET_ALL.toString(), Style.RESET_ALL.toString(), Style.RESET_ALL.toString()};

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

    public Style getSeperatorColor() {
        return seperatorStyle;
    }

    public void setSeperatorColor(Style seperatorStyle) {
        this.seperatorStyle = seperatorStyle;
    }

    public Style getTimestampColor() {
        return timestampStyle;
    }

    public void setTimestampColor(Style timestampStyle) {
        this.timestampStyle = timestampStyle;
    }

    public String[] getLogTypeColors() {
        return logTypeColors;
    }

    public void setLogTypeColors(String[] logTypeColors) {
        this.logTypeColors = logTypeColors;
    }

    public Style getPrefixColor() {
        return prefixStyle;
    }

    public void setPrefixColor(Style prefixStyle) {
        this.prefixStyle = prefixStyle;
    }

    public Style getSuffixColor() {
        return suffixStyle;
    }
    public void setSuffixColor(Style suffixStyle) {
        this.suffixStyle = suffixStyle;
    }

    public String[] getMessageColors() {
        return messageColors;
    }

    public void setMessageColors(String[] messageColors) {
        this.messageColors = messageColors;
    }
}
