package java;

import java.Formats.DefaultFormat;
import java.Styling.Style;

import java.util.Calendar;

import static java.Styling.Style.RESET_ALL;


class LogHandler {
    private static FormatTemplate ft = new DefaultFormat();

    protected static void logMessage(String message,LogType type,int logLevel){
        if(type.getLevel()>logLevel) {
            return;
        }
        String formattedMessage = formatMessage(message,type);
        System.out.println(formattedMessage);
        logMessage(formattedMessage);
    }

    protected static void stackTrace(String message){
        StackTraceElement[] traceElements = Thread.currentThread().getStackTrace();
        StringBuilder traceMessage = new StringBuilder(message + "\n");
        for(StackTraceElement traceElement : traceElements){
            traceMessage.append(traceElement.toString()).append("\n");
        }
        String formattedMessage = formatMessageTypeOverride(traceMessage.toString(),LogType.ERROR,"Trace");
        System.out.println(formattedMessage);
        logMessage(formattedMessage);
    }

    private static String formatMessageTypeOverride(String message,LogType type,String overrideType){
        String logTypeColor = ft.getLogTypeColors()[type.getLevel()];
        String messageColor = ft.getMessageColors()[type.getLevel()];
        return ""+RESET_ALL+
                ft.getPrefixColor()+ft.getPrefix()+RESET_ALL+
                ft.getTimestampColor()+getTime()+
                ft.getSeperatorColor()+ft.getTimestampSeparator()+RESET_ALL+
                logTypeColor+overrideType+RESET_ALL+
                ft.getSeperatorColor()+ft.getLogTypeSeparator()+RESET_ALL+
                messageColor+message+RESET_ALL+
                ft.getSuffix()+RESET_ALL;
    }

    private static String formatMessage(String message,LogType type){
        return formatMessageTypeOverride(message,type,type.getLabel());
    }

    private static String getTime(){
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.MONTH)+"/"+cal.get(Calendar.DAY_OF_MONTH)+"/"+cal.get(Calendar.YEAR)+"-"+Calendar.HOUR_OF_DAY+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND)+"."+cal.get(Calendar.MILLISECOND);
    }

    private static void logMessage(String formattedMessage){
        if(QLogr.outputToFile()){
            FileHandler.writeToLogFile(stripStyle(formattedMessage));
        }
    }

    private static String stripStyle(String str){
        String out = str;
        for(Style style: Style.values()){
            out = out.replace(style.toString(), "");
        }
        return out;
    }
}
