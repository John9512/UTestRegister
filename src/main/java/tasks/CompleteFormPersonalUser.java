package tasks;

import model.DataFormUTestRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.UTestRegisterFormPersonalPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.UTestRegisterFormPersonalPage.*;

public class CompleteFormPersonalUser implements Task {

    private DataFormUTestRegister dataUser;

    public static CompleteFormPersonalUser personalData(DataFormUTestRegister dataFormUTestRegister) {
        return instrumented(CompleteFormPersonalUser.class, dataFormUTestRegister);
    }

    public CompleteFormPersonalUser(DataFormUTestRegister dataFormUTestRegister) {
        this.dataUser = dataFormUTestRegister;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataUser.getFirstName()).into(INPUT_FIRST_NAME),
                Enter.theValue(dataUser.getLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(dataUser.getEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(dataUser.getMonthBirth()).from(ENTER_MONTH_BIRTH),
                SelectFromOptions.byVisibleText(dataUser.getDayBirth()).from(ENTER_DAY_BIRTH),
                SelectFromOptions.byVisibleText(dataUser.getYearBirth()).from(ENTER_YEAR_BIRTH),
                Enter.theValue(dataUser.getLanguage()).into(INPUT_LENGUAGE),
                Click.on(BUTTON_NEXT_FORM_PAGE)
                );

    }


}
