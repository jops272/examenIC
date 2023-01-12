Feature: Ingreso de nombre de usuario con datos almacenados en BD

  Scenario: Ingreso al menu desde la pantalla Iniciar sesión
    Given El usuario se encuentra en la pagina Iniciar sesión
    When Ingresa usuario "jops"
    When Ingresa contraseña "1234"
    Then Al presionar el botón ingresar, se válida el usuario/contraseña y se redirige a la página menu
