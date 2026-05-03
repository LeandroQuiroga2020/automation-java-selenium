package com.swag.pe.steps.validations;

import com.swag.pe.pages.validations.ValidationPage;
import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;

import static org.assertj.core.api.Assertions.assertThat;

public class ValidationStep extends ValidationPage {

    @Step("Validacion primera entrada a Home/Dashboard")
    public Boolean PrimeraEntradaVisible(){
        return lbl_Dashboard.isDisplayed();
    }


    @Step("Validacion mensaje de error con credenciales invalidas")
    public boolean ErrorCredencialesInvalidas(){
        return lbl_invalidCredentials.waitUntilClickable().isDisplayed();
    }


    @Step("Validar los datos del claim creado")
    public void validarClaimCreado(String empleado, String evento, String current, String remarks) {

            lblEmployee.waitUntilVisible();
            lblEvent.waitUntilVisible();
            lblCurrency.waitUntilVisible();
            lblRemarks.waitUntilVisible();

            System.out.println("Employee TEXT: " + lblEmployee.getText());
            System.out.println("Employee VALUE: " + lblEmployee.getValue());  //debug para ver que trae cada valor

            assertThat(lblEmployee.getValue().trim()).isEqualTo(empleado);
            assertThat(lblEvent.getValue().trim()).isEqualTo(evento);
            assertThat(lblCurrency.getValue().trim()).isEqualTo(current);
            assertThat(lblRemarks.getValue().trim()).isEqualTo(remarks);

    }

    //Directory
    @Step("Validacion de Card de Empleado encontrada")
    public Boolean EmpleadoEncontrado(){
        return card_record.isDisplayed();
    }

}
