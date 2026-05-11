package com.swag.pe.pages.buzz;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class BuzzPage extends PageObject {

    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[12]/a")
    protected WebElementFacade btn_buzz;



    @FindBy(xpath="//button[contains(text(),'Share Photos')]")
    protected WebElementFacade btn_SharedPhotos;


    @FindBy(xpath="//div[.//p[normalize-space()='Add Photos']]")
    protected WebElementFacade btn_AddPhotos;

    @FindBy(xpath="//button[contains(@class,'oxd-button--main') and normalize-space()='Share']")
    protected WebElementFacade btn_Shared;









}
