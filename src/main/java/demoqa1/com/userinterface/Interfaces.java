package demoqa1.com.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Interfaces {

    public static final Target WIDGET = Target.the("Seleccionar opcion widget")
            .located(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[1]"));
    public static final Target AUTO_COMPLETE = Target.the("Seleccionar opcion AutoComplete")
            .located(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[2]/*[1]"));
    public static final Target TXT_BLACK = Target.the("Escribir el texto correspondiente (Black)")
            .located(By.xpath("//*[@id='autoCompleteMultipleInput']"));
    public static final Target TXT_WHITE = Target.the("Escribir el texto correspondiente (White)")
                .located(By.xpath("//input[@id='autoCompleteSingleInput']"));
    public static final Target TXT_VAL_WHITE = Target.the("Validar el texto (White)")
                    .located(By.xpath("//div[contains(text(),'White')]"));


}
