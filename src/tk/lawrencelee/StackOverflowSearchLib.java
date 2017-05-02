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
        String exceptionName = e.getClass().toString();
        String message = e.getMessage().replace(" ", "+");
        String query = "";
        if (exceptionName.equals("java.lang.IndexOutOfBoundsException")) {
            query += exceptionName;
        }
        else {
            query += exceptionName + message;
        }
        String stackOverflow = "http://stackoverflow.com/search?q=";
        String google = "https://www.google.com/#q=";
        try {
            Desktop.getDesktop().browse(new URI(stackOverflow + query));
            Desktop.getDesktop().browse(new URI(google + query));
        }
        catch (URISyntaxException ex) {
            System.exit(1);
        }
        catch (IOException ex) {
            System.exit(1);
        }
    }
}
