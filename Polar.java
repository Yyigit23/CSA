import java.util.Scanner;

public class Polar {
  public static void main(String[] args){
    Scanner scan=  new Scanner(System.in);
    double x= scan.nextDouble();
    double y= scan.nextDouble();
    double r= Math.sqrt(x*x+y*y);
    double theta= Math.atan(y/x);
    System.out.println(r + " " + theta);

  }
}