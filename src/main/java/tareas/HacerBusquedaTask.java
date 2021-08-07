package tareas;
import iu.FormularioPaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class HacerBusquedaTask implements Task  {

    private String tipo_mascota;

    public HacerBusquedaTask(String tipo_mascota) {
        this.tipo_mascota = tipo_mascota;
    }

    public static HacerBusquedaTask con(String tipo_mascota){
        return instrumented(HacerBusquedaTask.class, tipo_mascota);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Acciones necesarias para hacer busqueda
        //1- Ir a la pagina principal
        //2- Ingresar el tipo_mascota en el textbox de busqueda
        //3- Click en Search

        actor.attemptsTo(
                Click.on(FormularioPaginaPrincipal.TXT_BUSQUEDA),
                Enter.theValue(this.tipo_mascota).into(FormularioPaginaPrincipal.TXT_BUSQUEDA),
                Click.on(FormularioPaginaPrincipal.BTN_SEARCH)
        );
    }

}
