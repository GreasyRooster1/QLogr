package core;

public enum Color {
    RESET_ALL("\u001B[0m"),
    RESET_FG("\u001B[39m"),
    RESET_BG("\u001B[49m"),

    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    MAGENTA("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m"),
    BRIGHT_BLACK("\u001B[38m"),
    BRIGHT_RED("\u001B[39m"),
    BRIGHT_GREEN("\u001B[40m"),
    BRIGHT_YELLOW("\u001B[41m"),
    BRIGHT_BLUE("\u001B[42m"),
    BRIGHT_MAGENTA("\u001B[43m"),
    BRIGHT_CYAN("\u001B[44m"),
    BRIGHT_WHITE("\u001B[45m");

    private final String code;

    Color(String _code) {
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
