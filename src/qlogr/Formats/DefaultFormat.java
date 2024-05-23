package qlogr.Formats;

import qlogr.FormatTemplate;
import qlogr.Styling.Style;

public class DefaultFormat extends FormatTemplate {
    public DefaultFormat() {
        setLogTypeColors(new String[]{
                ""+ Style.BOLD+ Style.BG_BRIGHT_RED+ Style.BLACK,
                Style.BG_RED+ Style.BLACK.toString(),
                Style.RED.toString(),
                Style.YELLOW.toString(),
                Style.GREEN.toString(),
                Style.MAGENTA.toString(),
        });
        setMessageColors(new String[]{
                ""+ Style.BOLD+ Style.BRIGHT_RED,
                Style.BRIGHT_RED.toString(),
                Style.RED.toString(),
                Style.BRIGHT_WHITE.toString(),
                Style.WHITE.toString(),
                Style.BRIGHT_BLACK.toString(),
        });
        setLogTypeSeparator("]: ");
        setPrefix("[");
        setTimestampSeparator(" | ");
        setTimestampColor(Style.CYAN);
    }
}
