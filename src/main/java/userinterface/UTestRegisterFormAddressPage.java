package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestRegisterFormAddressPage {
    public static final Target INPUT_CITY_NAME = Target.the("field to write the city where the user lives").located(By.id("city"));
    public static final Target INPUT_ZIP_CITY = Target.the("field where to write the user last name ").located(By.id("zip"));
    public static final Target CONTENT_COUNTRY = Target.the("field that contents the list of countries").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]"));
    public static final Target INPUT_COUNTRY = Target.the("field where to write the user email ").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[4]/div[2]/div[1]/div[1]/input[1]"));
    public static final Target BUTTON_NEXT_FORM_PAGE = Target.the("Button for next to form page").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[2]/div[1]/a[1]"));

    public static final Target CHECK_NAME = Target.the("check to verified the name of city was autolocated ").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[1]/div[3]/div[1]/div[3]/span[2]/i[1]"));
}
