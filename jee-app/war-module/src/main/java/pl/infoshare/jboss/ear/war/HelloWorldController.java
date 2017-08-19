package pl.infoshare.jboss.ear.war;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/hello")
public class HelloWorldController {

    @GET
    public Response hello() {
        return Response.accepted().entity("Hello world from war endopoint").build();
    }
}
