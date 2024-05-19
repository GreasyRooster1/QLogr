package core.Styling;

public enum Style {
    RESET_ALL("\u001B[0m"),

    BLINK("\u001B[5m"),

    ;

    private final String code;

    Style(String _code) {
        code=_code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code;
    }
}
