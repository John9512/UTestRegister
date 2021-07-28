package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.UTestMainPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenUpUtestPage implements Task {

    private UTestMainPage uTestMainPage;
    public static OpenUpUtestPage thePage() {
        return instrumented(OpenUpUtestPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(uTestMainPage),
                Click.on(UTestMainPage.Register_Button));
    }
}
