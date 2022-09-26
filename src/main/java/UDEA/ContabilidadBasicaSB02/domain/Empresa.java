package UDEA.ContabilidadBasicaSB02.domain;

import lombok.Data;

@Data
public class Empresa {
    private long id;
    private String name;
    private String document;
    private String  phone;
    private String  address;
    private String createdAt;
    private String  updatedAt;
}
