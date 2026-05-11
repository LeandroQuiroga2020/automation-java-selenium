@Buzz
Feature: CP04 - Subir un archivo en seccion Buzz

  @SubirArchivo
  Scenario: 4 - Cargar file
    Given el usuario navega al sitio web
    When ingresa usuario "Admin" y password "admin123"
    And el usuario hace click en boton Buzz
    And el usuario hace click en el boton Shared Photos
    And el usuario sube el archivo "C:\Users\leandroq.PRX\test11.png"
    And el usuario hace clicj en el boton shared
