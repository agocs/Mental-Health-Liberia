/*
 * MetnalHealthLiberiaApp.java
 */

package mentalhealthliberia;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class MentalHealthLiberiaApp extends SingleFrameApplication {

    private String dataDirectory = "/home/greg/mentalHealthLiberiaData/";
    private String dataSocket = "http://localhost:8081/MentalHealthLiberia/patientEncounterForm/upload";
    private String authenticationSocket = "http://localhost:8081/MentalHealthLiberia/auth/uploadAuthenticate";
    
    public String getDataDirectory() {
        return this.dataDirectory;
    }
    
    public String getDataSocket() {
        return this.dataSocket;
    }
    
    public String getAuthenticationSocket() {
        return this.authenticationSocket;
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
        launch(MentalHealthLiberiaApp.class, args);
    }
}
