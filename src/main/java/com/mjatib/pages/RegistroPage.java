package com.mjatib.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistroPage extends BasePage{

    private By firstNameInput = By.id("input-firstname");
    private By lastNameInput = By.id("input-lastname");
    private By inputEmail = By.id("input-email");
    private By phoneInput = By.id("input-telephone");
    private By passwordInput = By.id("input-password");
    private By confirmPasswordInput = By.id("input-confirm");
    private By checkbox = By.name("agree");
    private By continueButton = By.xpath("//input[@value=\"Continue\"]");
    private By mensajeErrorBy = By.xpath("//div[contains(text(), \"Warning\")]");

    public RegistroPage(WebDriver driver) {
        super(driver);
    }

    public void completarFormulario(String firstName,
                                    String lastName,
                                    String email,
                                    String phone,
                                    String password, String confirmPasswordInput) {

        sendKeys(firstNameInput, firstName);
        sendKeys(lastNameInput, lastName);
        sendKeys(inputEmail, email);
        sendKeys(phoneInput, phone);
        sendKeys(passwordInput, password);
        sendKeys(this.confirmPasswordInput, password);
        click(checkbox);
        click(continueButton);
    }

    public void completarFormularioIncorrecto(String firstName,
                                    String lastName,
                                    String email,
                                    String phone,
                                    String password, String confirmPasswordInput) {

        sendKeys(firstNameInput, firstName);
        sendKeys(lastNameInput, lastName);
        sendKeys(inputEmail, email);
        sendKeys(phoneInput, phone);
        sendKeys(passwordInput, password);
        sendKeys(this.confirmPasswordInput, password);
        click(continueButton);
    }

    public boolean registroInvalido() {
        return isDisplayed(mensajeErrorBy);
    }
}
