public class WeightIndex{
  public static void main(String[] args){
    //Data parsing
    double height = Double.parseDouble(args[0]);
    int weight = Integer.parseInt(args[1]);
    double imc = weight/(height*height);
    System.out.println("Tu indice de masa corporal es: "+imc);
  }
}
