package demoqa1.com.tasks;

import demoqa1.com.userinterface.Interfaces2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.AlertAction;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CompleteAlertas implements Task {

    public static CompleteAlertas completeAlertas() {
        return instrumented(CompleteAlertas.class);
    }

    AlertAction alertAction = new AlertAction();
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Interfaces2.BTN1),
                alertAction.andAccept(),
                Click.on(Interfaces2.BTN2)
        );
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actor.attemptsTo(
                alertAction.andAccept(),
                Click.on(Interfaces2.BTN3),
                alertAction.andAccept(),
                Click.on(Interfaces2.BTN4)
        );
        getDriver().switchTo().alert().sendKeys("Daniel");
        getDriver().switchTo().alert().accept();
    }

}
