package demoqa1.com.stepdefinitions;

import demoqa1.com.enums.TxtText;
import demoqa1.com.model.DataDemoqa;
import demoqa1.com.questions.QuestionTxt;
import demoqa1.com.tasks.AutoComplete;
import demoqa1.com.tasks.CompleteTxt;
import io.cucumber.java.*;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import java.util.Map;
import static com.google.common.base.Predicates.equalTo;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StepdefinitionsDemoqa {
    @Before
    public void prepararEscenario() {
        setTheStage(new OnlineCast());
        theActorCalled("Daniel");
    }
    @Given("El usuario accede al sitio web demoqa.com")
    public void elUsuarioAccedeAlSitioWebDemoqaCom() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://demoqa.com/"));
    }
    @When("Se busca en la pagina los espacios para completar")
    public void seBuscaEnLaPaginaLosEspaciosParaCompletar() {
        OnStage.theActorInTheSpotlight().attemptsTo(AutoComplete.autoComplete());
    }
    @And("Se completan los campos requeridos")
    public void seCompletanLosCamposRequeridos(DataDemoqa datos) {
        theActorInTheSpotlight().attemptsTo(CompleteTxt.elFormulario(datos));
    }
    @Then("Se verifica la realizacion del proceso")
    public void seVerificaLaRealizacionDelProceso() {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(QuestionTxt.value(), equalTo(TxtText.TXT_TEXT.getMesaje()))
        );
    }
    @DataTableType
    public DataDemoqa DataDemoqa(@Transpose Map<String, String> entry){
        return new DataDemoqa(
                entry.get("strBlack"),
                entry.get("strWhite")
        );

    }
}
