#language:es
@InciarSesionConCredencialesIncorrectas
Característica: Funcionalidad de Inciar Sesion Con Credenciales Incorrectas
  Como tester deseo intentar iniciar sesion con credenciales incorrectas para verificar la seguridad del logueo


  @Simple
  Escenario: Inciar Sesion Con Credenciales Incorrectas
    Dado en la pagina principal de Pet Store
    Cuando intento iniciar sesion con los valores "SheldonCooper" y "123456789"
    Entonces se observa el mensaje "Invalid username or password.  Signon failed."

  @Parametro
  Esquema del escenario: Inciar Sesion Con Credenciales Incorrectas - Con Parametro
    Dado en la pagina principal de Pet Store
    Cuando intento iniciar sesion con los valores <User_Name> y <User_Pass>
    Entonces se observa el mensaje "Invalid username or password.  Signon failed."

    Ejemplos:
      | User_Name | User_Pass |
      | "SheldonCooper" | "123456789" |