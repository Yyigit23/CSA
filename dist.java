import java.util.Scanner;
public class Dist {
  public static void main(String[] args){
    Scanner scan=  new Scanner(System.in);
    double x= scan.nextDouble();
    double y= scan.nextDouble();
    System.out.println(Math.sqrt(x*x+y*y));

  }
}