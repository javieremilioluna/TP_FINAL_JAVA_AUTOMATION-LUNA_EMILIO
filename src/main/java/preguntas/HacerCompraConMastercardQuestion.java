package preguntas;
import iu.CatalogoDeResultados;
import iu.ComprarConMastercard.CarroVacio;
import iu.ComprarConMastercard.FormularioShoppingCart;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import net.serenitybdd.screenplay.questions.Visibility;

public class HacerCompraConMastercardQuestion {

    public static Question<String> mensajeCarroVacio(){
        return actor -> TextContent.of(CarroVacio.LBL_CARRO_VACIO)
                .viewedBy(actor).asString();
    }

    public static Question<String> mensajeGoldFish(){
        return actor -> TextContent.of(CatalogoDeResultados.LBL_GOLDFISH)
                .viewedBy(actor).asString();
    }

    public static Question<String> mensajeSubTotal(){
        return actor -> TextContent.of(FormularioShoppingCart.LBL_SUBTOTAL)
                .viewedBy(actor).asString();
    }

    public static Question<Boolean> esVisbleLabelPaymentDetails(){
        return actor -> Visibility.of(FormularioShoppingCart.LBL_PAYMENT_DETAILS).viewedBy(actor).resolve();
    }

    public static Question<Boolean> esVisbleLabelBillingAddress(){
        return actor -> Visibility.of(FormularioShoppingCart.LBL_BILLING_ADDRESS).viewedBy(actor).resolve();
    }

    public static Question<String> mensajeConfirm(){
        return actor -> TextContent.of(FormularioShoppingCart.LBL_CONFIRMAR)
                .viewedBy(actor).asString();
    }

    public static Question<Boolean> esVisbleLabelThankYou(){
        return actor -> Visibility.of(FormularioShoppingCart.LBL_THANK_YOU).viewedBy(actor).resolve();
    }



}



























