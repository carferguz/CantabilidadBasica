package com.contablebasic.ciclo3.model;

public class Transaccion {
    //Atributos
    private long id;
    private String concept;
    private  float amount;
    private String createdAta;
    private String updatedAta;

    //Método constructor

    public Transaccion(){

    }

    // Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getConcept() {
        return concept;
    }

    public void setConcept(String concept) {
        this.concept = concept;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getCreatedAta() {
        return createdAta;
    }

    public void setCreatedAta(String createdAta) {
        this.createdAta = createdAta;
    }

    public String getUpdatedAta() {
        return updatedAta;
    }

    public void setUpdatedAta(String updatedAta) {
        this.updatedAta = updatedAta;
    }
}
