package preguntas;

import iu.FormularioPaginaPrincipal;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class PaginaPrincipalQuestion {

    public static Question<String> mensajeBienvenida(){
        return actor -> TextContent.of(FormularioPaginaPrincipal.LBL_USERNAME)
                .viewedBy(actor).asString();
    }
}
