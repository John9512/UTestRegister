package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DataFormUTestRegister;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Responder;
import tasks.*;

import java.util.List;

import static util.Constant.ZERO;

public class UTestRegisterStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than John wants to create a new account at utest page with a registration form$")
    public void asJohnWantsToCreateANewAccountAtUTestPageWithARegistrationForm(){
        OnStage.theActorCalled("John").wasAbleTo(OpenUpUtestPage.thePage());
    }

    @When("^he completes the registration form$")
    public void heCompletesTheRegistrationForm(List<DataFormUTestRegister> dataUser) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteFormPersonalUser.personalData(dataUser.get(ZERO)),
                CompleteFormAddressUser.addressData(dataUser.get(ZERO)),
                CompleteFormDeviceUser.deviceData(dataUser.get(ZERO)),
                CompleteFormPasswordUser.passwordData(dataUser.get(ZERO)));
    }

    @Then("^he sees the checkout label$")
    public void heSeesTheCheckoutLabel(List<DataFormUTestRegister> dataUser) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.the(dataUser.get(ZERO))));
    }


}
