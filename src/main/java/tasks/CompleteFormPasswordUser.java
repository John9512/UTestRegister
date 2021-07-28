package tasks;

import model.DataFormUTestRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.UTestRegisterFormPasswordPage.*;

public class CompleteFormPasswordUser implements Task {
    private DataFormUTestRegister dataList;
    public static CompleteFormPasswordUser passwordData(DataFormUTestRegister dataFormUTestRegister) {
        return instrumented(CompleteFormPasswordUser.class,dataFormUTestRegister);
    }

    public CompleteFormPasswordUser(DataFormUTestRegister dataList) {
        this.dataList = dataList;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(dataList.getPassword()).into(INPUT_PASSWORD),
                Enter.theValue(dataList.getPassword()).into(CONFIRM_PASSWORD),
                Click.on(CHECK_INFORMED),
                Click.on(CHECK_TERMS),
                Click.on(CHECK_PRIVACY),
                Click.on(BUTTON_NEXT_FORM_PAGE));
    }
}
