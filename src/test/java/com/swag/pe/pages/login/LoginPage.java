package com.swag.pe.pages.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(name="username")
    protected WebElementFacade txt_username;

    @FindBy(name="password")
    protected WebElementFacade txt_password;

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
    protected WebElementFacade btn_login;
}
