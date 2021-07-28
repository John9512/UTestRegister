package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestRegisterFormDevicePage extends PageObject {
    public static final Target AUTODETECTED = Target.the("field that verified if the page has autodetected elements").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/span/i"));

    public static final Target CONT_COMPUTER_OS = Target.the("Click to display the computer OS list").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target INPUT_COMPUTER_OS = Target.the("field where the OS ot the user's computer is entered").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/input[1]"));

    public static final Target CONT_VERSION_OS = Target.the("Click to display the computer OS version list").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/div[1]/span/i"));
    public static final Target INPUT_VERSION_OS = Target.the("field where the OS version ot the user's computer is entered").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[1]/div[2]/div[2]/div/input[1]"));

    public static final Target CONT_LENGUAGE_OS = Target.the("Click to display the computer OS lenguage list").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target INPUT_LENGUAGE_OS = Target.the("field where the OS lenguage ot the user's computer is entered").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[3]/div[2]/div[1]/input[1]"));

    public static final Target CONT_MOBILE_DEVICE = Target.the("Click to display the mobile device list").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/span[1]"));
    public static final Target INPUT_MOBILE_DEVICE = Target.the("field where the device ot the user's mobile is entered").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]"));

    public static final Target CONT_MOBILE_MODEL = Target.the("Click to display the mobile model list").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MOBILE_MODEL = Target.the("field where the device model ot the user's mobile is entered").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[2]/div[2]/div[1]/input[1]"));

    public static final Target CONT_MOBILE_OS = Target.the("Click to display the mobile OS list").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MOBILE_OS = Target.the("field where the OS ot the user's mobile is entered").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div[3]/div[2]/div[1]/input[1]"));

    public static final Target BUTTON_NEXT_FORM_PAGE = Target.the("Button for next to form page").located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/a[1]"));

}
