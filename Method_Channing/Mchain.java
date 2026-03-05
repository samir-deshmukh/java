//Method channing:- Calling multiple method in one line

class Ademo {

    private int a;
    private double b;

    //this are constructor
    public Ademo setint(int a){
        this.a=a;
        return this;
    }

    public Ademo setdouble(double b){
        this.b=b;
        return this;
    }
    
    //this is method
    void display(){
        System.out.println((a+b));
    }
   

}

public class Mchain {
public static void main(String[] args){
    
    new Ademo().setint(2).setdouble(2.5).display();
}
}







