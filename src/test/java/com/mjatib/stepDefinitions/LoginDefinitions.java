package com.mjatib.stepDefinitions;

import com.mjatib.hooks.Hooks;
import com.mjatib.pages.HomePage;
import com.mjatib.pages.LoginPage;
import com.mjatib.pages.MyAccountPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class LoginDefinitions {

    private HomePage homePage;
    private LoginPage loginPage;

    private MyAccountPage myAccountPage;

    public LoginDefinitions() {
        this.homePage = new HomePage(Hooks.getDriver());
        this.loginPage = new LoginPage(Hooks.getDriver());
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
    }

    @Dado("que el usuario ingresa a la página de login")
    public void queElUsuarioIngresaALaPáginaDeLogin() {
        Hooks.getDriver().get(Hooks.getProperty("url"));

        homePage.clickMyAccount();
        homePage.clickLoginDropdown();
    }

    @Cuando("el usuario se loguea con credenciales validas")
    public void elUsuarioSeLogueaConCredencialesValidas() {
        loginPage.login(Hooks.getProperty("username"), Hooks.getProperty("password"));
    }

    @Entonces("el usuario se encuentra logueado")
    public void elUsuarioSeEncuentraLogueado() {

        Assert.assertTrue(myAccountPage.validarLogin());

    }

//    @Y("el usuario se loguea en la aplicacion")
//    public void elUsuarioSeLogueaEnLaAplicacion() {
//        homePage.clickMyAccount();
//        homePage.clickLoginDropdown();
//
//        loginPage.login(Hooks.getProperty("username"), Hooks.getProperty("password"));
//    }

    @Cuando("el usuario se loguea con credenciales invalidas")
    public void elUsuarioSeLogueaConCredencialesInvalidas() {
        loginPage.login("asdasdasdasdddd@123", "hoasdala");
    }

    @Entonces("se muestra un mensaje de error de credenciales")
    public void seMuestraUnMensajeDeErrorDeCredenciales() {
        Assert.assertTrue(loginPage.credentialsErrorIsDisplayed());
    }

}
