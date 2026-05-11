package com.swag.pe.definitions;

import com.swag.pe.steps.buzz.BuzzStep;
import com.swag.pe.steps.claims.ClaimStep;
import com.swag.pe.steps.login.LoginStep;
import com.swag.pe.steps.validations.ValidationStep;
import com.swag.pe.utilities.website.WebSite;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.awt.*;
import java.util.Map;

public class BuzzDef {

    @Steps(shared=true)
    WebSite url;

    @Steps(shared=true)
    BuzzStep buzz;


    @And("el usuario hace click en boton Buzz")
    public void ClickBotonBuzz() {
        buzz.clickBuzz();
    }

    @And("el usuario hace click en el boton Shared Photos")
    public void ClickBotonSharedPhotos() {
        buzz.clickSharedPhotos();
    }

    @And("el usuario sube el archivo {string}")
    public void SubirArchivo(String filePath) throws AWTException, InterruptedException {
        buzz.clickAddPhotos();
        // Esper a que la ventana de Windows se abra
        //Thread.sleep(1000);

        // Subir archivo usando Robot
        buzz.uploadFileWithRobot(filePath);

}

    @And("el usuario hace clicj en el boton shared")
    public void ClickBotonShared() {
        buzz.clickShared();
    }
}

