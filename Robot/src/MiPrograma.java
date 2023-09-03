
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
        int cantidadTriangulos = 3;
        Mundo world = new Mundo("Facu", 46, 46);
        JugadorUno player1 = new JugadorUno(world, 5, 0, 3, 100, 100);
        player1.crearTriangulos(cantidadTriangulos);
        JugadorDos player2 = new JugadorDos(world, 5, 0, 3, 100, 0);
        player2.invertirTriangulo(cantidadTriangulos);
    }
}
