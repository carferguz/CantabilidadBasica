package UDEA.ContabilidadBasicaSB02.domain;

import lombok.Data;

@Data
public class Empleado {
    private long id;
    private String correo;
    private String empresa;
    private String rol;
    private String nombre;
}
