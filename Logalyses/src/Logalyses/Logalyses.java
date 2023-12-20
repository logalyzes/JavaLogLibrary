package Logalyses;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logalyses {
    //Data fields for required server and folder info
    private static String logServerUrl;

    //set required server info
    public static void serServerInfo(String url){
        logServerUrl = url;
    }

    //Log method
    //this method is main method of the class
    //post logs to server or save a folder
    public static void Log(String message){
        if(logServerUrl != null){
            
        }
    }

    
    //post logs to server
    private static void sendToLogServer(String message){
        try {
            // TODO : Log server ile iletişim kodu buraya gelecek
            
            System.out.println("Log posted: " + message);
        } catch (Exception e) {
            // Log when error occurs
            logError("Error when the logs are posting: " + e.getMessage());
        }
    }


    private static void saveToFile(String message) {
        try (FileWriter fileWriter = new FileWriter("log.txt", true);
             PrintWriter printWriter = new PrintWriter(fileWriter)) {
            // write log to folder
            printWriter.println(getTimestamp() + " " + message);
        } catch (IOException e) {
            // log folder write error
            logError("Error when writing to athe folder: " + e.getMessage());
        }
    }

    //logs when the coming logs is not posted correctly
    private static void logError(String errorMessage) {
        System.err.println(errorMessage);
    }

    //get time stamp
    private static String getTimestamp() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        return sdf.format(new Date());
    }
}
