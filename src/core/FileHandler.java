package core;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    private static String outputFilePath = "logTest.log";

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
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath, true));
            writer.write(content);
            writer.newLine();
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
