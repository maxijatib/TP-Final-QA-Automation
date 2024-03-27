package com.mjatib.stepDefinitions;

import com.mjatib.hooks.Hooks;
import com.mjatib.pages.CarritoPage;
import com.mjatib.pages.FavoritosPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class CarritoDefinitions {

    private CarritoPage carritoPage;
    private FavoritosPage favoritosPage;

    public CarritoDefinitions(){
        this.carritoPage = new CarritoPage(Hooks.getDriver());
        this.favoritosPage = new FavoritosPage(Hooks.getDriver());
    }

    @Cuando("el usuario agrega un producto al carrito")
    public void elUsuarioAgregaUnProductoAlCarrito() {

        favoritosPage.ingresarASeccionCamaras();
        carritoPage.clickProductoCamara();
        carritoPage.clickDropDownSelect();
        carritoPage.clickOptionSelect();
        carritoPage.clickButtonCart();
        carritoPage.clickButtonCartTotal();
        carritoPage.clickButtonViewCart();

    }

    @Entonces("se valida que el producto esté en el carrito")
    public void seValidaQueElProductoEstéEnElCarrito() {

        Assert.assertTrue(carritoPage.validarSeccionShoppingCart());

    }
}
