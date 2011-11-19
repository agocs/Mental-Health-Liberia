/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mentalhealthliberia;

import com.itextpdf.text.Document;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

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
        //String outputDirectory = MentalHealthLiberiaApp.getApplication().getDataDirectory();
        String fileName = Math.abs((new SecureRandom()).nextInt()) + ".pdf";
        
        try {
            // step 1
            Document document = new Document(PageSize.LETTER);
            
            // step 2
            PdfWriter.getInstance(document, new FileOutputStream(fileName));
            
            // step 3
            document.open();
            
            // step 4
            document.add(new Phrase("Basic Information"));
            document.add(createBasicInformationTable(formData));
            document.add(new Phrase(""));
            document.add(new Phrase("Patient Demographics"));
            document.add(createPatientDemographicsTable(formData));
            document.add(new Phrase(""));
            document.add(new Phrase("Symptoms and Functioning"));
            document.add(createSymptomsTable(formData));
            document.add(new Phrase(""));
            document.add(new Phrase("Treatment"));
            document.add(createTreatmentTable(formData));
            document.add(new Phrase(""));
            document.add(new Phrase("Discharge"));
            document.add(createDischargeTable(formData));
            document.add(new Phrase(""));
            document.add(new Phrase("Diagnosis"));
            document.add(createDiagnosisTable(formData));
            
            // step 5
            document.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private PdfPTable createBasicInformationTable(PatientEncounterForm formData) {
        PdfPTable table = new PdfPTable(4);

        // Row One
        PdfPCell cell = new PdfPCell(new Phrase("Date of Service"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(formData.getDateOfService()));
        table.addCell(cell);

        cell = new PdfPCell(new Phrase("Clinician ID"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(formData.getClinicianID()));
        table.addCell(cell);

        // Row Two
        cell = new PdfPCell(new Phrase("Location of Service"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(formData.getLocationOfService()));
    
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("Clinician Training Level"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(formData.getClinicianTrainingLevel()));
        table.addCell(cell);
        
        // Row Three
        cell = new PdfPCell(new Phrase("Reason for Visit"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(formData.getReasonForVisit()));
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("Referral Source"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(formData.getReferralSource()));
        table.addCell(cell);
        
        return table;
    }
    
    private PdfPTable createPatientDemographicsTable(PatientEncounterForm formData) {
        PdfPTable table = new PdfPTable(6);
        
        // Row One
        PdfPCell cell = new PdfPCell(new Phrase("Age"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(formData.getAge()));
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("County of Residence"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(formData.getCountyOfResidence()));
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("Distance Traveled to Clinic/Hostpital"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(formData.getDistanceTraveled()));
        table.addCell(cell);
        
        // Row Two
        cell = new PdfPCell(new Phrase("Employment Status"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(formData.getEmploymentStatus()));
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("Marital Status"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(formData.getMaritalStatus()));
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("Education"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(formData.getEducation()));
        table.addCell(cell);
        
        return table;
    }
    
    private PdfPTable createSymptomsTable(PatientEncounterForm formData) {
        PdfPTable table = new PdfPTable(6);
        
        // Row One
        PdfPCell cell = new PdfPCell(new Phrase("PHQ Score"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(formData.getPhq()));
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("GAF Score"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(formData.getGaf()));
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("CAGE Score"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(formData.getCage()));
        table.addCell(cell);
        
        return table;
    }
    
    private PdfPTable createTreatmentTable(PatientEncounterForm formData) {
        PdfPTable table = new PdfPTable(4);
        
        // Row One
        PdfPCell cell = new PdfPCell(new Phrase("Anti-depressent Medication"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(getAntiDepressentMediciation(formData)));
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("Anti-psychotic Mediciation"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(getAntiPsychoticMediciation(formData)));
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("Sedative/Hypnotic Mediciation"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(getSedativeHypnoticMediciation(formData)));
        table.addCell(cell);
        
        // Row Two
        cell = new PdfPCell(new Phrase("Mood Stabilizer Mediciation"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(getMoodStabilizerMediciation(formData)));
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("Anti-epileptic Mediciation"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(getAntiEpilepticMediciation(formData)));
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("Anti-cholinergic Mediciation"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(getAntiCholinergicMediciation(formData)));
        table.addCell(cell);
        
        // Row Three
        cell = new PdfPCell(new Phrase("Counseling"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(formData.getCounseling()));
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("Individual Counseling"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(formData.getIndividualCounseling()));
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("Family Psycho-education"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(formData.getFamilyPsychoEducation()));
        table.addCell(cell);
        
        return table;
    }
    
    private String getAntiDepressentMediciation(PatientEncounterForm formData) {
        List<String> medications = new ArrayList<String>();
        
        if (formData.isFluoxetine()) {
            medications.add("Fluoxetine");
        }
        if (formData.isEscitalopram()) {
            medications.add("Escitalopram");
        }
        if (formData.isSertraline()) {
            medications.add("Sertraline");
        }
        if (formData.isAmitriptyline()) {
            medications.add("Amitriptyline");
        }
        if (formData.isImipramine()) {
            medications.add("Imipramine");
        }
        if (formData.isOtherAntidepressant()) {
            medications.add("Other");
        }
        
        return listAsCSVString(medications);
    }
    
    private String getAntiPsychoticMediciation(PatientEncounterForm formData) {
        List<String> medications = new ArrayList<String>();
        
        if (formData.isHaloperidal()) {
            medications.add("Haloperidal");
        }
        if (formData.isHaloperidalDecanoateInjection()) {
            medications.add("Haloperidal Decanoate Injection");
        }
        if (formData.isChlorpromazine()) {
            medications.add("Chlorpromazine");
        }
        if (formData.isFluphenazine()) {
            medications.add("Fluphenazine");
        }
        if (formData.isFluphenazineDecanoateInjection()) {
            medications.add("Fluphenazine Decanoate Injection");
        }
        if (formData.isRisperidone()) {
            medications.add("Risperidone");
        }
        if (formData.isRisperidoneConstaInjection()) {
            medications.add("Risperidone Consta Injection");
        }
        if (formData.isOtherAntipsychotic()) {
            medications.add("Other");
        }
        
        return listAsCSVString(medications);
    }
    
    private String getSedativeHypnoticMediciation(PatientEncounterForm formData) {
        List<String> medications = new ArrayList<String>();
        
        if (formData.isClomipramine()) {
            medications.add("Clomipramine");
        }
        if (formData.isClonazepam()) {
            medications.add("Clonazepam");
        }
        if (formData.isDiazepam()) {
            medications.add("Diazepam");
        }
        if (formData.isLorazepam()) {
            medications.add("Lorazepam");
        }
        if (formData.isOtherSedative()) {
            medications.add("Other");
        }
        
        return listAsCSVString(medications);
    }
    
    private String getMoodStabilizerMediciation(PatientEncounterForm formData) {
        List<String> medications = new ArrayList<String>();
        
        if (formData.isDepakote()) {
            medications.add("Depakote");
        }
        if (formData.isLithium()) {
            medications.add("Lithium");
        }
        if (formData.isCarbamazepine()) {
            medications.add("Carbamazepine");
        }
        if (formData.isOtherMoodStabilizer()) {
            medications.add("Other");
        }
        
        return listAsCSVString(medications);
    }
    
    private String getAntiEpilepticMediciation(PatientEncounterForm formData) {
        List<String> medications = new ArrayList<String>();
        
        if (formData.isDepakoteAntiepileptic()) {
            medications.add("Depakote");
        }
        if (formData.isCarbmazepineAntiepileptic()) {
            medications.add("Carbamazepine");
        }
        if (formData.isPhenobarbital()) {
            medications.add("Phenobarbital");
        }
        if (formData.isPhenytoin()) {
            medications.add("Phenytoin");
        }
        if (formData.isOtherAntiepileptic()) {
            medications.add("Other");
        }
        
        return listAsCSVString(medications);
    }
    
    private String getAntiCholinergicMediciation(PatientEncounterForm formData) {
        List<String> medications = new ArrayList<String>();
        
        if (formData.isTrihexyphenidyl()) {
            medications.add("Trihexyphenidyl");
        }
        if (formData.isOtherAnticholinergic()) {
            medications.add("Other");
        }
        
        return listAsCSVString(medications);
    }
    
    private PdfPTable createDischargeTable(PatientEncounterForm formData) {
        PdfPTable table = new PdfPTable(4);
        
        // Row One
        PdfPCell cell = new PdfPCell(new Phrase("Need Followup Care - Medication"));
        table.addCell(cell);
        String val = "No";
        if (formData.isFollowUpCareMedication()) {
            val = "Yes";
        }
        cell = new PdfPCell(new Phrase(val));
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("Need Followup Care - Counseling"));
        table.addCell(cell);
        val = "No";
        if (formData.isFollowUpCareCounseling()) {
            val = "Yes";
        }
        cell = new PdfPCell(new Phrase(val));
        table.addCell(cell);
        
        // Row Two
        cell = new PdfPCell(new Phrase("Discharge Disposition (Location)"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(formData.getDischargeDisposition()));
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("Permission to Report Data"));
        table.addCell(cell);
        val = "No";
        if (formData.isReportData()) {
            val = "Yes";
        }
        cell = new PdfPCell(new Phrase(val));
        table.addCell(cell);
        
        return table;
    }
    
    private PdfPTable createDiagnosisTable(PatientEncounterForm formData) {
        PdfPTable table = new PdfPTable(4);
        
        // Row One
        PdfPCell cell = new PdfPCell(new Phrase("Mental Health Diagnosis: Primary"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(formData.getDiagnosisPrimary()));
        table.addCell(cell);
        
        cell = new PdfPCell(new Phrase("Mood Disorder"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(formData.getMoodDisorder()));
        table.addCell(cell);
        
        // Row Two
        cell = new PdfPCell(new Phrase("Anxiety Disorder"));
        table.addCell(cell);
        cell = new PdfPCell(new Phrase(formData.getAnxietyDisorder()));
        table.addCell(cell);
        
        return table;
    }
    
    private String listAsCSVString(List<String> list) {
        String result = "";
        
        for (int i = 0; i < list.size(); i++) {
            result += list.get(i);
            if (i < list.size() - 1) {
                result += ",";
            }
        }
        
        return result;
    }
}