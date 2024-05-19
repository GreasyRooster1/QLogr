package core;

public enum Color {
    RED("\u001B[31m");

    private final String code;

    Color(String _code) {
        code=_code;
    }

    public String getCode() {
        return code;
    }
}
