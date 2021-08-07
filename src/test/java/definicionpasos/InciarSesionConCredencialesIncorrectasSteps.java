package definicionpasos;
import io.cucumber.java.es.*;
import navegacion.NavegateTo;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.core.StringContains;
import preguntas.InciarSesionConCredencialesIncorrectasQuestion;
import tareas.InciarSesionConCredencialesIncorrectasTask;

public class InciarSesionConCredencialesIncorrectasSteps {

    private String nombre_actor = "Javier";

    @Dado("en la pagina principal de Pet Store")
    public void en_la_pagina_principal_de_Pet_Store() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(this.nombre_actor).attemptsTo(
                NavegateTo.paginaPrincipal()
        );
    }

    @Cuando("intento iniciar sesion con los valores {string} y {string}")
    public void intento_iniciar_sesion_con_los_valores_y(String usuario, String password) {

        OnStage.theActor(this.nombre_actor).attemptsTo(
                InciarSesionConCredencialesIncorrectasTask.con(usuario, password)
        );

        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("El textbox usuario se encuentra vacio",
                        InciarSesionConCredencialesIncorrectasQuestion.cajaUserVacia(),
                        StringContains.containsString("")
                )
        );

        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("El textbox password se encuentra vacio",
                        InciarSesionConCredencialesIncorrectasQuestion.cajaPasswordVacia(),
                        StringContains.containsString("")
                )
        );

        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("El boton search habilitado",
                        InciarSesionConCredencialesIncorrectasQuestion.esVisbleBotonLogin()
                )
        );


    }

    @Entonces("se observa el mensaje {string}")
    public void se_observa_el_mensaje(String message) {

        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("El mensaje informando el error",
                        InciarSesionConCredencialesIncorrectasQuestion.mensajeError(),
                        StringContains.containsString(message)
                )
        );

    }

}
