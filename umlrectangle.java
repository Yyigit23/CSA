public class umlrectangle {
    private double l;
    private double w;
    public umlrectangle (double a, double b){
       this.l=a;
       this.w=b;
    }
    public double getLength(){
        return l;
    }
    public double getWidth(){
        return w;
    }
    public void setWidth(double a){
        this.l=a;
    }
    public void setLength(double a){
        this.w=a;
    }
    public double getArea(){
        return l*w;
    }
    public double getPerimeter(){
        return 2*w+2*l;

    }
    public String equals(umlrectangle a){
        if (a.getLength()==l) {
            
            if(a.getWidth()==w){
                return "they are equal";
            }
            else{
                return "They are not equal";
            }
        }
        else{
            return "they are not equal";
        }
    }
    public static void main(String[] args){
        umlrectangle A= new umlrectangle(5.0,3.14);
        umlrectangle b= new umlrectangle(5.0,3.14);
        System.out.println(A.equals(b));
        System.out.println(A.getLength());
        System.out.println(A.getArea());
        A.setLength(12);
        System.out.println(A.getArea());
        System.out.println(A.getPerimeter());
        System.out.println(A.equals(b));



    }


}
