package albares.basic.api;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/hello")
public class HelloResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayHello() {
        return "Hello World";
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/doGreeting")
    public String doGreeting(@QueryParam("name") String someValue, 
            @QueryParam("language") String language) {
        return "Hello " + someValue + " with language " + language;
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/doGreeting2")
    public String doGreeting2(
            @QueryParam("language") String language) {
        return "Hello with language " + language;
    }
    
    @OPTIONS
    public Response doOptions(){
        Response r = Response.ok()
                           .header("Access-Control-Allow-Origin","*")
                           .header("Access-Control-Allow-Methods","OPTIONS,POST")
                           .header("Access-Control-Allow-Headers","Content-Type, Authorization")
                           .build();
        return r;
    }
}
