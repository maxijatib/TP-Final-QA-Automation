package com.mjatib.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FavoritosPage extends BasePage {

    private By cameraButton = By.xpath("//a[text()='Cameras']");

    private By favIcon = By.xpath("//button[@onclick=\"wishlist.add('30');\"]");

    private By wishListButton = By.id("wishlist-total");

    private By productoWishlist = By.xpath("//td/a[text()='Canon EOS 5D']");

    public FavoritosPage(WebDriver driver) {
        super(driver);
    }

    public void ingresarASeccionCamaras() {
        click(cameraButton);
    }

    public void agregarUnProductoAFavoritos() {
        click(favIcon);
    }

    public void ingresarAWishlist() {
        click(wishListButton);
    }

    public boolean validarProductoEnWishlist() {
        return isDisplayed(productoWishlist);
    }
}
