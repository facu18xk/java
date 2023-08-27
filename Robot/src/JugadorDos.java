import uni.robot.Mundo;

public class JugadorDos extends JugadorUno {
    public JugadorDos(Mundo mundo) {
        super(mundo);
    }

    public JugadorDos(Mundo mundo, int fila, int columna, int direccion, int capacidadBolsa, int cantidadConos) {
        super(mundo, fila, columna, direccion, capacidadBolsa, cantidadConos);
    }

    public void juntarConos(int cantidad) {
        cantidad += cantidad + 1;
        for (int i = 0; i < cantidad; i++) {
            if (i % 2 == 0) {
                guardarCono();
                avanzar();
            } else {
                avanzar();
            }
        }
    }

    public void posicionInicial() {
        super.posicionInicial();
        avanzar();
    }

    public void rotar180() {
        for (int i = 0; i < 2; i++) {
            girarDerecha();
        }

    }

    public void posicionSecundaria() {
        rotarDerecha();
        girarIzquierda();
        ponerCono();
        rotar180();
        avanzar();
        girarIzquierda();
    }

    public void volverPosInicial() {
        avanzarPasos(3);
        girarIzquierda();
        avanzar();
    }

    public void invertirTriangulo(int cantidadTriangulos) {
        posicionInicial();
        juntarConos(cantidadTriangulos);
        posicionSecundaria();
        crearPunta(cantidadTriangulos);
        volverPosInicial();
    }
}
