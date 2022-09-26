package UDEA.ContabilidadBasicaSB02.controller;

import UDEA.ContabilidadBasicaSB02.domain.MovimientoDinero;
import UDEA.ContabilidadBasicaSB02.services.ServicesMovimientoDinero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/movimiento/")//http://localhost:8080/empresa/listaMovimientos
public class ControllerMovimientoDinero {
    @Autowired
    ServicesMovimientoDinero servicesMovimientoDinero;

    //Obtener movimientos
    @GetMapping(path = "/listaMovimientos", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<MovimientoDinero> listaMovimientos(){
        System.out.println("Ingreso al mètodo ListaMovimiento");
        return servicesMovimientoDinero.listarMovimientos();
    }
    //Obtener movimiento con el id
    @GetMapping(path = "/obtenerMovimientoId/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MovimientoDinero> obtenerMovimientoId(@PathVariable long id){
        System.out.println("ingreso al método buscapersona por id");
        MovimientoDinero md = servicesMovimientoDinero.buscarMovimientoId(id);
        if (md != null){
            return new ResponseEntity<MovimientoDinero>(md, HttpStatus.OK);
        }else {
            return new ResponseEntity("Error de ejecución", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //Agregar un empleado
    @PostMapping(path = "/crearMovimientos", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MovimientoDinero> agregarEmpleado(@RequestBody MovimientoDinero movimientoDinero){
        System.out.println("ingreso al método agregar empleado");
        Boolean salida = servicesMovimientoDinero.addMovimiento(movimientoDinero);
        if (salida == true){
            return new ResponseEntity<MovimientoDinero>(movimientoDinero, HttpStatus.OK);
        }else {
            return new ResponseEntity("Error de ejecución", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //Borrar Empleado
    @DeleteMapping(path = "/user/borrarEmpleado/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> borrarEmpleado(@PathVariable long id){
        System.out.println("ingreso al método borrar epor id");
        MovimientoDinero md = servicesMovimientoDinero.buscarMovimientoId(id);
        Boolean salida = servicesMovimientoDinero.borrarMovimientoId(md);
        return new ResponseEntity<Boolean>(salida, HttpStatus.OK);
    }

}
