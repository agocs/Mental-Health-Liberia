import org.apache.shiro.crypto.hash.Sha256Hash

import edu.gatech.mentalhealthliberia.PatientEncounterForm

import grails.util.Environment

class BootStrap {

    def init = { servletContext ->
		if (Environment.current ==  Environment.DEVELOPMENT) {
			// setup test users and roles
			// TODO: replace these with actual permenant database entries
			
			def adminRole = new ShiroRole(name: "admin")
			adminRole.addToPermissions("patientEncounterForm:*") // create, modify, delete any form
			adminRole.addToPermissions("shiroUser:*") // create, modify, delete any user
			adminRole.addToPermissions("searchable:*")
			adminRole.save()
			
			def adminUser = new ShiroUser(username: "admin", passwordHash: new Sha256Hash("admin").toHex())
			adminUser.addToRoles(adminRole)
			adminUser.save()
			
			def analystRole = new ShiroRole(name: "analyst")
			analystRole.addToPermissions("patientEncounterForm:show,list,analyze,generateReport")
			analystRole.addToPermissions("searchable:*")
			analystRole.save()
			
			def analystUser = new ShiroUser(username: "analyst", passwordHash: new Sha256Hash("analyst").toHex())
			analystUser.addToRoles(analystRole)
			analystUser.save()
			
			def clinicianRole = new ShiroRole(name: "clinician")
			clinicianRole.addToPermissions("patientEncounterForm:show,list,upload,download") // also allow form upload and client download
			clinicianRole.addToPermissions("searchable:*")
			clinicianRole.save()
			
			def clinicianUser = new ShiroUser(username: "clinician", passwordHash: new Sha256Hash("clinician").toHex())
			clinicianUser.addToRoles(clinicianRole)
			clinicianUser.save()
			
			def form1 = new PatientEncounterForm(clinicianID: "1111", dateOfService: new Date(99, 1, 1), countyOfResidence: "Bomi",
							phq: 10, gaf: 10, cage: 10)
			if (!form1.validate()) {
				log.error form1.errors
			}
			form1.save()
			
			
			def form2 = new PatientEncounterForm(clinicianID: "1111", dateOfService: new Date(99, 2, 1), countyOfResidence: "Bomi",
							phq: 15, gaf: 10, cage: 20)
			form2.save()
			
			def form3 = new PatientEncounterForm(clinicianID: "1111", dateOfService: new Date(99, 3, 1), countyOfResidence: "Bomi",
							phq: 15, gaf: 15, cage: 25)
			form3.save()
			
			def form4 = new PatientEncounterForm(clinicianID: "1111", dateOfService: new Date(99, 4, 1), countyOfResidence: "Bomi",
							phq: 10, gaf: 10, cage: 10)
			form2.save()
			
			def form5 = new PatientEncounterForm(clinicianID: "1112", dateOfService: new Date(99, 1, 1), countyOfResidence: "Bomi",
							phq: 5, gaf: 10, cage: 7)
			form5.save()
			
			def form6 = new PatientEncounterForm(clinicianID: "1112", dateOfService: new Date(99, 2, 1), countyOfResidence: "Bomi",
							phq: 9, gaf: 9, cage: 8)
			form6.save()
			
			def form7 = new PatientEncounterForm(clinicianID: "1112", dateOfService: new Date(99, 3, 1), countyOfResidence: "Bomi",
							phq: 12, gaf: 15, cage: 11)
			form7.save()
			
			def form8 = new PatientEncounterForm(clinicianID: "1112", dateOfService: new Date(99, 4, 1), countyOfResidence: "Bomi",
							phq: 17, gaf: 9, cage: 13)
			form8.save()
		}
		
    }
    def destroy = {
    }
}
