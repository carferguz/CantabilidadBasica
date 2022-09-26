package UDEA.ContabilidadBasicaSB02.controller;

import UDEA.ContabilidadBasicaSB02.domain.Empresa;
import UDEA.ContabilidadBasicaSB02.services.ServicesEmpresa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/empresa/")//http://localhost:8080/empresa/listaEmpresas
public class ControllerEmpresa {
    @Autowired
    ServicesEmpresa servicesEmpresa;

    //Obtener empresas
    @GetMapping(path = "/listaEmpresas", produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<Empresa> listaEmpresas(){
        System.out.println("Ingreso al mètodo ListaEmpleado");
        return servicesEmpresa.listarEmpresas();
    }
    //Obtener empresa con el id
    @GetMapping(path = "/obtenerEmpresaId/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Empresa> obtenerEmpresaId(@PathVariable long id){
        System.out.println("ingreso al método buscar empresa por id");
        Empresa em = servicesEmpresa.buscarEmpresaId(id);
        if (em != null){
            return new ResponseEntity<Empresa>(em, HttpStatus.OK);
        }else {
            return new ResponseEntity("Error de ejecución", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //Agregar un empresa
    @PostMapping(path = "/crearEmpresa", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Empresa> agregarEmpleado(@RequestBody Empresa empresa){
        System.out.println("ingreso al método agregar empresa");
        Boolean salida = servicesEmpresa.addEmpresa(empresa);
        if (salida == true){
            return new ResponseEntity<Empresa>(empresa, HttpStatus.OK);
        }else {
            return new ResponseEntity("Error de ejecución", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    //Borrar Empresa
    @DeleteMapping(path = "/borrarEmpresa/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Boolean> borrarEmpresa(@PathVariable long id){
        System.out.println("ingreso al método borrar por id");
        Empresa e = servicesEmpresa.buscarEmpresaId(id);
        Boolean salida = servicesEmpresa.borrarEmpresaId(e);
        return new ResponseEntity<Boolean>(salida, HttpStatus.OK);
    }

}
