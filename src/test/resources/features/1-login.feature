@Login
Feature: CP01 - Validar inicio de sesion

  @ValidLogin
  Scenario: 1 - Login valido
    Given el usuario navega al sitio web
    When ingresa usuario "Admin" y password "admin123"
    Then el usuario ingresa al dashboard

  @InvalidLogin
  Scenario: Login inválido
    Given el usuario navega al sitio web
    When ingresa usuario "Admin" y password "wrongpass"
    Then el usuario debería ver un mensaje de error