package com.mjatib.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarritoPage extends BasePage{

    By productoCamaraBy = By.xpath("//div/h4/a[text()=\"Canon EOS 5D\"]");
    By dropDownSelectBy = By.id("input-option226");
    By optionSelectBy = By.xpath("//option[@value=\"15\"]");
    By buttonCartBy = By.id("button-cart");
    By buttonCartTotalBy = By.id("cart-total");
    By buttonViewCartBy = By.xpath("//strong[text()=\" View Cart\"]");
    By seccionShoppingCartBy = By.xpath("//a[text()=\"Shopping Cart\"]");

    public CarritoPage(WebDriver driver) {
        super(driver);
    }

    public void clickProductoCamara(){
        click(productoCamaraBy);
    }

    public void clickDropDownSelect(){
        click(dropDownSelectBy);
    }

    public void clickOptionSelect(){
        click(optionSelectBy);
    }

    public void clickButtonCart() { click(buttonCartBy); }

    public void clickButtonCartTotal() { click(buttonCartTotalBy); }

    public void clickButtonViewCart() { click(buttonViewCartBy); }

    public boolean validarSeccionShoppingCart() { return isDisplayed(seccionShoppingCartBy); }

}
