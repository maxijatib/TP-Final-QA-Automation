#language: es

  Característica: Carrito

    Escenario: Agregar un producto al carrito
      Dado que el usuario ingresa a la página de login
      Y el usuario se loguea con credenciales validas
      Cuando el usuario agrega un producto al carrito
      Entonces se valida que el producto esté en el carrito