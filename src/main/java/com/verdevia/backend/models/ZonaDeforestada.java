package com.verdevia.backend.models;

public class ZonaDeforestada {
    private Long id_zona;
    private String nombre;
    private Float longitud;
    private Municipio municipio;
    private Departamento departamento;

    
    public Long getId_zona() {
        return id_zona;
    }
    public void setId_zona(Long id_zona) {
        this.id_zona = id_zona;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Float getLongitud() {
        return longitud;
    }
    public void setLongitud(Float longitud) {
        this.longitud = longitud;
    }
    public Municipio getMunicipio() {
        return municipio;
    }
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
    public Departamento getDepartamento() {
        return departamento;
    }
    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

}


