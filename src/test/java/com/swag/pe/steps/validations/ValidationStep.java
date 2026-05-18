package com.swag.pe.steps.validations;

import com.swag.pe.pages.validations.ValidationPage;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.annotations.Step;
import net.thucydides.model.domain.TestResult;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;



import static org.hamcrest.MatcherAssert.assertThat;

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

            assertThat(lblEmployee.getValue().trim(), is(empleado));
            assertThat(lblEvent.getValue().trim(), is(evento));
            assertThat(lblCurrency.getValue().trim(), is(current));
            assertThat(lblRemarks.getValue().trim(), is(remarks));
            /*assertThat(lblEmployee.getValue().trim()).isEqualTo(empleado);
            assertThat(lblEvent.getValue().trim()).isEqualTo(evento);
            assertThat(lblCurrency.getValue().trim()).isEqualTo(current);
            assertThat(lblRemarks.getValue().trim()).isEqualTo(remarks);*/

    }


    //Directory
    @Step("Validacion de Card de Empleado encontrada")
    public Boolean EmpleadoEncontrado(){
        return card_record.isDisplayed();
    }

    //Directory label puesto de empleado
  /*  @Step("Validacion de label con puesto de empleado")
    public Boolean PuestoEmpleado(){
        return lbl_puestoEmpleado.isDisplayed();
    }*/

    @Step("Validación de label con puesto de empleado {0}")
    public Boolean PuestoEmpleado(String puestoEsperado) {
        // Verifica que el texto del label sea igual al esperado
        return lbl_puestoEmpleado.isDisplayed() &&
                lbl_puestoEmpleado.getText().equals(puestoEsperado);
    }

}
