
package albares.basic;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/user")
public class UserService {
    
    private static final List<User> users = new ArrayList();
    
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public List handleUserRequest(User newUser){
        
        users.add(newUser);
        
        return users;
        
    }           
}
