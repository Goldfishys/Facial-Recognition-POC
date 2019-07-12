package controllers;

import services.FacialRecognitionService;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class FacialRecognitionController {

    @Inject
    private FacialRecognitionService facialRecognitionService;

    public String getHello() {
        return facialRecognitionService.getHello();
    }
}
