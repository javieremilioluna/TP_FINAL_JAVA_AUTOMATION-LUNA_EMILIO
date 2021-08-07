package preguntas;

import iu.FormularioLogin;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.questions.Visibility;

public class InciarSesionConCredencialesIncorrectasQuestion {


    public static Question<String> cajaUserVacia(){
        return actor -> TextContent.of(FormularioLogin.TXT_USERNAME)
                .viewedBy(actor).asString();
    }

    public static Question<String> cajaPasswordVacia(){
        return actor -> TextContent.of(FormularioLogin.TXT_PASSWORD)
                .viewedBy(actor).asString();
    }

    public static Question<Boolean> esVisbleBotonLogin(){
        return actor -> Visibility.of(FormularioLogin.BTN_LOGIN).viewedBy(actor).resolve();
    }


    public static Question<String> mensajeError(){
        return actor -> TextContent.of(FormularioLogin.LBL_MESSAGE_ERROR)
                .viewedBy(actor).asString();
    }


}
