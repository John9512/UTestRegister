package questions;

import model.DataFormUTestRegister;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.UTestRegisterFormPasswordPage;

public class answer implements Question {

    private DataFormUTestRegister dataList;

    public static answer the(DataFormUTestRegister dataFormUTestRegister) {
        return new answer(dataFormUTestRegister);
    }

    public answer(DataFormUTestRegister dataList) {
        this.dataList = dataList;
    }

    @Override
    public Object answeredBy(Actor actor) {
        String Validate_Label = Text.of(UTestRegisterFormPasswordPage.lABEL_TO_VALIDATE).viewedBy(actor).asString();
        return dataList.getValidateLabel().equals(Validate_Label);

    }
}
