package com.swag.pe.steps.directory;

import com.swag.pe.pages.directory.DirectoryPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class DirectoryStep extends DirectoryPage {

    @Step("Clic en boton Directory")
    public void clickDirectory(){
        btn_directory.shouldBeVisible();
        btn_directory.waitUntilClickable().click();
    }
    @Step("El usuario selecciona Job Title")
    public void seleccionarJobTitle(String nombreJobTitle) {
        combo_jobTitle.waitUntilClickable().click();

        WebElementFacade opcion = find(By.xpath("//div[@role='listbox']//span[contains(text(),'" + nombreJobTitle + "')]"
        ));

        opcion.waitUntilVisible().waitUntilClickable().click();

    }
}
