import java.util.Scanner;
public class Order {
  public static void main(String[] args){
    Scanner scan=  new Scanner(System.in);
    double x= scan.nextDouble();
    double y= scan.nextDouble();
    double z= scan.nextDouble();
    double a= Math.max(Math.max(z,y),z);
    double b= Math.min(Math.min(z,y),z);
    double c=  1;
    if (x!=a && x!=b) {
        double c =x;
    }
    if (y!=a && y!=b) {
        double c =y;
    }
    if (z!=a && z!=b) {
        double c =z;
    }
    System.out.println(a +" "+c +" "+ b);
  }
}
    

