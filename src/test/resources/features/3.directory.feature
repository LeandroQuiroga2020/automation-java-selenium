@Directory
Feature: CP03 - Buscar Job en seccion Directory

  @CrearDirectory
  Scenario: 1 - Ceracion/edicion de claim
    Given el usuario navega al sitio web
    When ingresa usuario "Admin" y password "admin123"
    And el usuario ingresa y hace click en boton Directory
    And el usuario elige la opcion "Chief Financial Officer" del combo Job Title