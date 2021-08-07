package iu;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioPaginaPrincipal {
    //Mapeo del boton Sign in
    public static final Target BTN_SIGN_IN = Target.the("Boton para ir al formulario de iniciar sesion")
                                                   .locatedBy("//a[normalize-space()='Sign In']");
    //Mapeo del label de bienvenida
    public static final Target LBL_USERNAME = Target.the("Label de bienvenida")
                                                   .locatedBy("#WelcomeContent");

    //Mapeo del TextBox de busqueda
    public static final Target TXT_BUSQUEDA = Target.the("Textbox para ingresar el tipo de mascota")
            .locatedBy("//input[@name='keyword']");

    //Mapeo del boton Search
    public static final Target BTN_SEARCH = Target.the("Boton para hacer busqueda de mascotas")
            .locatedBy("//input[@name='searchProducts']");


}
