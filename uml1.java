class Pen{
    private String color;
    private boolean erasable;
    public Pen(String a, boolean b){
        color=a;
        erasable=b;
    } 
    public String getColor(){
        return color;
    }
    public boolean getErasable(){
        return erasable;
    
    }
    public void setColor(String a){
        color=a;
    }
    public void setErasable(boolean b){
        erasable=b;
    }
    public String toString(){
        return "Pen is " + color + " erasbility condition is "+erasable;
    }


}


public class uml1 {
    public static void main(String[] args){
       Pen osym= new Pen("Osym",true);
       System.out.println(osym);



    }
}
