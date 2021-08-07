package definicionpasos;
import io.cucumber.java.es.*;
import navegacion.NavegateTo;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.core.StringContains;
import preguntas.HacerBusquedaQuestion;
import tareas.HacerBusquedaTask;


public class HacerBusquedaSteps {

    private String nombre_actor = "Javier";

    @Dado("en la pagina principal")
    public void en_la_pagina_principal() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(this.nombre_actor).attemptsTo(
                NavegateTo.paginaPrincipal()
        );
    }

    @Cuando("realizo una busqueda con el valor {string}")
    public void realizo_una_busqueda_con_el_valor(String tipo_mascota) {

        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("El boton search habilitado",
                        HacerBusquedaQuestion.esVisbleBotonSearch()
                )
        );

        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("El textbox se encuentra vacio",
                        HacerBusquedaQuestion.cajaVacia(),
                        StringContains.containsString("")
                )
        );

        OnStage.theActor(this.nombre_actor).attemptsTo(
                HacerBusquedaTask.con(tipo_mascota)
        );

    }

    @Entonces("se visualiza una tabla con los resultados")
    public void se_visualiza_una_tabla_con_los_resultados() {


        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("La tabla con los resultados de la busqueda",
                        HacerBusquedaQuestion.esVisbleTablaResultados()
                )
        );

    }
}






























