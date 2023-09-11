import java.util.Scanner;
import java.util.Random;
public class dice {
  public static void main(String[] args){
    Scanner scan=  new Scanner(System.in);
    Random rand= new Random();
    int x= rand.nextInt(6)+1;
    int y= rand.nextInt(6)+1;
    System.out.println(x+y);

  }
}