package com.mjatib.stepDefinitions;

import com.mjatib.hooks.Hooks;
import com.mjatib.pages.FavoritosPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class FavoritosDefinitions {

    private FavoritosPage favoritosPage;

    public FavoritosDefinitions() {
        this.favoritosPage = new FavoritosPage(Hooks.getDriver());
    }

    @Cuando("el usuario agrega un producto a favoritos")
    public void elUsuarioAgregaUnProductoAFavoritos() {

        favoritosPage.ingresarASeccionCamaras();

        favoritosPage.agregarUnProductoAFavoritos();

        favoritosPage.ingresarAWishlist();
    }

    @Entonces("se valida que el producto esté en favoritos")
    public void seValidaQueElProductoEstéEnFavoritos() {

        Assert.assertTrue(favoritosPage.validarProductoEnWishlist());

    }

}
