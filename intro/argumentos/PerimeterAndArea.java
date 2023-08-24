public class PerimeterAndArea{
  public static void main(String[] args){
    double height = Double.parseDouble(args[0]);
    double base = Double.parseDouble(args[1]);
    double area = base*height/2;
    double perimeter = base*3;
    System.out.println("El area del tirangulo equilatero es: "+area+" y el perimetro del triangulo "+perimeter);
  }
}
