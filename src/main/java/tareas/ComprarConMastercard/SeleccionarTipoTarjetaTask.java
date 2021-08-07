package tareas.ComprarConMastercard;
import acciones.SelectDropDownListValue;
import iu.ComprarConMastercard.FormularioShoppingCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;


import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarTipoTarjetaTask implements Task{

    public SeleccionarTipoTarjetaTask() {
    }

    public static SeleccionarTipoTarjetaTask con(){
        return instrumented(SeleccionarTipoTarjetaTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                //Pasos
                //1 - Seleccionar MasterCard en combobox
                SelectDropDownListValue.valueTarget(FormularioShoppingCart.COMBO_TIPO_TARJETA, "MasterCard")
        );
    }

}
