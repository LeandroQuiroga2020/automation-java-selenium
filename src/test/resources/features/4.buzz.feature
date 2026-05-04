@Buzz
Feature: CP04 - Subir un archivo en seccion Buzz

  @SubirArchivo
  Scenario: 4 - Cargar file
    Given el usuario navega al sitio web
    When ingresa usuario "Admin" y password "admin123"
    And el usuario ingresa y hace click en boton Buzz