Feature: Registro de hora medica veterinaria

Scenario: Ingresar al agendamiento de hora desde la pantalla inicio de sesion y menu.

Given El usuario está en la pantalla de inicio sesión en google chrome
When Se inicia sesión con usuario "jops" y password "1234" se válida
When Presiona el botón ingresar, es redireccionado a la pantalla menu
Then En el menu presiona el link agendar hora y se redirecciona a la pantalla del formulario