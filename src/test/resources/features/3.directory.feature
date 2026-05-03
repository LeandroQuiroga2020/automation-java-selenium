@Directory
Feature: CP03 - Buscar Job en seccion Directory

  @CrearDirectory
  Scenario: 3 - Buscar empleado
    Given el usuario navega al sitio web
    When ingresa usuario "Admin" y password "admin123"
    And el usuario ingresa y hace click en boton Directory
    And el usuario elige la opcion "Chief Financial Officer" del combo Job Title
    And el usuario hace click en el boton Search
    Then se muestra card de empleado buscado