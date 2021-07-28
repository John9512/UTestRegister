package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestRegisterFormPersonalPage extends PageObject {
    public static final Target INPUT_FIRST_NAME = Target.the("field where to write the user first name ").located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("field where to write the user last name ").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("field where to write the user email ").located(By.id("email"));
    public static final Target ENTER_MONTH_BIRTH = Target.the("field where to select the user's month of birth").located(By.id("birthMonth"));
    public static final Target ENTER_DAY_BIRTH = Target.the("field where to select the user's day of birth").located(By.id("birthDay"));
    public static final Target ENTER_YEAR_BIRTH = Target.the("field where to select the user's year of birth").located(By.id("birthYear"));
    public static final Target INPUT_LENGUAGE = Target.the("field where to write the user main language").located(By.xpath("//*[@id='languages']/div[1]/input"));
    public static final Target BUTTON_NEXT_FORM_PAGE = Target.the("Button for next to form page").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/a[1]"));
}
