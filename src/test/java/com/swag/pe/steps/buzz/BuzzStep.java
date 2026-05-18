package com.swag.pe.steps.buzz;

import com.swag.pe.pages.buzz.BuzzPage;
import net.serenitybdd.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class BuzzStep extends BuzzPage {

    @Step("Clic en boton Buzz")
    public void clickBuzz(){
        btn_buzz.shouldBeVisible();
        btn_buzz.waitUntilClickable().click();
    }

    @Step("Clic en boton Shared Photos")
    public void clickSharedPhotos(){
        // Espera fija de 5 segundos
        try {
            // Espera fija de 5 segundos
            Thread.sleep(7000); // 5000 ms = 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        btn_SharedPhotos.shouldBeVisible();
        btn_SharedPhotos.waitUntilClickable().click();
    }

    @Step("Clic en boton AddPhotos")
    public void clickAddPhotos(){

            // Espera fija de 5 segundos
           try {
                // Espera fija de 5 segundos
                Thread.sleep(7000); // 5000 ms = 5 segundos
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        btn_AddPhotos.shouldBeVisible();
        btn_AddPhotos.waitUntilClickable().click();

    }

    // Nuevo Step para subir archivo usando Robot
    @Step("Subir archivo usando ventana de Windows")
    public void uploadFileWithRobot(String filePath) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        robot.setAutoDelay(500);

        // Copiar ruta al portapapeles
        StringSelection selection = new StringSelection(filePath);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

        // Esperar que la ventana de archivo esté activa
        Thread.sleep(2000);

        // Pegar ruta (Ctrl+V)
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        Thread.sleep(500); // pequeño delay antes de Enter

        // Enter
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    @Step("Clic en boton Shared")
    public void clickShared(){
        try {
            // Espera fija de 5 segundos
            Thread.sleep(5000); // 5000 ms = 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        btn_Shared.shouldBeVisible();
        btn_Shared.waitUntilClickable().click();
    }

   

}
