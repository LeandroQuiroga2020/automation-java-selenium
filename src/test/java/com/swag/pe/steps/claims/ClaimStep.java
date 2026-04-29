package com.swag.pe.steps.claims;

import com.swag.pe.pages.claims.claimPage;
import org.openqa.selenium.By;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ClaimStep extends claimPage {

    @Step("Clic en boton Claim")
    public void clickClaim(){
        btn_claim.shouldBeVisible();
        btn_claim.waitUntilClickable().click();
    }

    @Step("Click en boton Asignar Claim")
    public void clickAsignarClaim(){
        btn_asignarClaim.shouldBeVisible();
        btn_asignarClaim.waitUntilClickable().click();
    }

    @Step("El usuario selecciona empleado")
    public void seleccionarEmpleado(String nombre) {
        combo_employeeName.waitUntilClickable().click();
        combo_employeeName.clear();
        combo_employeeName.type(nombre);

        // Esperar a que aparezcan las opciones
        waitABit(1500);

        // Click en la PRIMERA opción del autocomplete
        WebElement opcion5 = getDriver().findElement(
                By.xpath("(//div[contains(@class,'oxd-autocomplete-option')])[1]")
        );

        opcion5.click();


    }


    @Step("El usuario selecciona evento")
    public void seleccionarEvent(String nombreEvent) {
        combo_event.waitUntilClickable().click();

        WebElementFacade opcion = find(By.xpath("//div[@role='listbox']//span[contains(text(),'" + nombreEvent + "')]"
        ));

        opcion.waitUntilVisible().waitUntilClickable().click();

    }

    @Step("El usuario selecciona currency")
    public void seleccionarCurrency(String nombreCurrency) {
        combo_currency.waitUntilClickable().click();

        WebElementFacade opcionNew = find(By.xpath("//div[@role='listbox']//span[contains(text(),'" + nombreCurrency + "')]"
        ));
        opcionNew.waitUntilVisible().waitUntilClickable().click();

    }

    @Step("El usuario escribe texto libre en remarks")
    public void typeRemarks(String password){
        txt_remarks.waitUntilClickable().click();
        txt_remarks.sendKeys(password);
    }

    @Step("Clic en boton Create Claim")
    public void clickCreateClaim(){
        btn_createClaim.shouldBeVisible();
        btn_createClaim.waitUntilClickable().click();
    }


}
