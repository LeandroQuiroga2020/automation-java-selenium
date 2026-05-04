package com.swag.pe.pages.buzz;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BuzzPage extends PageObject {

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[11]/a")
    protected WebElementFacade btn_buzz;
}
