import java.util.Scanner;
import java.util.Random;

public class rrand {
  public static void main(String[] args){
    Scanner scan=  new Scanner(System.in);
    double x= Math.random();
    double y= Math.random();
    double z= Math.random();
    double a= Math.random();
    double b= Math.random();
    System.out.println(a);
    System.out.println(b);
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println((x+y+z+a+b)/5);
    System.out.println(Math.max(Math.max(Math.max(a,b),Math.max(x,y)), z));
    System.out.println(Math.min(Math.min(Math.min(a,b),Math.min(x,y)), z));
    

 

   

  }
}