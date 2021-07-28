package tasks;

import model.DataFormUTestRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.UTestRegisterFormAddressPage.*;

public class CompleteFormAddressUser implements Task {

    private DataFormUTestRegister dataUser;

    public static CompleteFormAddressUser addressData(DataFormUTestRegister dataFormUTestRegister) {
        return  instrumented(CompleteFormAddressUser.class, dataFormUTestRegister);
    }

    public CompleteFormAddressUser(DataFormUTestRegister dataFormUTestRegister) {
        this.dataUser = dataFormUTestRegister;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(CHECK_NAME,isVisible()).forNoMoreThan(2).seconds(),
                Click.on( INPUT_CITY_NAME ),
                Enter.theValue(dataUser.getCity()).into(INPUT_CITY_NAME),
                Hit.the(Keys.DOWN).keyIn(INPUT_CITY_NAME),
                Hit.the(Keys.ENTER).keyIn(INPUT_CITY_NAME),
                Enter.theValue(dataUser.getPostalCode()).into(INPUT_ZIP_CITY),
                Click.on( CONTENT_COUNTRY ),
                Enter.theValue(dataUser.getCountry()).into(INPUT_COUNTRY).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(BUTTON_NEXT_FORM_PAGE));
    }
}
