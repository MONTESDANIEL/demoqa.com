package demoqa1.com.questions;

import demoqa1.com.userinterface.Interfaces2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class QuestionAlert implements Question {
    @Override
    public String answeredBy(Actor actor) {
        return Interfaces2.BTN4.resolveFor(actor).getText();
    }
    public static net.serenitybdd.screenplay.Question<String> value() {return new QuestionAlert();}
}
