package com.mjatib.stepDefinitions;

import com.mjatib.hooks.Hooks;
import com.mjatib.pages.HomePage;
import com.mjatib.pages.MyAccountPage;
import com.mjatib.pages.RegistroPage;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import org.testng.Assert;

public class RegistroDefinitions {

    private HomePage homePage;
    private RegistroPage registroPage;

    private MyAccountPage myAccountPage;

    public RegistroDefinitions() {
        this.homePage = new HomePage(Hooks.getDriver());
        this.registroPage = new RegistroPage(Hooks.getDriver());
        this.myAccountPage = new MyAccountPage(Hooks.getDriver());
    }

    @Y("que el usuario ingresa a la pamtalla de Register")
    public void queElUsuarioIngresaALaPamtallaDeRegister() {

        homePage.clickMyAccount();
        homePage.clickRegisterDropdown();

    }

    @Cuando("el usuario completa correctamente el formulario de registro")
    public void elUsuarioCompletaCorrectamenteElFormularioDeRegistro() {

        registroPage.completarFormulario(
                Hooks.getProperty("firstName"),
                Hooks.getProperty("lastName"),
                Hooks.getProperty("email"),
                Hooks.getProperty("phone"),
                Hooks.getProperty("passwordInput"),
                Hooks.getProperty("confirmPasswordInput")
        );
    }

    @Entonces("el usuario se encuentra registrado correctamente")
    public void elUsuarioSeEncuentraRegistradoCorrectamente() {

        Assert.assertTrue(myAccountPage.validarCuentaCreada());

    }

    //------------ Registro invalido ------------------------//

    @Cuando("el usuario completa el formulario de registro con información incorrecta")
    public void elUsuarioCompletaElFormularioDeRegistroConInformaciónIncorrecta() {

        registroPage.completarFormularioIncorrecto(
                Hooks.getProperty("firstName"),
                Hooks.getProperty("lastName"),
                Hooks.getProperty("email"),
                Hooks.getProperty("phone"),
                Hooks.getProperty("passwordInput"),
                Hooks.getProperty("confirmPasswordInput")
        );
    }

    @Entonces("se lee en pantalla un mensaje de error")
    public void seLeeEnPantallaUnMensajeDeError() {

        Assert.assertTrue(registroPage.registroInvalido());

    }
}
