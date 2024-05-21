package core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    private static String outputFilePath = "";

    protected static void createLogFile(){
        try {
            File file = new File(outputFilePath);
            if (file.createNewFile()) {
                QLogr.info("Created log file at "+outputFilePath);
            }
        } catch (IOException e) {
            QLogr.err("Failed to create log file "+outputFilePath+"!");
            QLogr.setOutputToFile(false);
            QLogr.warn("Disabled log file output");
        }
    }

    protected static void writeToLogFile(String content){
        try {
            FileWriter writer = new FileWriter(outputFilePath);
            writer.write("Files in Java might be tricky, but it is fun enough!");
            writer.close();
        } catch (IOException e) {
            QLogr.err("Failed to write to file "+outputFilePath+"!");
            QLogr.setOutputToFile(false);
            QLogr.warn("Disabled log file output");
        }
    }

    public static String getOutputFilePath() {
        return outputFilePath;
    }

    public static void setOutputFilePath(String outputFilePath) {
        FileHandler.outputFilePath = outputFilePath;
    }
}
