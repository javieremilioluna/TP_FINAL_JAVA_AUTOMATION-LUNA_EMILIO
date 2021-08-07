package tareas.ComprarConMastercard;
import iu.ComprarConMastercard.FormularioShoppingCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HacerClickEnCheckoutTask implements Task{

    public HacerClickEnCheckoutTask() {
    }

    public static HacerClickEnCheckoutTask con(){
        return instrumented(HacerClickEnCheckoutTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                //Pasos
                //1 - Click en boton checkout
                Click.on(FormularioShoppingCart.BTN_CHECKOUT)
        );
    }

}
