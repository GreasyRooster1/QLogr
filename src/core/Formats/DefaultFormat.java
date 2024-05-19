package core.Formats;

import core.Color;
import core.FormatTemplate;

public class DefaultFormat extends FormatTemplate {
    public DefaultFormat() {
        setPrefix("-");
        setSuffix(";");
        setMessageColor(Color.RED);
    }
}
