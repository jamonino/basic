
package albares.basic;

import albares.utils.JWTUtils;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@Path("/user")
public class UserService {
    
    private static final Map<Integer, User> users = new HashMap();
    private static final AtomicInteger counter = new AtomicInteger(0);
    
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public String createUser(User newUser){   
        users.put(counter.incrementAndGet(),newUser);
        return JWTUtils.generateToken(counter.get());   
    }    
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public User getUser(@PathParam("id") int id){ 
        return users.get(id); 
    }    
   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Map getUsers(){ 
        return users;
    }  
    
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{token}/{newPass}")
    public Boolean editUser(@PathParam("token") String token,@PathParam("newPass") String newPass){ 
        
        User userToEdit = users.get(JWTUtils.checkJWTandGetUserId(token));
   
        if(userToEdit == null){
            return false;            
        }else{
            userToEdit.setPass(newPass);
            return true;
        }        
    }  
    
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{id}")
    public Boolean deleteUser(@PathParam("id") int id){
        if(users.remove(id)==null){
            return false;
        }else{
            return true;
        }
    } 
    
}







