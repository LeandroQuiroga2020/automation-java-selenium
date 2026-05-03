package com.swag.pe.steps.directory;

import com.swag.pe.pages.directory.DirectoryPage;
import net.thucydides.core.annotations.Step;

public class DirectoryStep extends DirectoryPage {

    @Step("Clic en boton Directory")
    public void clickDirectory(){
        btn_directory.shouldBeVisible();
        btn_directory.waitUntilClickable().click();
    }
}
