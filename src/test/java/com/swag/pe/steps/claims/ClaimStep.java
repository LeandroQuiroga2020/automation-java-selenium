package com.swag.pe.steps.claims;

import com.swag.pe.pages.claims.ClaimPage;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ClaimStep {

    ClaimPage claimPage;

    @Step("Clic en boton Claim")
    public void clickClaim() {

        claimPage.btn_claim.waitUntilVisible();
        claimPage.btn_claim.waitUntilClickable().click();
    }

    @Step("Click en boton Assign Claim")
    public void clickAsignarClaim() {

        claimPage.btn_asignarClaim.waitUntilVisible();
        claimPage.btn_asignarClaim.waitUntilClickable().click();
    }

    @Step("El usuario selecciona empleado")
    public void seleccionarEmpleado(String nombre) {

        claimPage.combo_employeeName.waitUntilClickable().click();
        claimPage.combo_employeeName.clear();
        claimPage.combo_employeeName.type(nombre);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement opcion = claimPage.getDriver().findElement(
                By.xpath("(//div[contains(@class,'oxd-autocomplete-option')])[1]")
        );

        opcion.click();
    }

    @Step("El usuario selecciona evento")
    public void seleccionarEvent(String nombreEvent) {

        claimPage.combo_event.waitUntilClickable().click();

        WebElementFacade opcion = claimPage.find(
                By.xpath("//div[@role='listbox']//span[contains(text(),'" + nombreEvent + "')]")
        );

        opcion.waitUntilVisible();
        opcion.waitUntilClickable().click();
    }

    @Step("El usuario selecciona currency")
    public void seleccionarCurrency(String nombreCurrency) {

        claimPage.combo_currency.waitUntilClickable().click();

        WebElementFacade opcion = claimPage.find(
                By.xpath("//div[@role='listbox']//span[contains(text(),'" + nombreCurrency + "')]")
        );

        opcion.waitUntilVisible();
        opcion.waitUntilClickable().click();
    }

    @Step("El usuario escribe texto libre en remarks")
    public void typeRemarks(String remarks) {

        claimPage.txt_remarks.waitUntilClickable().click();
        claimPage.txt_remarks.clear();
        claimPage.txt_remarks.sendKeys(remarks);
    }

    @Step("Clic en boton Create Claim")
    public void clickCreateClaim() {

        claimPage.btn_createClaim.waitUntilVisible();
        claimPage.btn_createClaim.waitUntilClickable().click();
    }
}