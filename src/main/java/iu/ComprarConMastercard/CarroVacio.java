package iu.ComprarConMastercard;

import net.serenitybdd.screenplay.targets.Target;

public class CarroVacio {

    //Mapeo del boton de carro
    public static final Target BTN_CARRO = Target.the("Boton para ir al carro")
            .locatedBy("//img[@name='img_cart']");

    //Mapeo del label de carro vacio
    public static final Target LBL_CARRO_VACIO = Target.the("Label de carro vacio")
            .locatedBy("//b[normalize-space()='Your cart is empty.']");
}
