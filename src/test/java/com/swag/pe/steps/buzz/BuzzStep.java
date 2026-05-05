package com.swag.pe.steps.buzz;

import com.swag.pe.pages.buzz.BuzzPage;
import net.thucydides.core.annotations.Step;

public class BuzzStep extends BuzzPage {

    @Step("Clic en boton Buzz")
    public void clickBuzz(){
        btn_buzz.shouldBeVisible();
        btn_buzz.waitUntilClickable().click();
    }

    @Step("Clic en boton Shared Photos")
    public void clickSharedPhotos(){
        btn_SharedPhotos.shouldBeVisible();
        btn_SharedPhotos.waitUntilClickable().click();
    }
}
