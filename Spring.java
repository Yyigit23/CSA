import java.util.Scanner;

public class Spring {
  public static void main(String[] args){
    Scanner scan=  new Scanner(System.in);
    int m= scan.nextInt();
    int d= scan.nextInt();
    if (3<m & m<6) {
        System.out.println("True");
    }
    else if (3==m ) {
        if (d>=20){
           System.out.println("True");
        }
    }
    else if (6==m ) {
        if (d<10){
           System.out.println("True");
        }
    } 
    else {
        System.out.println("False");
    }   
  }
}