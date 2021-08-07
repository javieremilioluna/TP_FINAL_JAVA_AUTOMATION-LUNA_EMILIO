package tareas.ComprarConMastercard;
import iu.ComprarConMastercard.FormularioShoppingCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HacerClickEnConfirmTask implements Task{

    public HacerClickEnConfirmTask() {
    }

    public static HacerClickEnConfirmTask con(){
        return instrumented(HacerClickEnConfirmTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                //Pasos
                //1 - Click en boton CONFIRM
                Click.on(FormularioShoppingCart.BTN_CONFIRM)
        );
    }
}
