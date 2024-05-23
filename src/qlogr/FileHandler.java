package qlogr;

import java.io.*;

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
            QLogr.disableFileOutput();
            QLogr.warn("Disabled log file output");
        }
    }

    protected static void writeToLogFile(String content){
        try {
            FileWriter fw = new FileWriter(outputFilePath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);
            out.println(content);
            out.close();
        } catch (IOException e) {
            QLogr.err("Failed to write to file "+outputFilePath+"!");
            QLogr.disableFileOutput();
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
