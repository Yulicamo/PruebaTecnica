package co.com.choucair.certification.proyectobase1.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ChoucairLoginPage extends PageObject {

    public static  final Target LOGIN_BUTTON = Target.the
            ("Button that shows us the form to register").
            located(By.xpath("//*[@id=\"unauthenticated-dropdown-nav\"]/ul/li[6]/a"));

    public static final Target NAME= Target.the
            ("field to enter the firstName name").
            located(By.xpath("//*[@id=\"firstName\"]"));

    public static final Target LAST_NAME= Target.the
                    ("field to enter the full name").
            located(By.xpath("//*[@id=\"lastName\"]"));

    public static final Target EMAIL= Target.the
                    ("field to enter the email address").
            located(By.xpath("//*[@id=\"email\"]"));

    public static final Target DATE_OF_BIRTH_M= Target.the
                    ("field to enter the date of birth").
            located(By.xpath("//*[@id=\"birthMonth\"]"));

    public static final Target DATE_OF_BIRTH_D= Target.the
                    ("field to enter the date of birth").
            located(By.xpath("//*[@id=\"birthDay\"]"));

    public static final Target DATE_OF_BIRTH_Y= Target.the
                    ("field to enter the date of birth").
            located(By.xpath("//*[@id=\"birthYear\"]"));


    public static final Target LANGUAGES= Target.the
                    ("field to enter the languages").
            located(By.xpath("//*[@id=\"languages\"]/div[1]"));

    public static final Target BUTTON_CONFIRMATION= Target.the
                    ("button to confirm registration").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

}
