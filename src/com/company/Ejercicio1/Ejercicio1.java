package com.company.Ejercicio1;

public class Ejercicio1 {
    public static void ejecutarEjercicio() {
        //Creando instancias de clases creadas
        ReproductorMP3 reproductorMP3 = new ReproductorMP3();
        Discman discman = new Discman();

        //Llamado métodos de la interfaz
        System.out.println(reproductorMP3.getNombre());
        reproductorMP3.reproducirMusica();
        reproductorMP3.pausarMusica();
        reproductorMP3.detenerMusica();

        System.out.println("\n" + discman.getNombre());
        discman.reproducirMusica();
        discman.pausarMusica();
        discman.detenerMusica();
    }
}
