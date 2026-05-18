package com.swag.pe.utilities.website;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;

public class WebSite {
    @Steps(shared=true)
    PageObject swag;

    @Step("Navegar al sitio web")
    public void navigateTo(String url){
        swag.setDefaultBaseUrl(url);
        swag.open();
    }


}

