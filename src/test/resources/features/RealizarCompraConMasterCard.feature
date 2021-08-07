#language:es
@RealizarCompraConMasterCard
Característica: Funcionalidad de Realizar Compra Con MasterCard
  Como usuario deseo poder loguearme en la pagina para realizar compras de mascotas con tarjeta Mastercard

  Antecedentes:
    Dado en la pagina principal del sitio PetStore
    Cuando inicio sesion con los valores "testserenity" y "123456"
    Entonces ingresa correctamente a mi usuario mostrando el mensaje "Welcome"
    Entonces el carro de compras se encuentra vacio mostrando el mensaje "Your cart is empty."



  Escenario: Compra exitosa

    Dado en la pagina principal del sitio PetStore
    Cuando realizo una nueva busqueda con el valor "Fish"
    Entonces se visualiza una tabla con los resultados de la busqueda
        Cuando  hago click en el botón mascota
        Entonces se visualiza el texto "Goldfish"
        Cuando hago click en el botón Add to Cart del item ID EST
        Entonces se visualiza que contiene un "Sub Total: $5.29 "
        Cuando al hacer click en el botón Proceed to Checkout
        Entonces se visualiza en la pantalla "Payment Details" y "Billing Address"
        Cuando selecciono Tipo_Tarjeta en el Combo Box Card Type
        Cuando ingreso el valor "5151741914248443" en el textbox Card Number y hago Click en el botón Continue
        Entonces se verifica que el mensaje contenga la frase "Please confirm the information"
        Cuando al hacer Click en Confirm
        Entonces se visualiza el mensaje de Thank you



