package tareas.ComprarConMastercard;
import iu.CatalogoDeResultados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HacerClickEnAddToCartItemEST21Task implements Task {

    public HacerClickEnAddToCartItemEST21Task() {
    }

    public static HacerClickEnAddToCartItemEST21Task con(){
        return instrumented(HacerClickEnAddToCartItemEST21Task.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                //Pasos
                //1 - Click en ADD TO CART de item EST21
                Click.on(CatalogoDeResultados.BTN_ADD_TO_CART_EST_21)
        );
    }
}
