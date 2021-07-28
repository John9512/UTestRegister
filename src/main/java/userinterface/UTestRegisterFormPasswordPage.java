package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UTestRegisterFormPasswordPage extends PageObject {
    public static final Target INPUT_PASSWORD = Target.the("field to enter the password").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[3]/div[1]/input"));
    public static final Target CONFIRM_PASSWORD = Target.the(" field to confirm the previous passwors").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[3]/div[2]/input"));
    public static final Target CHECK_INFORMED = Target.the ("check for confirm the stay informed").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[4]/label[1]/span[1]"));
    public static final Target CHECK_TERMS = Target.the ("check the confirm for agree the terms and conditions").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_PRIVACY = Target.the("check the conform for agree the privacy and security policy").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_NEXT_FORM_PAGE = Target.the("Button for next to form page").located(org.openqa.selenium.By.id("laddaBtn"));
    public static final Target lABEL_TO_VALIDATE = Target.the("Label for to identify that the test was finished").located(By.xpath("//span[contains(text(),'The last step')]"));
}
