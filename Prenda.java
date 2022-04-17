public abstract class Prenda {
    var TipoPrenda
    var material
    var colorPrincipal
    var colorSecundario
    
    Prenda(var unTipoDePrenda, var material, var colorPrincipal, var colorSecundario) {
        if(esValida(unTipoDePrenda)) {
            //inicializo atributos
    }

    method validacionDePrenda(){ // se va a implementar en las subclases
      
    }
}
const calzadosValidos;

class PrendaParteSuperior extends Prenda {

  

}
class PrendaParteInferior extends Prenda {

}

class PrendaAccesorios extends Prenda {

}

class PrendaCalzado extends Prenda {

}