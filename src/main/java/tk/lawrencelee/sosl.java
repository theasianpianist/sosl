package tk.lawrencelee;

/**
 * Created by theasianpianist on 5/1/17.
 */

import java.awt.Desktop;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.util.ArrayList;

public class sosl implements Thread.UncaughtExceptionHandler{
    ArrayList<String> specialExceptions = new ArrayList<String>();
    public void uncaughtException(Thread t, Throwable e) {
        specialExceptions.add("java.lang.IndexOutOfBoundsException");
        String exceptionName = e.getClass().toString().split(" ")[1];
        String message = e.getMessage().replace(" ", "+");
        try {
            message = URLEncoder.encode(message, "UTF-8");
        }
        catch (UnsupportedEncodingException ex) {
            ex.printStackTrace();
        }
        message = message.replace("%2B", "+");
        message = message.substring(0, message.indexOf("%"));
        String query = "";
        if (specialExceptions.contains(exceptionName)) {
            query += exceptionName;
        }
        else {
            query += exceptionName + "+" + message;
        }
        String stackOverflow = "http://stackoverflow.com/search?q=";
        String google = "https://www.google.com/#q=";
        String searchTerm = stackOverflow + query;
        try {
            Desktop.getDesktop().browse(new URI(stackOverflow + query));
            Desktop.getDesktop().browse(new URI(google + query));
            e.printStackTrace();
        }
        catch (UnsupportedOperationException ex) {
            System.out.println("Unfortunately your system does not support this library");
            try {
                t.sleep(100);
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
        catch (URISyntaxException ex) {
            ex.printStackTrace();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main (String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new sosl());
        int i = Integer.parseInt("oetn");
    }
}
