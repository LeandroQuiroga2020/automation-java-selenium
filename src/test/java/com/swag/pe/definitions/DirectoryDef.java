package com.swag.pe.definitions;

import com.swag.pe.steps.claims.ClaimStep;
import com.swag.pe.steps.directory.DirectoryStep;
import com.swag.pe.steps.login.LoginStep;
import com.swag.pe.steps.validations.ValidationStep;
import com.swag.pe.utilities.website.WebSite;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.Map;

public class DirectoryDef {
    @Steps(shared=true)
    WebSite url;

    @Steps(shared=true)
    LoginStep login;

    @Steps(shared=true)
    ValidationStep validate;

    @Steps(shared=true)
    ClaimStep claim;

    @Steps(shared=true)
    DirectoryStep directory;


    @And("el usuario ingresa y hace click en boton Directory")
    public void ClickBotonDirectory() {
        directory.clickDirectory();
    }

    @And("el usuario elige la opcion {string} del combo Job Title")
    public void seleccionarEvent(String nombreJobTitle) {
        directory.seleccionarJobTitle(nombreJobTitle);
    }

    @And("el usuario hace click en el boton Search")
    public void ClickBotonSearch() {
        directory.clickSearch();
    }
    @Then("se muestra card de empleado buscado")
    public void ValidarEmpleado(){
        Assert.assertTrue(validate.EmpleadoEncontrado());
    }
    /*@And("se valida que el empleado tenga cargo {string}")
    public void ValidarPuestoEmpleado(){
        Assert.assertTrue(validate.PuestoEmpleado());
    }*/
    @And("se valida que el empleado tenga cargo {string}")
    public void validarPuestoEmpleado(String puestoEsperado) {
        Assert.assertTrue(validate.PuestoEmpleado(puestoEsperado));
    }



}
