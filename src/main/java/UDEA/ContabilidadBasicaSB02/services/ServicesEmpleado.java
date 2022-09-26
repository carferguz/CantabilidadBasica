package UDEA.ContabilidadBasicaSB02.services;

import UDEA.ContabilidadBasicaSB02.domain.Empleado;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServicesEmpleado {
    ArrayList<Empleado> listaEmpleados;

    public ServicesEmpleado(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    //Método lista de empleados:
    public ArrayList<Empleado> listarEmpleados() {
        return listaEmpleados;
    }
    //método agregar empresa;
    public Boolean addEmpelado(Empleado empleado) {
        Empleado objEmpleado = new Empleado();
        objEmpleado.setId(empleado.getId());
        objEmpleado.setNombre(empleado.getNombre());
        objEmpleado.setCorreo(empleado.getCorreo());
        objEmpleado.setEmpresa(empleado.getEmpresa());
        objEmpleado.setRol(empleado.getRol());

        listaEmpleados.add(objEmpleado);
        return Boolean.TRUE;
    }
    //Método buscar empleado por Id
    public Empleado buscarEmpleadoId(long id){
        Empleado employ = null;
        for (Empleado e : listaEmpleados ) {
            if (e.getId() == id){
                return e;
            }
        }
        return employ;
    }
    //Método borrar por id
    public Boolean borrarEmpleadoId(Empleado empleado){
        listaEmpleados.remove(empleado);
        return Boolean.TRUE;
    }

}
