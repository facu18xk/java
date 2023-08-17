/**
 * Alumno: _____________________________.
 * Nombre de archivo: MiPrograma.java
 * Fecha: ___________.
 * Introduccion a la Programacion II.
 * FIUNI.
 */


import uni.robot.Mundo;
import uni.robot.Robot;
import uni.robot.Cono;
/**
 * Esta clase contiene el metodo main() para ejecutar
 * su programa de robot.
 */
public class MiPrograma {

    public static void main(String[] args) {

        /* COLOQUE SUS INSTRUCCIONES AQU */
      Mundo mundo = new Mundo("myworld", 12,12);      
      Robot robotsito = new Robot(mundo);
      robotsito.avanzar();
      for(int i = 0; i < 5; i++){
          robotsito.avanzar();
      }
      robotsito.girarDerecha();
    }
}
