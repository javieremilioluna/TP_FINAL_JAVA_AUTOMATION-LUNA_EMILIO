package iu;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioLogin {

    //Mapeo para ingresar el nombre de usuario
    public static final Target TXT_USERNAME = Target.the("Caja de texto para ingresar el nombre de usuario")
            .locatedBy("//input[@name='username']");

    //Mapeo para ingresar la contraseña
    public static final Target TXT_PASSWORD = Target.the("Caja de texto para ingresar la contraseña")
            .locatedBy("//input[@name='password']");

    //Mapeo del boton Login
    public static final Target BTN_LOGIN = Target.the("Boton para iniciar sesion")
            .locatedBy("//input[@name='signon']");

    //Mapeo del label donde aparece el mensaje de error
    public static final Target LBL_MESSAGE_ERROR = Target.the("Mensaje de error")
            .locatedBy("ul[class='messages'] li");
}
