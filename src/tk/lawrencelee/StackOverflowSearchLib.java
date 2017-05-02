package tk.lawrencelee;

/**
 * Created by theasianpianist on 5/1/17.
 */

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class StackOverflowSearchLib {
    public static void search(Exception e) {
        String message = e.getMessage().replace(" ", "+");
        String stackOverflow = "http://stackoverflow.com/search?q=";
        String google = "https://www.google.com/#q=";
        try {
            Desktop.getDesktop().browse(new URI(stackOverflow + message));
            Desktop.getDesktop().browse(new URI(google + message));
        }
        catch (URISyntaxException ex) {
            System.exit(1);
        }
        catch (IOException ex) {
            System.exit(1);
        }
    }

    public static void main (String[] args) {
        Exception e = new IllegalAccessException("test message");
        try {
            throw e;
        }
        catch (Exception ex) {
            search(ex);
        }
    }
}
