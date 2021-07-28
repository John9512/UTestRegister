package tasks;

import model.DataFormUTestRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.UTestRegisterFormDevicePage.*;

public class CompleteFormDeviceUser implements Task {
    private DataFormUTestRegister dataList;
    public static Performable deviceData(DataFormUTestRegister dataFormUTestRegister) {
        return instrumented(CompleteFormDeviceUser.class, dataFormUTestRegister);
    }

    public CompleteFormDeviceUser(DataFormUTestRegister dataList) {
        this.dataList = dataList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(AUTODETECTED,isVisible()).forNoMoreThan(2).seconds(),
                Click.on(CONT_COMPUTER_OS),
                Enter.theValue(dataList.getComputerOS()).into(INPUT_COMPUTER_OS).thenHit(Keys.ENTER),
                Click.on(CONT_VERSION_OS),
                Enter.theValue(dataList.getComputerVersion()).into(INPUT_VERSION_OS).thenHit(Keys.ENTER),
                Click.on(CONT_LENGUAGE_OS),
                Enter.theValue(dataList.getComputerLanguage()).into(INPUT_LENGUAGE_OS).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONT_MOBILE_DEVICE),
                Enter.theValue(dataList.getMobileBrand()).into(INPUT_MOBILE_DEVICE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONT_MOBILE_MODEL),
                Enter.theValue(dataList.getMobileModel()).into(INPUT_MOBILE_MODEL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(CONT_MOBILE_OS),
                Enter.theValue(dataList.getMobileOs()).into(INPUT_MOBILE_OS).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(BUTTON_NEXT_FORM_PAGE));

    }
}
