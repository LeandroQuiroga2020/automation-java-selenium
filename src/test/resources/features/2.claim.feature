@Claim
Feature: CP01 - Creacion Claim

  @CrearClaim
  Scenario: 1 - Ceracion/edicion de claim
    Given el usuario navega al sitio web
    When ingresa usuario "Admin" y password "admin123"
    And el usuario ingresa y hace click en boton Claim
    And el usuario hace click en el boton Assign Claim
    And el usuario seleccion el empleado "John  Doe"
    And el usuario selecciona evento "Travel Allowance"
    And el usuario selecciona currency "Euro"
    And el usuario escribe texto libre en remarks "Reclamante de siniestro"
    And el usuario hace click en el boton Create Claim
    Then los datos del claim deben ser correctos
      | empleado  | evento             | moneda | remarks                   |
      | John Doe  | Travel Allowance   | Euro   | Reclamante de siniestro  |