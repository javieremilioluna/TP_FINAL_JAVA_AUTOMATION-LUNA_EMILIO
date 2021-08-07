package tareas.ComprarConMastercard;
import iu.ComprarConMastercard.CarroVacio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerificarCarroVacioTask implements Task {

    public VerificarCarroVacioTask() {
    }

    public static VerificarCarroVacioTask con(){
        return instrumented(VerificarCarroVacioTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                //Pasos
                //1 - Click en boton de carro
                Click.on(CarroVacio.BTN_CARRO)
        );
    }


}
