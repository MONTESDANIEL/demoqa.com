package demoqa1.com.tasks;

import demoqa1.com.userinterface.Interfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class AutoComplete implements Task {
    public static AutoComplete autoComplete() { return Tasks.instrumented(AutoComplete.class); }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Interfaces.WIDGET),
                Click.on(Interfaces.AUTO_COMPLETE)
        );
    }
}
