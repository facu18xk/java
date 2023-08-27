
/**
 * Alumno: _____________________________.
 * Nombre de archivo: MiPrograma.java
 * Fecha: ___________.
 * Introduccion a la Programacion II.
 * FIUNI.
 */

import uni.robot.Mundo;

/**
 * Esta clase contiene el metodo main() para ejecutar
 * su programa de robot.
 */
public class MiPrograma {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Mundo world = new Mundo("Facu", 46, 46);
        JugadorUno player = new JugadorUno(world, 6, 0, 3, 80, 80);
        /* COLOQUE SUS INSTRUCCIONES AQU� */
        player.crearTriangulo(4);
    }
}
