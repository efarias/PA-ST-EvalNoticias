package com.example.aplicacinreporterosindependientesconandroid_arica;

import android.location.Location;

import java.io.Serializable;
import java.util.Date;

public class Noticia implements Serializable {
    private String titulo;
    private String descripcion;
    private Date fecha;
    private Location ubicacion;
    private String foto;

    public Noticia(String titulo, String descripcion, Date fecha, Location ubicacion, String foto) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Location getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Location ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }


}
