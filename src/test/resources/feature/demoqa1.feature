#Autor: Daniel Amaya Montes

@General
  Feature: Automatizacion demoqa1
    Como usuario de la pagina demoqa
    quiero realizar un click en la opcion "widgets"
    despues en la opcion “Auto Complete”
    y llenar los campos con las respuestas Black y White respectivamente

    @First
      Scenario: Completar campos
      Given El usuario accede al sitio web demoqa.com
      When Se busca en la pagina los espacios para completar
      And Se completan los campos requeridos
        | strBlack | strWhite |
        | Black    | White    |
      Then Se verifica la realizacion del proceso

    @Second
      Scenario: Completar alertas
      Given El usuario ingresa nuevamente al sitio web demoqa.com
      When Se dirige al apartado de las alertas
      And Valida las alertas
      Then Se verifica la validacion de las alertas

