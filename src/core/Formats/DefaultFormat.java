package core.Formats;

import core.FormatTemplate;

import static core.Styling.Style.*;

public class DefaultFormat extends FormatTemplate {
    public DefaultFormat() {
        setPrefix("-");
        setSuffix(";");
        setLogTypeColors(new String[]{
                ""+BOLD+BG_BRIGHT_RED+BLACK,
                BG_RED+BLACK.toString(),
                RED.toString(),
                YELLOW.toString(),
                GREEN.toString(),
                MAGENTA.toString(),
        });
    }
}
