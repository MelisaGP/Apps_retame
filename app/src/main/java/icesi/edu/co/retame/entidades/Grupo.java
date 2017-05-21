package icesi.edu.co.retame.entidades;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;
//import com.google.firebase.

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

    private DatabaseReference db= FirebaseDatabase.getInstance().getReference();


    public Grupo(String nombreGrupo, String descripcion){

        this.nombreGrupo= nombreGrupo;
        this.descripcion=descripcion;

    }

    public void agregarUsuario(Usuario usuario){

        usuarios.add(usuario);

    }

    public void agregarReto(Reto reto){//TODO

        retos.add(reto);

    }

    public List<Reto> filtrarRetosDificultad(char tipoReto){

        List<Reto> lista = new ArrayList<>();
        for(Reto reto : retos){

            if(reto.getNivelDificultad()==tipoReto){
                lista.add(reto);
            }

        }

        return lista;

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
