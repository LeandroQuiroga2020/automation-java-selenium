@Directory
Feature: CP01 - Creacion Claim

  @CrearDirectory
  Scenario: 1 - Ceracion/edicion de claim
    Given el usuario navega al sitio web
    When ingresa usuario "Admin" y password "admin123"
    And el usuario ingresa y hace click en boton Directory