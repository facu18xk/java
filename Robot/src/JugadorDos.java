import uni.robot.Mundo;

public class JugadorDos extends JugadorUno {
    public JugadorDos(Mundo mundo) {
        super(mundo);
    }

    public JugadorDos(Mundo mundo, int fila, int columna, int direccion, int capacidadBolsa, int cantidadConos) {
        super(mundo, fila, columna, direccion, capacidadBolsa, cantidadConos);
    }

    public void juntarConos(int cantTriangulos) {
        avanzar();
        cantTriangulos *= 2;
        for (int i = 0; i < cantTriangulos; i++) {
            guardarCono();
            avanzarDiagonal();
            if (i % 2 == 0) {
                rotar180();
            }
        }
        guardarCono();
        avanzar();
    }

    public void girarEsquinaIzq() {
        girarDerecha();
        avanzar();
        girarDerecha();
    }

    public void volverPosicionInicial(int cantTriangulos) {
        int pasos = cantTriangulos * 2;
        rotar180();
        avanzarPasos(pasos);
        girarDerecha();
        avanzar();
    }

    public void invertirTriangulo(int cantTriangulos) {
        juntarConos(cantTriangulos);
        girarEsquinaIzq();
        crearTriangulos(cantTriangulos);
        volverPosicionInicial(cantTriangulos);
    }
}
