package endpoints;

import controllers.FacialRecognitionController;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;

@Path("/facialrecognition")
public class FacialRecognitionRESTEndpoint {

    @Inject
    private FacialRecognitionController facialRecognitionController;

    @Path("")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String hello(){
        return facialRecognitionController.getHello();
    }
}
