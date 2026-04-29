package com.swag.pe.pages.claims;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class claimPage extends PageObject {
    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[11]/a")
    protected WebElementFacade btn_claim;


    @FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/div[1]/button")
    protected WebElementFacade btn_asignarClaim;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    protected WebElementFacade combo_employeeName;


    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/div[1]")
    protected WebElementFacade combo_event;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/div[1]")
    protected WebElementFacade combo_currency;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div/div/div[2]/textarea")
    protected WebElementFacade txt_remarks;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]")
    protected WebElementFacade btn_createClaim;







}



