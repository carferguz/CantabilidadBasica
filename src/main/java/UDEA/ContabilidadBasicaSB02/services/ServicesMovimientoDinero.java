package UDEA.ContabilidadBasicaSB02.services;

import UDEA.ContabilidadBasicaSB02.domain.MovimientoDinero;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServicesMovimientoDinero {
    ArrayList<MovimientoDinero> listaMovimientos;

    public ServicesMovimientoDinero(ArrayList<MovimientoDinero> listaMovimientos) {
        this.listaMovimientos = listaMovimientos;
    }

    //Método lista de movimientos:
    public ArrayList<MovimientoDinero> listarMovimientos() {
        return listaMovimientos;
    }
    //método agregar movimientos;
    public Boolean addMovimiento(MovimientoDinero movimientoDinero) {
        MovimientoDinero objMovimientoDinero = new MovimientoDinero();
        objMovimientoDinero.setId(movimientoDinero.getId());
        objMovimientoDinero.setConcept(movimientoDinero.getConcept());
        objMovimientoDinero.setAmount(movimientoDinero.getAmount());

        listaMovimientos.add(objMovimientoDinero);
        return Boolean.TRUE;
    }
    //Método buscar movimiento por Id
    public MovimientoDinero buscarMovimientoId(long id){
        MovimientoDinero movi = null;
        for (MovimientoDinero e : listaMovimientos ) {
            if (e.getId() == id){
                return e;
            }
        }
        return movi;
    }
    //Método borrar por id
    public Boolean borrarMovimientoId(MovimientoDinero movimientoDinero){
        listaMovimientos.remove(movimientoDinero);
        return Boolean.TRUE;
    }
}
