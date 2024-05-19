package core.Formats;

import core.FormatTemplate;

import static core.Styling.Style.*;

public class DefaultFormat extends FormatTemplate {
    public DefaultFormat() {
        setPrefix("-");
        setSuffix(";");
        setLogTypeColors(new String[]{
                BG_RED+BLACK.toString(),
                BRIGHT_RED.toString(),
                RED.toString(),
                YELLOW.toString(),
                GREEN.toString(),
                MAGENTA.toString(),
        });
    }
}
