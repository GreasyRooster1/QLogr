package core;

public class LogHandler {
    protected static void logMessage(String message,LogType type,int logLevel){
        if(type.getLevel()<=logLevel){
            System.out.println(type.getLabel()+message);
        }
    }
}
