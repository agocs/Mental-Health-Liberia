import org.apache.shiro.crypto.hash.Sha512Hash

class BootStrap {

    def init = { servletContext ->
		def adminRole = new ShiroRole(name: "admin")
		adminRole.addToPermissions("patientEncounterForm:*")
		adminRole.addToPermissions("searchable:*")
		adminRole.save()
		
		def adminUser = new ShiroUser(username: "admin", passwordHash: new Sha512Hash("admin").toHex())
		adminUser.addToRoles(adminRole)
		adminUser.save()
    }
    def destroy = {
    }
}
