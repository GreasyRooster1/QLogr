package core.Formats;

import core.FormatTemplate;

public class DefaultFormat extends FormatTemplate {
    public DefaultFormat() {
        setLogPrefix("-");
        setLogSuffix(";");
    }
}
