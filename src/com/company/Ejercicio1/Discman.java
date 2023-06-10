package com.company.Ejercicio1;

public class Discman implements ReproductorMusica{
    private final String nombre;

    public Discman(){
        this.nombre = "Discman";
    }

    public String getNombre(){
        return this.nombre;
    }

    @Override
    public void reproducirMusica() {
        System.out.println("Reproduciendo música desde el " + this.nombre + ".");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Pausando música desde el " + this.nombre + ".");
    }

    @Override
    public void detenerMusica() {
        System.out.println("Deteniendo música desde el " + this.nombre + ".");
    }
}
