package demoqa1.com.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Interfaces2 {
    public static final Target AMV = Target.the("Seleccionar opcion (Alertas, marco y ventanas)")
            .located(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]"));
    public static final Target ALERTAS = Target.the("Seleccionar opcion (Alertas)")
            .located(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[2]/*[1]"));
    public static final Target BTN1 = Target.the("Boton alerta inmediata")
            .located(By.xpath("//button[@id='alertButton']"));
    public static final Target BTN2 = Target.the("Boton alerta 5seg")
                .located(By.xpath("//button[@id='timerAlertButton']"));
    public static final Target BTN3 = Target.the("Boton alerta confirmacion")
                .located(By.xpath("//button[@id='confirmButton']"));
    public static final Target BTN4 = Target.the("Boton alerta cuadro de aviso")
                .located(By.xpath("//button[@id='promtButton']"));
}
