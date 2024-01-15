package demoqa1.com.tasks;

import demoqa1.com.userinterface.Interfaces2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Alertas implements Task {
    public static Alertas alertas() { return Tasks.instrumented(Alertas.class); }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Interfaces2.AMV),
                Click.on(Interfaces2.ALERTAS)
        );
    }
}
