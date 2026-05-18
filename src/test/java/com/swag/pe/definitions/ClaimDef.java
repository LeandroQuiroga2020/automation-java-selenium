package com.swag.pe.definitions;

import com.swag.pe.steps.claims.ClaimStep;
import com.swag.pe.steps.login.LoginStep;
import com.swag.pe.steps.validations.ValidationStep;
import com.swag.pe.utilities.website.WebSite;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Steps;

import java.util.Map;

public class ClaimDef {

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationStep validate;

    @Steps(shared = true)
    ClaimStep claim;

    @And("el usuario ingresa y hace click en boton Claim")
    public void clickBotonClaim() {

        claim.clickClaim();
    }

    @And("el usuario hace click en el boton Assign Claim")
    public void clickBotonAsignarClaim() {

        claim.clickAsignarClaim();
    }

    @And("el usuario seleccion el empleado {string}")
    public void seleccionarEmpleado(String nombre) {

        claim.seleccionarEmpleado(nombre);
    }

    @And("el usuario selecciona evento {string}")
    public void seleccionarEvent(String nombreEvent) {

        claim.seleccionarEvent(nombreEvent);
    }

    @And("el usuario selecciona currency {string}")
    public void seleccionarCurrency(String nombreCurrency) {

        claim.seleccionarCurrency(nombreCurrency);
    }

    @And("el usuario escribe texto libre en remarks {string}")
    public void escribirTextoLibre(String remarks) {

        claim.typeRemarks(remarks);
    }

    @And("el usuario hace click en el boton Create Claim")
    public void clickBotonCreateClaim() {

        claim.clickCreateClaim();
    }

    @Then("los datos del claim deben ser correctos")
    public void validarDatosClaim(DataTable table) {

        Map<String, String> data = table.asMaps(String.class, String.class).get(0);

        validate.validarClaimCreado(
                data.get("empleado"),
                data.get("evento"),
                data.get("moneda"),
                data.get("remarks")
        );
    }
}