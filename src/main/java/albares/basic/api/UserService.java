
package albares.basic.api;

import albares.utils.JWTUtils;
import albares.utils.Parameters;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.Map;

@Path("/user")
public class UserService {
    
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String createUser(User newUser){   
        Parameters.users.put(Parameters.idUsers.incrementAndGet(),newUser);
        return JWTUtils.generateToken(Parameters.idUsers.get());   
    }    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{token}")
    public User getUser(@PathParam("token") String token){ 
        return Parameters.users.get(JWTUtils.checkJWTandGetUserId(token));
    }    
   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map getUsers(){ 
        return Parameters.users;
    }  
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{token}/{newPass}")
    public Boolean editUser(@PathParam("token") String token,@PathParam("newPass") String newPass){ 
        
        User userToEdit = Parameters.users.get(JWTUtils.checkJWTandGetUserId(token));
   
        if(userToEdit == null){
            return false;            
        }else{
            userToEdit.setPass(newPass);
            return true;
        }        
    }  
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{token}")
    public Boolean deleteUser(@PathParam("token") String token){
        return Parameters.users.remove(JWTUtils.checkJWTandGetUserId(token)) != null;
    } 
    
}







