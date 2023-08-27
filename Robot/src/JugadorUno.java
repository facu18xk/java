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
     * Metodo para avanzar varios pasos
     * 
     * @param pasos
     */
    public void avanzarPasos(int pasos) {
        for (int i = 0; i < pasos; i++) {
            avanzar();
        }
    }

    /**
     * @param indice
     * @param par
     */
    public void ponerConosAvanzar(int indice, boolean par) {
        int residuoModulo;
        if (par) {
            residuoModulo = 0;
        } else {
            residuoModulo = 1;
        }
        if (indice % 2 == residuoModulo) {
            ponerCono();
            avanzar();
        } else {
            avanzar();
        }
    }

    public void crearLinea(int longitud, boolean esPar) {
        int pasos = longitud + (longitud - 1);
        for (int i = 0; i <= pasos; i++) {
            if (esPar) {
                ponerConosAvanzar(i, true);
            } else {
                ponerConosAvanzar(i, false);
            }
        }
    }

    public void rotarDerecha() {
        girarDerecha();
        avanzar();
        girarDerecha();
    }

    public void crearBase(int longitud) {
        avanzar();
        crearLinea(longitud + 1, true);
        rotarDerecha();
        avanzarPasos(2);
    }

    public void crearPunta(int longitud) {
        crearLinea(longitud, false);
    }

    public void posicionInicial() {
        avanzar();
        girarIzquierda();
        avanzar();
        girarDerecha();
    }

    public void crearTriangulo(int cantidad) {
        posicionInicial();
        crearBase(cantidad);
        crearPunta(cantidad);
        avanzar();
        girarIzquierda();
    }
}
