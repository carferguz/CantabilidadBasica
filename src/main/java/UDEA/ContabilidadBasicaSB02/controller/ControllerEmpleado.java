package UDEA.ContabilidadBasicaSB02.controller;

import UDEA.ContabilidadBasicaSB02.domain.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import UDEA.ContabilidadBasicaSB02.services.ServicesEmpleado;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/empleado/")//http://localhost:8080/empleado/listaEmpleados
public class ControllerEmpleado {
    @Autowired
    ServicesEmpleado servicesEmpleado;

    //Obtener empleados
    @GetMapping(path = "/listaEmpleados", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Empleado> listaEmpleados(){
        System.out.println("Ingreso al mètodo ListaEmpleado");
        return servicesEmpleado.listarEmpleados();
    }
    //Obtener empleados con el id
    @GetMapping(path = "/user/obtenerEmpleadoId/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Empleado>obtenerEmpleadoId(@PathVariable long id){
        System.out.println("ingreso al método buscapersona por id");
        Empleado em = servicesEmpleado.buscarEmpleadoId(id);
        if (em != null){
            return new ResponseEntity<Empleado>(em, HttpStatus.OK);
        }else {
            return new ResponseEntity("Erroe deejecución", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //Agregar un empleado
    @PostMapping(path = "/crearEmpleado", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Empleado> agregarEmpleado(@RequestBody Empleado empleado){
        System.out.println("ingreso al método agregar empleado");
        Boolean salida = servicesEmpleado.addEmpelado(empleado);
        if (salida == true){
            return new ResponseEntity<Empleado>(empleado, HttpStatus.OK);
        }else {
            return new ResponseEntity("Error de ejecución", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //Borrar Empleado
    @DeleteMapping(path = "/user/borrarEmpleado/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> borrarEmpleado(@PathVariable long id){
        System.out.println("ingreso al método borrar epor id");
        Empleado e = servicesEmpleado.buscarEmpleadoId(id);
        Boolean salida = servicesEmpleado.borrarEmpleadoId(e);
        return new ResponseEntity<Boolean>(salida, HttpStatus.OK);
    }



}
