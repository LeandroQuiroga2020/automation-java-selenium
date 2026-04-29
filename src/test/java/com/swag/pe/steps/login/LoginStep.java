package com.swag.pe.steps.login;

import com.swag.pe.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep extends LoginPage {

    @Step("Ingresar usuario")
    public void typeUsername(String username){
        txt_username.waitUntilClickable().click();
        txt_username.sendKeys(username);
    }

    @Step("Ingresar contraseña")
    public void typePassword(String password){
        txt_password.waitUntilClickable().click();
        txt_password.sendKeys(password);
    }

    @Step("Clic en boton Login")
    public void clickLogin(){
        btn_login.shouldBeVisible();
        btn_login.click();
    }

}
