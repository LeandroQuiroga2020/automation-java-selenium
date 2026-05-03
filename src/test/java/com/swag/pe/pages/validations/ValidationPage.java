package com.swag.pe.pages.validations;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ValidationPage extends PageObject {


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")
    protected WebElementFacade lbl_Dashboard;   // es una variable con el nombre del label product

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
    protected WebElementFacade lbl_invalidCredentials;

    //validacion de datos de creacion de claim

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/form/div[1]/div/div/div/div[2]/input")
    public WebElementFacade lblEmployee;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/form/div[2]/div/div[2]/div/div[2]/input")
    public WebElementFacade lblEvent;


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/form/div[3]/div/div/div/div[2]/input")
    public WebElementFacade lblCurrency;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/form/div[4]/div/div/div/div[2]/textarea")
    public WebElementFacade lblRemarks;

    //Directory
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div/div")
    public WebElementFacade card_record;
    // Directory label
    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div/div/div/p[2]")
    public WebElementFacade lbl_puestoEmpleado;




}
