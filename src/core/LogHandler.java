package core;

import core.Formats.DefaultFormat;

import java.util.Calendar;
import java.util.Date;

import static core.Styling.Style.RESET_ALL;


class LogHandler {
    private static FormatTemplate ft = new DefaultFormat();

    protected static void logMessage(String message,LogType type,int logLevel){
        if(type.getLevel()>logLevel) {
            return;
        }
        String formattedMessage = formatMessage(message,type);
        System.out.println(formattedMessage);
    }

    private static String formatMessage(String message,LogType type){
        String logTypeColor = ft.getLogTypeColors()[type.getLevel()];
        String messageColor = ft.getMessageColors()[type.getLevel()];
        return ""+RESET_ALL+
                ft.getPrefixColor()+ft.getPrefix()+RESET_ALL+
                ft.getTimestampColor()+getTime()+
                ft.getSeperatorColor()+ft.getTimestampSeparator()+RESET_ALL+
                logTypeColor+type.getLabel()+RESET_ALL+
                ft.getSeperatorColor()+ft.getLogTypeSeparator()+RESET_ALL+
                messageColor+message+RESET_ALL+
                ft.getSuffix()+RESET_ALL;
    }

    private static String getTime(){
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.MONTH)+"/"+cal.get(Calendar.DAY_OF_MONTH)+"/"+cal.get(Calendar.YEAR)+"-"+Calendar.HOUR_OF_DAY+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND)+"."+cal.get(Calendar.MILLISECOND);
    }
}
