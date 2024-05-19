package core;

import core.Formats.DefaultFormat;

public class LogHandler {
    private static FormatTemplate ft = new DefaultFormat();
    protected static void logMessage(String message,LogType type,int logLevel){
        if(type.getLevel()>logLevel) {
            return;
        }
        String formattedMessage = formatMessage(message,type);
        System.out.println(formattedMessage);
    }
    private static String formatMessage(String message,LogType type){
        return ft.getPrefix()+type.getLabel()+" | "+ft.getMessageColor()+message+ft.getSuffix();
    }
}
