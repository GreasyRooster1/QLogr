package core;


import static core.QLogr.*;
import core.LogHandler.*;

public class Main {
    public static void main(String[] args) {
        setLogLevel(5);

        enableFileOutput("logTest.log");

        debug("this is some debug message");
        info("this is some info");
        warn("oopsies, something went wrong");
        err("i have had an error!");
        critical("critical issue!");
        fatal("man im dead 💀");

        trace("god damn: ");
    }
}