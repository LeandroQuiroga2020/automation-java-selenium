package com.swag.pe.definitions;

import com.swag.pe.steps.login.LoginStep;
import com.swag.pe.steps.validations.ValidationStep;
import com.swag.pe.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import org.junit.Assert;


public class LoginDef {

    @Steps(shared=true)
    WebSite url;

    @Steps(shared=true)
    LoginStep login;

    @Steps(shared=true)
    ValidationStep validate;

    @Given("el usuario navega al sitio web")
    public void useNavigateTo(){
        url.navigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("ingresa usuario {string} y password {string}")
    public void userLogin(String user, String pass) {
        login.typeUsername(user);
        login.typePassword(pass);
        login.clickLogin();
    }

    @Then("el usuario ingresa al dashboard")
    public void systemShowProductsModel(){
        Assert.assertTrue(validate.PrimeraEntradaVisible());
    }

    @Then("el usuario debería ver un mensaje de error")
    public void LoginErroneo(){
        Assert.assertTrue(validate.ErrorCredencialesInvalidas());
    }

}
