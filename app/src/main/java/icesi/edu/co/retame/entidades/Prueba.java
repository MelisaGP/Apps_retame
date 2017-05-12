package icesi.edu.co.retame.entidades;

import android.media.Image;

/**
 * Created by jdcm on 11/05/17.
 */

public class Prueba {

    private Reto reto;

    private char tipoPrueba;
    private Image prueba;
    public static char IMAGE='I';

    public Prueba(char tipoPrueba, Image prueba, Reto reto){

        this.tipoPrueba=tipoPrueba;
        this.prueba=prueba;
        this.reto=reto;

    }


    public Image getPrueba() {
        return prueba;
    }

    public void setPrueba(Image prueba) {
        this.prueba = prueba;
    }

}
