package icesi.edu.co.retame.entidades;

import java.util.List;

/**
 * Created by jdcm on 11/05/17.
 */

public class Grupo {

    private List<Reto> retos;
    private List<Usuario> usuarios;

    private String nombreGrupo;
    private String descripcion;
    private int numeroParticipantes;
    private int codigo;


    public Grupo(String nombreGrupo, String descripcion){

        this.nombreGrupo= nombreGrupo;
        this.descripcion=descripcion;

    }

    public boolean agregarUsuario(Usuario usuario){



        return false;
    }

    public boolean agregarReto(String nombreReto, String descripcionReto){

        return false;
    }

    public Reto[] filtrarRetosDificultad(char tipoReto){

        return null;

    }

    public String getNombreGrupo() {
        return nombreGrupo;
    }

    public void setNombreGrupo(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(int numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

}
