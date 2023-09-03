
/*
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

  public void avanzarPasos(int pasos) {
    for (int i = 0; i < pasos; i++) {
      avanzar();
    }
  }

  public void avanzarDiagonal() {
    avanzar();
    girarDerecha();
    avanzar();
  }

  public void rotar180() {
    final int GIROS = 2;
    for (int i = 0; i < GIROS; i++) {
      girarDerecha();
    }
  }

  public void crearLado() {
    ponerCono();
    avanzarDiagonal();
  }

  private void volverPosicionInicial(int cantidadTriangulos) {
    int pasos = cantidadTriangulos * 2;
    rotar180();
    avanzarPasos(pasos);
  }

  public void crearTriangulo() {
    crearLado();
    rotar180();
    crearLado();
  }

  public void crearTriangulos(int cantidadTriangulos) {
    avanzar();
    for (int i = 0; i < cantidadTriangulos; i++) {
      crearTriangulo();
    }
    ponerCono();
    volverPosicionInicial(cantidadTriangulos);
  }
}
