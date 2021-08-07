#language:es
@HacerBusqueda
Característica: Funcionalidad de Hacer Busqueda
  Como usuario deseo por loguearme en la pagina para realizar compras de mascotas


  @Simple
  Escenario: Busqueda exitosa
    Dado en la pagina principal
    Cuando realizo una busqueda con el valor "Fish"
    Entonces se visualiza una tabla con los resultados

  @Parametro
  Esquema del escenario: Busqueda exitosa - Con Parametro
    Dado en la pagina principal
    Cuando realizo una busqueda con el valor <tipo_mascota>
    Entonces se visualiza una tabla con los resultados
    Ejemplos:
      | tipo_mascota |
      | "Fish" |