package definicionpasos;
import io.cucumber.java.es.*;
import navegacion.NavegateTo;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.core.StringContains;
import preguntas.HacerBusquedaQuestion;
import preguntas.HacerCompraConMastercardQuestion;
import preguntas.PaginaPrincipalQuestion;
import tareas.ComprarConMastercard.*;
import tareas.HacerBusquedaTask;
import tareas.IniciarSesionTask;

public class RealizarCompraConMasterCardSteps {

    private String nombre_actor = "Javier";

    @Dado("en la pagina principal del sitio PetStore")
    public void en_la_pagina_principal_del_sitio_PetStore() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(this.nombre_actor).attemptsTo(
                NavegateTo.paginaPrincipal()
        );
    }

    @Cuando("inicio sesion con los valores {string} y {string}")
    public void inicio_sesion_con_los_valores_y(String usuario, String password) {
        OnStage.theActor(this.nombre_actor).attemptsTo(
             IniciarSesionTask.con(usuario, password)
       );
    }

    @Entonces("ingresa correctamente a mi usuario mostrando el mensaje {string}")
    public void ingresa_correctamente_a_mi_usuario_mostrando_el_mensaje(String mensaje) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("El mensaje de bienvenida",
                        PaginaPrincipalQuestion.mensajeBienvenida(),
                        StringContains.containsString(mensaje)
                )
        );
    }

    @Entonces("el carro de compras se encuentra vacio mostrando el mensaje {string}")
    public void el_carro_de_compras_se_encuentra_vacio_mostrando_el_mensaje(String mensaje) {

        OnStage.theActor(this.nombre_actor).attemptsTo(
                VerificarCarroVacioTask.con()
        );

        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("El mensaje de carro vacio",
                        HacerCompraConMastercardQuestion.mensajeCarroVacio(),
                        StringContains.containsString(mensaje)
                )
        );

    }

    @Cuando("realizo una nueva busqueda con el valor {string}")
    public void realizo_una_nueva_busqueda_con_el_valor(String tipo_mascota) {

        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(this.nombre_actor).attemptsTo(
                NavegateTo.paginaPrincipal()
        );


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

    @Entonces("se visualiza una tabla con los resultados de la busqueda")
    public void se_visualiza_una_tabla_con_los_resultados_de_la_busqueda() {

        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("La tabla con los resultados de la busqueda",
                        HacerBusquedaQuestion.esVisbleTablaResultados()
                )
        );
    }

    @Cuando("hago click en el botón mascota")
    public void hago_click_en_el_botón_mascota() {

        OnStage.theActor(this.nombre_actor).attemptsTo(
                HacerClickEnFishChinoTask.con()
        );

    }

    @Entonces("se visualiza el texto {string}")
    public void se_visualiza_el_texto(String texto) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("El mensaje GoldFish",
                        HacerCompraConMastercardQuestion.mensajeGoldFish(),
                        StringContains.containsString(texto)
                )
        );
    }


    @Cuando("hago click en el botón Add to Cart del item ID EST")
    public void hago_click_en_el_botón_Add_to_Cart_del_item_ID_EST() {
                OnStage.theActor(this.nombre_actor).attemptsTo(
                HacerClickEnAddToCartItemEST21Task.con()
        );
    }


    @Entonces("se visualiza que contiene un {string}")
    public void se_visualiza_que_contiene_un(String subTotal) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("El mensaje subtotal de 5.29",
                        HacerCompraConMastercardQuestion.mensajeSubTotal(),
                        StringContains.containsString(subTotal)
                )
        );
    }

    @Cuando("al hacer click en el botón Proceed to Checkout")
    public void al_hacer_click_en_el_botón_Proceed_to_Checkout() {
        OnStage.theActor(this.nombre_actor).attemptsTo(
                HacerClickEnCheckoutTask.con()
        );
    }

    @Entonces("se visualiza en la pantalla {string} y {string}")
    public void se_visualiza_en_la_pantalla_y(String PaymentDetails, String BillingAddress) {


        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("la pantalla de pago con Payment Details",
                        HacerCompraConMastercardQuestion.esVisbleLabelPaymentDetails()

                ),

                GivenWhenThen.seeThat("la pantalla de pago con Billing Address",
                        HacerCompraConMastercardQuestion.esVisbleLabelBillingAddress()
                )
        );
    }

    @Cuando("selecciono Tipo_Tarjeta en el Combo Box Card Type")
    public void selecciono_Tipo_Tarjeta_en_el_Combo_Box_Card_Type() {
        OnStage.theActor(this.nombre_actor).attemptsTo(
                SeleccionarTipoTarjetaTask.con()
        );

    }


    @Cuando("ingreso el valor {string} en el textbox Card Number y hago Click en el botón Continue")
    public void ingreso_el_valor_en_el_textbox_Card_Number_y_hago_Click_en_el_botón_Continue(String nroTarjeta) {
               OnStage.theActor(this.nombre_actor).attemptsTo(
               EscribirNroTarjetaCreditoTask.con(nroTarjeta)
       );
    }



    @Entonces("se verifica que el mensaje contenga la frase {string}")
    public void se_verifica_que_el_mensaje_contenga_la_frase(String mensaje) {
        OnStage.theActorInTheSpotlight().should(
                GivenWhenThen.seeThat("El mensaje Please confirm de information",
                        HacerCompraConMastercardQuestion.mensajeConfirm(),
                        StringContains.containsString(mensaje)
                )
        );
    }

    @Cuando("al hacer Click en Confirm")
    public void al_hacer_Click_en_Confirm() {
        OnStage.theActor(this.nombre_actor).attemptsTo(
                HacerClickEnConfirmTask.con()
        );
    }


    @Entonces("se visualiza el mensaje de Thank you")
    public void se_visualiza_el_mensaje_de_Thank_you() {
        OnStage.theActorInTheSpotlight().should(

                GivenWhenThen.seeThat("el mensaje than you",
                        HacerCompraConMastercardQuestion.esVisbleLabelThankYou()
                )
        );
    }

}
