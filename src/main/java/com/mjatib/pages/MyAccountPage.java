package com.mjatib.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage extends BasePage {
    By cuentaCreadaBy = By.xpath("//div/p[contains(text(), \"Your new account has been successfully created\")]");

    By loginValidoBy = By.xpath("//div/h2[text()=\"My Account\"]");
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    public boolean validarCuentaCreada() {
        return isDisplayed(cuentaCreadaBy);
    }

    public boolean validarLogin() {
        return isDisplayed(loginValidoBy);
    }

}
