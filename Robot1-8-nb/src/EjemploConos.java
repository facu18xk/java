import uni.robot.Mundo;
import uni.robot.Robot;

/**
 * Clase de ejemplo.
 * <p>
 *
 * Realiza un recorrido, y coloca algunos conos.
 * */
public class EjemploConos {

    /**
     * Metodo principal de la clase.
     *
     * @param arg Argumentos desde la linea de comandos (no necesarios).
     */
    public static void main(String[] arg) {

        int maximaCapacidad = 10;
        int cantidadInicial = 4;
        //creo los objetos
        Mundo m = new Mundo("City", 10, 10);
        Robot carlos1 = new Robot(m, 0, 0, Robot.ESTE, maximaCapacidad,
                                  cantidadInicial);
        carlos1.
    }
    }
