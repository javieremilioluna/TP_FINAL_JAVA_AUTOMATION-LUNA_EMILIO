package preguntas;
import iu.CatalogoDeResultados;
import iu.FormularioPaginaPrincipal;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.questions.Visibility;

public class HacerBusquedaQuestion {


    public static Question<Boolean> esVisbleBotonSearch(){
        return actor -> Visibility.of(FormularioPaginaPrincipal.BTN_SEARCH).viewedBy(actor).resolve();
    }

    public static Question<String> cajaVacia(){
        return actor -> TextContent.of(FormularioPaginaPrincipal.TXT_BUSQUEDA)
                .viewedBy(actor).asString();
    }

    public static Question<Boolean> esVisbleTablaResultados(){
        return actor -> Visibility.of(CatalogoDeResultados.TBL_CATALOG).viewedBy(actor).resolve();
    }


}
