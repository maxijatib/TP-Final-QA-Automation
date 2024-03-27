#language: es

  Característica: Registro

    Escenario: Registrarse correctamente
      Dado que el usuario ingresa a la pantalla de inicio
      Y que el usuario ingresa a la pamtalla de Register
      Cuando el usuario completa correctamente el formulario de registro
      Entonces el usuario se encuentra registrado correctamente

    Escenario: Registrarse con credenciales invalidas
      Dado que el usuario ingresa a la pantalla de inicio
      Y que el usuario ingresa a la pamtalla de Register
      Cuando el usuario completa el formulario de registro con información incorrecta
      Entonces se lee en pantalla un mensaje de error