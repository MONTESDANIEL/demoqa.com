package demoqa1.com.tasks;

import demoqa1.com.model.DataDemoqa;
import demoqa1.com.userinterface.Interfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;


public class CompleteTxt implements Task {
    private DataDemoqa datos;
    public CompleteTxt(DataDemoqa datos) {
        this.datos = datos;
    }
    public static CompleteTxt elFormulario(DataDemoqa datos) { return Tasks.instrumented(CompleteTxt.class, datos); }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Interfaces.TXT_BLACK),
                Enter.theValue(datos.getStrBlack()).into(Interfaces.TXT_BLACK),
                Hit.the(Keys.ENTER).into(Interfaces.TXT_BLACK),
                Click.on(Interfaces.TXT_WHITE),
                Enter.theValue(datos.getStrWhite()).into(Interfaces.TXT_WHITE),
                Hit.the(Keys.ENTER).into(Interfaces.TXT_WHITE)
        );

    }
}
