package tareas.ComprarConMastercard;
import iu.CatalogoDeResultados;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class HacerClickEnFishChinoTask implements Task{

    public HacerClickEnFishChinoTask() {
    }

    public static HacerClickEnFishChinoTask con(){
        return instrumented(HacerClickEnFishChinoTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                //Pasos
                //1 - Click en boton fish chino
                Click.on(CatalogoDeResultados.BTN_FISH_CHINA)
        );
    }



}
