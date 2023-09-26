class grup{
   public String b;
   public int a;
   public grup(String b, int a){
    this.b=b;
    this.a=a;

   }
   public String getName(){
    return b;
   }
   public int getYear(){
    return a;
   }
   public String toString(){
    return "the bands name is " + b + " and its formed in "+a;
   }
   public void setYear(int yıl){
    a=yıl;
    
   }
   public void setYear(String name){
    b=name;
    
   }

}
public class band{
    public static void main(String [] args){
        grup a= new grup("Sedatın Melekleri", 1980);
        System.out.println(a.toString());
    }
}



    
