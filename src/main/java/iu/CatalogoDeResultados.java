package iu;

import net.serenitybdd.screenplay.targets.Target;

public class CatalogoDeResultados {

    //Mapeo de la tabla de resultados despues de hacer la busqueda
    public static final Target TBL_CATALOG = Target.the("Tabla de resultados de la busqueda")
            .locatedBy("//div[@id='Catalog']");

    //Mapeo del boton de mascota “Fresh Water fish from China”
    public static final Target BTN_FISH_CHINA = Target.the("Boton de mascota “Fresh Water fish from China")
            .locatedBy("//a[normalize-space()='Fresh Water fish from China']");

    //Mapeo del label Goldfish
    public static final Target LBL_GOLDFISH = Target.the("label Goldfish")
            .locatedBy("//h2[normalize-space()='Goldfish']");

    //Mapeo del boton de mascota Add To Cart del item “EST-21”
    public static final Target BTN_ADD_TO_CART_EST_21 = Target.the("boton de mascota Add To Cart del item “EST-21”")
            .locatedBy("   //tbody/tr[3]/td[5]/a[1]");


}
