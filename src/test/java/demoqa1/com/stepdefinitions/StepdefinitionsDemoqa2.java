package demoqa1.com.stepdefinitions;

import demoqa1.com.enums.TxtAlert;
import demoqa1.com.questions.QuestionAlert;
import demoqa1.com.tasks.Alertas;
import demoqa1.com.tasks.CompleteAlertas;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StepdefinitionsDemoqa2 {
    @Before
    public void prepararEscenario() {
        setTheStage(new OnlineCast());
        theActorCalled("Daniel");
    }
    @Given("El usuario ingresa nuevamente al sitio web demoqa.com")
    public void elUsuarioIngresaNuevamenteAlSitioWebDemoqaCom() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://demoqa.com/"));
    }
    @When("Se dirige al apartado de las alertas")
    public void seDirigeAlApartadoDeLasAlertas() {
        OnStage.theActorInTheSpotlight().attemptsTo(Alertas.alertas());
    }
    @And("Valida las alertas")
    public void validaLasAlertas() {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteAlertas.completeAlertas());
    }
    @Then("Se verifica la validacion de las alertas")
    public void seVerificaLaValidacionDeLasAlertas() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(QuestionAlert.value(), equalTo(TxtAlert.TXT_ALERT.getMesaje()))
        );
    }
}
