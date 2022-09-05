package src.main.java.com.contablebasic.ciclo3;

import com.contablebasic.ciclo3.model.Empresa;
import com.contablebasic.ciclo3.model.MovimientoDinero;
import src.main.java.com.contablebasic.ciclo3.model.Empleado;

public class Contablebasic {
    public static void main (String[] args){
        MovimientoDinero dinero = new MovimientoDinero();
        dinero.setAmount(25000);
        float monto = dinero.getAmount();
        System.out.println();
        System.out.println("Se tiene un monto de: "+monto+" pesos Colombianos.");
        dinero.setAmount(30000);
        System.out.println("Se actualiaza el monto de: "+monto+" a: "+dinero.getAmount()+"pesos Colombianos.");


        Empleado instanciaEmpleado = new Empleado();
        instanciaEmpleado.setNombre("Alejandro");
        String jobName = instanciaEmpleado.getNombre();
        System.out.println();
        System.out.println("Trabajador de nombre: "+ jobName);
        instanciaEmpleado.setNombre("Estefania");
        System.out.println("Se cambia el nombre del trabajador "+jobName+" por el de: " +instanciaEmpleado.getNombre()+".");
        System.out.println();

        Empresa instanciaEmpresa = new Empresa();

        MovimientoDinero instanciaMovimiento = new MovimientoDinero();
        instanciaEmpresa.setName("Byte Best");
        String empresaOne = instanciaEmpresa.getName();
        System.out.println("Nombre de la empresa: "+ empresaOne);
        instanciaEmpresa.setName("New Empresa");
        System.out.println("Se actualiza la empresa: "+empresaOne +" por: "+instanciaEmpresa.getName()+".");




    }
}
