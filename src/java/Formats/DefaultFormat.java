package java.Formats;

import java.FormatTemplate;

import static java.Styling.Style.*;

public class DefaultFormat extends FormatTemplate {
    public DefaultFormat() {
        setLogTypeColors(new String[]{
                ""+BOLD+BG_BRIGHT_RED+BLACK,
                BG_RED+BLACK.toString(),
                RED.toString(),
                YELLOW.toString(),
                GREEN.toString(),
                MAGENTA.toString(),
        });
        setMessageColors(new String[]{
                ""+BOLD+BRIGHT_RED,
                BRIGHT_RED.toString(),
                RED.toString(),
                BRIGHT_WHITE.toString(),
                WHITE.toString(),
                BRIGHT_BLACK.toString(),
        });
        setLogTypeSeparator("]: ");
        setPrefix("[");
        setTimestampSeparator(" | ");
        setTimestampColor(CYAN);
    }
}
