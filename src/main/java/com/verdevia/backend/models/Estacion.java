package com.verdevia.backend.models;

public class Estacion {
    private Long id_estacion;
    private String nombre_estacion;
    private String ubicacion;
    private Municipio municipio;
    private Ruta ruta;

    
    public Long getId_estacion() {
        return id_estacion;
    }
    public void setId_estacion(Long id_estacion) {
        this.id_estacion = id_estacion;
    }
    public String getNombre_estacion() {
        return nombre_estacion;
    }
    public void setNombre_estacion(String nombre_estacion) {
        this.nombre_estacion = nombre_estacion;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    public Municipio getMunicipio() {
        return municipio;
    }
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
    public Ruta getRuta() {
        return ruta;
    }
    public void setRuta(Ruta ruta) {
        this.ruta = ruta;
    }
}


