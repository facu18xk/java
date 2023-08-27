/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author faq
 */
import uni.robot.Robot;
import uni.robot.Mundo;

public class JugadorUno extends Robot {
    public JugadorUno(Mundo mundo) {
        super(mundo);
    }

    public JugadorUno(Mundo mundo, int fila, int columna, int direccion, int capacidadBolsa, int cantidadConos) {
        super(mundo, fila, columna, direccion, capacidadBolsa, cantidadConos);
    }

    /**
     * @param pasos
     */
    public void avanzarPasos(int pasos) {
        for (int i = 0; i < pasos; i++) {
            avanzar();
        }
    }

    public void crearLinea(int longitud, boolean esPar) {

    }
}
