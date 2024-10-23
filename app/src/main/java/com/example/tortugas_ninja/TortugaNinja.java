package com.example.tortugas_ninja;

public class TortugaNinja {
    private String nombre;
    private String arma;
    private String descripcion;
    private int imagen;

    public TortugaNinja(String nombre, String arma, String descripcion, int imagen) {
        this.nombre = nombre;
        this.arma = arma;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArma() {
        return arma;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getImagen() {
        return imagen;
    }
}
