/*
 * MetnalHealthLiberiaApp.java
 */

package mentalhealthliberia;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class MentalHealthLiberiaApp extends SingleFrameApplication {

    private static String uploadUrl = "http://50.57.158.90:8080/MHL/patientEncounterForm/upload";
    private static String dataDirectory = "";
    
    private static boolean processConfig() {
        try {
            File file = new File("app.properties");
            StringBuffer fileData = new StringBuffer(1000);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            char[] buf = new char[1024];
            int numRead=0;
            while((numRead=reader.read(buf)) != -1) {
                fileData.append(buf, 0, numRead);
            }
            reader.close();
            dataDirectory = fileData.toString();
            File dataDir = new File(dataDirectory);
            if (!dataDir.exists()) {
                dataDir.mkdir();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
    public String getDataDirectory() {
        return dataDirectory;
    }
    
    public String getUploadUrl() {
        return uploadUrl;
    }
    
    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new MentalHealthLiberiaView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of MetnalHealthLiberiaApp
     */
    public static MentalHealthLiberiaApp getApplication() {
        return Application.getInstance(MentalHealthLiberiaApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        if (processConfig()) {
            launch(MentalHealthLiberiaApp.class, args);
        }
    }
}
