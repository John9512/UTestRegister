package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DataFormUTestRegister;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.answer;
import tasks.*;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static util.Constant.ZERO;

public class UTestRegisterStepDefinitions {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^than John wants to create a new account at utest page with a registration form$")
    public void asJohnWantsToCreateANewAccountAtUTestPageWithARegistrationForm(){
        theActorCalled("John").wasAbleTo(OpenUpUtestPage.thePage());
    }

    @When("^he completes the registration form$")
    public void heCompletesTheRegistrationForm(List<DataFormUTestRegister> dataUser) throws Exception {
        theActorInTheSpotlight().attemptsTo(
                CompleteFormPersonalUser.personalData(dataUser.get(ZERO)),//Diligenciar.losDatosPersonales
                CompleteFormAddressUser.addressData(dataUser.get(ZERO)),//DiligenciarLa.informacionDeUbicacion
                CompleteFormDeviceUser.deviceData(dataUser.get(ZERO)),//Seleccionar.laConfiguracionDeLosDispositivos
                CompleteFormPasswordUser.passwordData(dataUser.get(ZERO)));//Definir.losDatosDeSeguridad
    }

    @Then("^he sees the checkout label$")
    public void heSeesTheCheckoutLabel(List<DataFormUTestRegister> dataUser) throws Exception {
        theActorInTheSpotlight().should(seeThat(answer.the(dataUser.get(ZERO))));
    }


}
