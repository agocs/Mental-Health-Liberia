package edu.gatech.mentalhealthliberia

class PatientEncounterForm {

	static searchable = true;
	
    static constraints = {
    }
	
	// Basic Information
	String patientID;
	String clinicianID;
	String locationOfService;
	String reasonForVisit;
	String clinicianTrainingLevel;
	String referralSource;
	
	// Patient Demographics
	String dateOfBirth;
	String gender;
	String fathersName;
	String placeOfBirth;
	String age;
	String countyOfResidence;
	String distanceTraveled;
	String employmentStatus;
	String maritalStatus;
	String education;
	
	// Symptoms and Functioning
	String phq;
	String gaf;
	String cage;
	
	// Diagnosis
	String diagnosisPrimary;
	String moodDisorder;
	String anxietyDisorder;
	String psychoticDisorder;
	String somatoformDisorder;
	String substanceAbuseDisorder;
	String substanceAbuseDisorder2;
	String epilepsy;
	String otherMedicalCondition;
	String secondaryDiagnosis;
	
	// Treatment
	boolean fluoxetine;
	boolean escitalopram;
	boolean sertraline;
	boolean amitriptyline;
	boolean imipramine;
	boolean otherAntidepressant;
	boolean haloperidal;
	boolean haloperidalDecanoateInjection;
	boolean chlorpromazine;
	boolean fluphenazine;
	boolean fluphenazineDecanoateInjection;
	boolean risperidone;
	boolean risperidoneConstaInjection;
	boolean otherAntipsychotic;
	boolean clomipramine;
	boolean clonazepam;
	boolean diazepam;
	boolean lorazepam;
	boolean otherSedative;
	boolean depakote;
	boolean lithium;
	boolean carbamazepine;
	boolean otherMoodStabilizer;
	boolean depakoteAntiepileptic;
	boolean carbmazepineAntiepileptic;
	boolean phenobarbital;
	boolean phenytoin;
	boolean otherAntiepileptic;
	boolean trihexyphenidyl;
	boolean otherAnticholinergic;
	String counseling;
	String individualCounseling;
	String familyPsychoEducation;
	
	// Discharge
	boolean followUpCareMedication;
	boolean followUpCareCounseling;
	String dischargeDisposition;
	boolean reportData;
}
