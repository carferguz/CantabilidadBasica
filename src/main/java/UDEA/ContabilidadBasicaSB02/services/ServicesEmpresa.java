package UDEA.ContabilidadBasicaSB02.services;


import UDEA.ContabilidadBasicaSB02.domain.Empresa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServicesEmpresa {
    ArrayList <Empresa> listaEmpresas;

    public ServicesEmpresa(ArrayList<Empresa> listaEmpresas) {
        this.listaEmpresas = listaEmpresas;
    }

    //Método lista de empleados:
    public ArrayList<Empresa> listarEmpresas() {
        return listaEmpresas;
    }

    //método agregar empresa;
    public Boolean addEmpresa(Empresa empresa) {
        Empresa objEmpresa = new Empresa();
        objEmpresa.setId(empresa.getId());
        objEmpresa.setName(empresa.getName());
        objEmpresa.setAddress(empresa.getAddress());
        objEmpresa.setPhone(empresa.getPhone());
        objEmpresa.setDocument(empresa.getDocument());

        listaEmpresas.add(objEmpresa);
        return Boolean.TRUE;
    }
    //Método buscar empresa por Id
    public Empresa buscarEmpresaId(long id){
        Empresa empresa = null;
        for (Empresa e : listaEmpresas ) {
            if (e.getId() == id){
                return e;
            }
        }
        return empresa;
    }
    //Método borrar por id
    public Boolean borrarEmpresaId(Empresa empresa){
        listaEmpresas.remove(empresa);
        return Boolean.TRUE;
    }
}
