package iu.ComprarConMastercard;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioShoppingCart {


    //Mapeo del label Subtotal
    public static final Target LBL_SUBTOTAL =Target.the("label Subtotal")
            .locatedBy("//td[normalize-space()='Sub Total: $5.29']");

    //Mapeo del boton Checkout
    public static final Target BTN_CHECKOUT =Target.the("Boton para iniciar compra")
            .locatedBy("//a[normalize-space()='Proceed to Checkout']");

    //Mapeo del label Payment Details
    public static final Target LBL_PAYMENT_DETAILS =Target.the("label Payment Details")
            .locatedBy("//th[normalize-space()='Payment Details']");

    //Mapeo del label Billing Address
    public static final Target LBL_BILLING_ADDRESS =Target.the("label Billing Address")
            .locatedBy("//th[normalize-space()='Billing Address']");

    //Mapeo del COMBOBOX de tipo de tarjeta
    public static final Target COMBO_TIPO_TARJETA = Target.the("COMBOBOX para seleccionar tipo de tarjeta")
            .locatedBy("//select[@name='order.cardType']");

    //Mapeo del textbox de numero de tarjeta de credito
    public static final Target TXT_NRO_CARD =Target.the("textbox de numero de tarjeta de credito")
            .locatedBy("//input[@name='order.creditCard']");

    //Mapeo del boton CONTINUE
    public static final Target BTN_CONTINUE =Target.the("boton CONTINUE")
            .locatedBy("//input[@name='newOrder']");

    //Mapeo del label confirmar informacion
    public static final Target LBL_CONFIRMAR =Target.the("label confirmar informacion")
            .locatedBy("//div[@id='Catalog']");

    //Mapeo del boton CONFIRM
    public static final Target BTN_CONFIRM =Target.the("boton CONFIRM")
            .locatedBy("//a[normalize-space()='Confirm']");

    //Mapeo del label TKANK YOU
    public static final Target LBL_THANK_YOU =Target.the("label label TKANK YOU")
            .locatedBy("//li[normalize-space()='Thank you, your order has been submitted.']");


}
