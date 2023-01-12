Feature: Ingreso de nombre de usuario y password con datos erróneos

Scenario: Ingresa a la pantalla error desde el inicio de sesión

Given El usuario se encuentra en la pantalla inicio de sesión
When Al ingresar nombre de usuario incorrecto "pepito"
When Al ingresar password incorrecto "1010"
Then Al presionar el botón ingresar, se debe redirigir a la pantalla error

