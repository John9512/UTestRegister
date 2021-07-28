package questions;

import model.DataFormUTestRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.UTestRegisterFormPasswordPage;

public class Responder implements Question {

    private DataFormUTestRegister dataList;

    public static Responder the(DataFormUTestRegister dataFormUTestRegister) {
        return new Responder(dataFormUTestRegister);
    }

    public Responder(DataFormUTestRegister dataList) {
        this.dataList = dataList;
    }

    @Override
    public Object answeredBy(Actor actor) {
        String Validate_Label = Text.of(UTestRegisterFormPasswordPage.lABEL_TO_VALIDATE).viewedBy(actor).asString();
        return dataList.getValidateLabel().equals(Validate_Label);

    }
}
