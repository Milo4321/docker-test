package pl.infoshare.jboss.ear.war;

import pl.infoshare.jboss.ear.ejb.User;
import pl.infoshare.jboss.ear.ejb.UserEjb;

import javax.ejb.EJB;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/users")
public class UserEndpoint {
    @EJB
    private UserEjb userEjb;

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getUser(@PathParam("id") long id) {
        User user = userEjb.get(id);
        if (user != null) {
            return Response.accepted().entity(user).build();
        } else {
            return Response.noContent().status(Response.Status.NOT_FOUND).build();
        }
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveUser(User user) {
        return Response.accepted().entity(userEjb.save(user)).build();
    }

}