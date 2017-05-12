package icesi.edu.co.retame.entidades;

import java.util.List;

/**
 * Created by jdcm on 4/05/17.
 */

public class Reto {


    private List<Prueba> pruebas;
    private List<Usuario> usuarios;

    private String nombre;
    private String descripcionReto;
    private int numeroParticipantes;
    private char nivelDificultad;

    public final static char FACIL= 'F';
    public final static char MEDIO= 'M';
    public final static char DIFICIL= 'D';
    public final static char MUY_DIFICIL= 'I';

    public Reto(String nombre, String descripcionReto, char nivelDificultad) {

    }

    public boolean agregarUsuario(Usuario user){

        return false;
    }

    public void cambiarNombre(String nombre){

        this.nombre=nombre;

    }

    public void cambiarDescripcio(String descripcionReto){

        this.descripcionReto=descripcionReto;

    }

}
