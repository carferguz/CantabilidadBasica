package com.contablebasic.ciclo3.model;

//import java.time.format.DateTimeFormatter;

public class empresa {
    //Atributos
    private char id;
    private String[] name;
    private String [] document;
    private String [] phone;
    private String [] address;
    private String [] createdAt;
    private String [] updatedAt;

    // metodo constructor
    public empresa() {
    }

    public char getId() {
        return id;
    }

    public void setId(char id) {
        this.id = id;
    }

    public String[] getName() {
        return name;
    }

    public void setName(String[] name) {
        this.name = name;
    }

    public String[] getDocument() {
        return document;
    }

    public void setDocument(String[] document) {
        this.document = document;
    }

    public String[] getPhone() {
        return phone;
    }

    public void setPhone(String[] phone) {
        this.phone = phone;
    }

    public String[] getAddress() {
        return address;
    }

    public void setAddress(String[] address) {
        this.address = address;
    }

    public String[] getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String[] createdAt) {
        this.createdAt = createdAt;
    }

    public String[] getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String[] updatedAt) {
        this.updatedAt = updatedAt;
    }
}
