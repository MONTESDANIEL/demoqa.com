package demoqa1.com.questions;

import demoqa1.com.userinterface.Interfaces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class QuestionTxt implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return Interfaces.TXT_VAL_WHITE.resolveFor(actor).getText();
    }
    public static net.serenitybdd.screenplay.Question<String> value() {return new QuestionTxt();}
}
