# language: es

  Característica: Favoritos

    Escenario: Agregar producto a favoritos
      Dado que el usuario ingresa a la pantalla de inicio
      Y que el usuario ingresa a la página de login
      Y el usuario se loguea con credenciales validas
      Cuando el usuario agrega un producto a favoritos
      Entonces se valida que el producto esté en favoritos