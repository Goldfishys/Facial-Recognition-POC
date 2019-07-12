package rest;

import controllers.userController;
import models.User;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("")
public class authenticationEndpoint {

    @Inject
    private userController userController;

    @Path("/login")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public User login(String username, String password){
        return userController.login(username, password);
    }
}
