package src.main.java.com.contablebasic.ciclo3.model;

public class empleado {
    //variables
    private char id;
    private String correo;
    private String empresa;
    private String rol;
    private String nombre;

    //constructor
    public empleado() {
    }

    //lectura y escritura de las variables


    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
