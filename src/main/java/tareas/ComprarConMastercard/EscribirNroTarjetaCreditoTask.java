package tareas.ComprarConMastercard;

import iu.ComprarConMastercard.FormularioShoppingCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class EscribirNroTarjetaCreditoTask implements Task {

    private String nroTarjeta;

    public EscribirNroTarjetaCreditoTask(String nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    public static EscribirNroTarjetaCreditoTask con(String nroTarjeta){
        return instrumented(EscribirNroTarjetaCreditoTask.class, nroTarjeta);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                //Pasos
                //1- Ingresar el numero de tarjeta en el textbox
                //2- Click en boton continue

                Enter.theValue(this.nroTarjeta).into(FormularioShoppingCart.TXT_NRO_CARD),
                Click.on(FormularioShoppingCart.BTN_CONTINUE)
        );
    }
}
