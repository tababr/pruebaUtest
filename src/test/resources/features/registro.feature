#Autor: Brayan Tabares

  @stories
  Feature: Registro de Usuario en la Pagina Utest

    @scenario:

    Scenario: Registro de usuario en la pagina
      Given Se desea registrar a un usuario en la pagina
      When  Se diligenciara un formulario con los datos del usuario solicitados por el sistema
        | strNombre | strApellido | strEmail               | strAnoNacimiento | strMesNacimiento | strDiaNacimiento | strCiudad | strZip | strPais  | strDispositivo | strModelo        | strSo         | strClave         |
        | User      | Prueba      | brtm@hotmail.com | 1993             | November              |             23   | Bogotá    | 110101 | Colombia | Alcatel        | Crystal          | Android 7.0   | Oira.1032370453  |
      Then posteriormente se debe dar click en el boton de registro para finalizar el mismo
        | strTxt   |
        | Complete |

