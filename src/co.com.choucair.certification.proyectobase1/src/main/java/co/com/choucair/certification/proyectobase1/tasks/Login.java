package co.com.choucair.certification.proyectobase1.tasks;

import co.com.choucair.certification.proyectobase1.userinterface.ChoucairLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
    actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON),
            Enter.theValue("Ingresa tu nombre").into(ChoucairLoginPage.NAME),
            Enter.theValue("Ingresa tu nombre completo").into(ChoucairLoginPage.LAST_NAME),
            Enter.theValue("Ingresa tu Email").into(ChoucairLoginPage.EMAIL),
            Enter.theValue("Ingresa tu mes de nacimiento").into(ChoucairLoginPage.DATE_OF_BIRTH_M),
            Enter.theValue("Ingresa tu día de nacimiento").into(ChoucairLoginPage.DATE_OF_BIRTH_D),
            Enter.theValue("Ingresa tu año de nacimiento").into(ChoucairLoginPage.DATE_OF_BIRTH_Y),
            Enter.theValue("Ingresa tu idioma").into(ChoucairLoginPage.LANGUAGES),
            Click.on(ChoucairLoginPage.BUTTON_CONFIRMATION)

    );
    }
}
