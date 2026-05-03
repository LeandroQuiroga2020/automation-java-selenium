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



}
