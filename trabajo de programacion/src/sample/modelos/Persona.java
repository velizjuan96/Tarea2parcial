package sample.modelos;

import java.util.ArrayList;

public class Persona {

    public String nombre;
    public int edad;
    public String apellido;

    private static Persona[] listapersonas={
            new Persona("David", "Delcid", 21),
            new Persona("Tulio", "Garcia", 23),
            new Persona("Marco", "Funez", 35),
            new Persona("Carlos", "Becerra", 40),
            new Persona("Marco", "Lanza", 24),
            new Persona("Julio", "Lopez", 27),
    };


    public Persona(String nombre,String apellido, int edad) {
        this.nombre=nombre;
        this.edad=edad;
        this.apellido=apellido;
    }

    public static Persona buscarPorPosicion(int posicion) {
        if (posicion < listapersonas.length) {
            return listapersonas[posicion];
        }
        return null;
    }

    public static Persona primerNombre(String nombre) {
        for (int a = 0; a < listapersonas.length; a++) {
            if (listapersonas[a].nombre.equals(nombre)) {
                return listapersonas[a];
            }
        }
        return null;
    }

}
