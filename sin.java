import java.util.Scanner;
import java.util.Random;
public class sin {
  public static void main(String[] args){
    Scanner scan=  new Scanner(System.in);
    Random rand= new Random();
    double x = scan.nextDouble();
    double c=Math.PI;
    System.out.println(Math.sin(x*c/180));

  }
}