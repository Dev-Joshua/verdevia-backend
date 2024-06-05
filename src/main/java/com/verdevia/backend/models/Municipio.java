package com.verdevia.backend.models;

public class Municipio {
    private Long id_municipio;
    private String nombre;
    private Departamento departamento;

    
    public Long getId_municipio() {
        return id_municipio;
    }
    public void setId_municipio(Long id_municipio) {
        this.id_municipio = id_municipio;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}


