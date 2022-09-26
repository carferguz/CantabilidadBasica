package UDEA.ContabilidadBasicaSB02.domain;

import lombok.Data;

@Data
public class MovimientoDinero {
    private long id;
    private String concept;
    private  float amount;
    private String createdAta;
    private String updatedAta;
}
