import com.example.Role
import com.example.User
import com.example.UserRole

class BootStrap {

    def init = { servletContext ->
        switch (grails.util.GrailsUtil.environment){
            case "development":

                def adminRole = Role.findByAuthority("ROLE_ADMIN") ?: new Role(authority: "ROLE_ADMIN").save(flush: true)

                def admin = User.get(1);
                if(!admin){
                    admin = new User(
                            id: 1,
                            username: "user",
                            password: "password",
                            enabled: true,
                    ).save(flush: true)
                    UserRole.create admin, adminRole
                }

                break;

            case "production":

                def adminRole = Role.findByAuthority("ROLE_ADMIN") ?: new Role(authority: "ROLE_ADMIN").save(flush: true)

                def admin = User.get(1);
                if(!admin){
                    admin = new User(
                            id: 1,
                            username: "user",
                            password: "password",
                            enabled: true,
                    ).save(flush: true)
                    UserRole.create admin, adminRole
                }
                break;
        }
    }
    def destroy = {
    }
}
