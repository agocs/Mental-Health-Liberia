/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mentalhealthliberia;

import java.security.SecureRandom;

/**
 *
 * @author greg
 */
public class PatientEncounterFormController {

    private static PatientEncounterFormController INSTANCE;
    
    private PatientEncounterFormController() { }
    
    public static PatientEncounterFormController getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PatientEncounterFormController();
        }
        return INSTANCE;
    }
    
    public void saveForm(MentalHealthLiberiaView view) {
        // TODO: do we still need this?
        // do we want to move the save function to the controller
        // I'd say probably yes, should come back to this
    }
    
    public void generatePdf(PatientEncounterForm formData) {
        // where to store the file
        // TODO: replace with file browser wizard
        String outputDirectory = MentalHealthLiberiaApp.getApplication().getDataDirectory();
        String fileName = Math.abs((new SecureRandom()).nextInt()) + ".pdf";
        
        
    }
    
}
