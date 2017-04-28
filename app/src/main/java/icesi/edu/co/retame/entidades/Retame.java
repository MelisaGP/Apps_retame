package icesi.edu.co.retame.entidades;

//import icesi.edu.co.retame.entidades.Login;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jdcm on 28/04/17.
 */

public class Retame {

    //private Login login; //TODO

    private List<Usuario> usuarios;

    public Retame(){
        usuarios = new ArrayList<>();
    }

    public boolean agregarUsuario(String nombreUsuario, String contrasenia, String usuario, char tipo){
        return false; //TODO
    }

    public boolean existeUsuario(String username){
        return false; //TODO
    }

    public Usuario buscarUsuarioPorUsername(String username){
        return null; //TODO
    }

    public boolean iniciarSesion(Usuario usuario){
        return false; //TODO
    }

    public boolean cerrarSesion(Usuario usuario){
        return false; //TODO
    }
}
