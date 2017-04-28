package icesi.edu.co.retame.icesi.edu.co.retame.entidades;

/**
 * Created by JuanDavid on 23/4/2017.
 */

public class Usuario {

    public static final char ALUMNO = 'A';
    public static final char TUTOR = 'T';

    private String nombre;
    private String contrasenia;
    private String usuario;
    private char tipoUsuario;
    private int puntaje;

    public Usuario(String nombre, String usuario, String contrasenia, char tipoUsuario, int puntaje) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasenia = this.contrasenia;
        this.tipoUsuario = tipoUsuario;
        this.puntaje = puntaje;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Crea un grupo, se generará el codigo al momento de crear
     * @param nombreGrupo nombre del grupo
     * @param descripcion descripcion del grupo
     */
    public void crearGrupo(String nombreGrupo, String descripcion){
        //TODO
    }

    /**
     * Elimina un grupo dado un codigo
     * @param grupoId codigo de grupo
     */
    public void eliminarGrupo(int grupoId){
        //TODO
    }

    /**
     * Obtiene un grupo dado un código
    // * @param grupoId codigo del grupo
     * @return objeto Grupo
     */
    /*
    public Grupo buscarGrupo(int grupoId){
        return null;
    }
*/














    /////GETS & SETS


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public char getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(char tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void cambiarPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void cambiarContraseña(String contraseña) {
        this.contrasenia = contraseña;
    }
}
