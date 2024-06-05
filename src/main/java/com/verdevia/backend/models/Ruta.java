package com.verdevia.backend.models;

public class Ruta {
    private Long id_ruta;
    private String nombre;
    private Estacion origenEstacion;
    private Estacion destinoEstacion;

    
    public Long getId_ruta() {
        return id_ruta;
    }
    public void setId_ruta(Long id_ruta) {
        this.id_ruta = id_ruta;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Estacion getOrigenEstacion() {
        return origenEstacion;
    }
    public void setOrigenEstacion(Estacion origenEstacion) {
        this.origenEstacion = origenEstacion;
    }
    public Estacion getDestinoEstacion() {
        return destinoEstacion;
    }
    public void setDestinoEstacion(Estacion destinoEstacion) {
        this.destinoEstacion = destinoEstacion;
    }
}

