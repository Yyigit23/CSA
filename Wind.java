import java.util.Scanner;

public class Wind {
  public static void main(String[] args){
    Scanner scan=  new Scanner(System.in);
    double t= scan.nextDouble();
    double v= scan.nextDouble();
    System.out.println(35.74 + 0.6215 *t + (0.4275 *t -35.75) *Math.pow(v,0.16));

  }
}