package com.swag.pe.pages.claims;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ClaimPage extends PageObject {

    @FindBy(xpath = "//span[text()='Claim']")
    public WebElementFacade btn_claim;

    @FindBy(xpath = "//button[contains(.,'Assign Claim')]")
    public WebElementFacade btn_asignarClaim;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    public WebElementFacade combo_employeeName;

    @FindBy(xpath = "(//div[contains(@class,'oxd-select-text-input')])[1]")
    public WebElementFacade combo_event;

    @FindBy(xpath = "(//div[contains(@class,'oxd-select-text-input')])[2]")
    public WebElementFacade combo_currency;

    @FindBy(xpath = "//textarea")
    public WebElementFacade txt_remarks;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElementFacade btn_createClaim;
}