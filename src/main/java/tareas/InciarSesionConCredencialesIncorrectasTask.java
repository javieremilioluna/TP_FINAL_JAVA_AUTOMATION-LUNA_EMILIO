package tareas;

import iu.FormularioLogin;
import iu.FormularioPaginaPrincipal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InciarSesionConCredencialesIncorrectasTask implements Task{

    private String username;
    private String password;

    public InciarSesionConCredencialesIncorrectasTask(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static IniciarSesionTask con(String username, String password){
        return instrumented(IniciarSesionTask.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        //Acciones necesarias
        //1- Ir al formulario de login
        //2- Ingresar el usuario
        //3- Ingresar el password
        //4- Click en login

        actor.attemptsTo(
                Click.on(FormularioPaginaPrincipal.BTN_SIGN_IN),
                Enter.theValue(this.username).into(FormularioLogin.TXT_USERNAME),
                Enter.theValue(this.password).into(FormularioLogin.TXT_PASSWORD),
                Click.on(FormularioLogin.BTN_LOGIN)
        );
    }

}
