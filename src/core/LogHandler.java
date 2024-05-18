package core;

public class LogHandler {
    protected static void logMessage(String message,LogType type,int logLevel){
        if(type.getLevel()>logLevel) {
            return;
        }
        String formattedMessage = formatMessage(message,type);
        System.out.println(formattedMessage);
    }
    private static String formatMessage(String message,LogType type){
        return type.getLabel()+" | "+message;
    }
}
