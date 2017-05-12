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

        this.nombre = nombre;
        this.descripcionReto = descripcionReto;
        this.nivelDificultad=nivelDificultad;

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

    public List<Prueba> getPruebas() {
        return pruebas;
    }

    public void setPruebas(List<Prueba> pruebas) {
        this.pruebas = pruebas;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcionReto() {
        return descripcionReto;
    }

    public void setDescripcionReto(String descripcionReto) {
        this.descripcionReto = descripcionReto;
    }

    public int getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(int numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }

    public char getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(char nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }
}
