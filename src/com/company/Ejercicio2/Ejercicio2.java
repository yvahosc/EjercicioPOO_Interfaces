package com.company.Ejercicio2;

import com.company.Ejercicio1.Discman;
import com.company.Ejercicio1.ReproductorMP3;

public class Ejercicio2 {
    public static void ejecutarEjercicio() {
        //Creando instancias de clase Libro
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García " +
                "Marquez", 70000);

        Libro libro2 = new Libro("La importancia de morir a tiempo", "Mario " +
                "Medoza", 49000);

        //Utilizando métodos de la interfaz
        libro1.mostrarInformacion();
        libro2.mostrarInformacion();
    }
}
