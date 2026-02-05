//Type casting

//Widening Type Casting
class Widening{
    public void Widening_Method(){
    //converting smaller data type into larger
    //int to double

    int A=7;
    System.out.println("integer before casting:- "+A+"\n");

    double B= A;
    System.out.println("integer after casting become double:- "+B+"\n");
}
}


//Narrowing Type Casting
class Narrowing{
    public void Narrowing_Method(){
     //converting larger data type into smaller
     //double to int

     double A=3.7;
        System.out.println("Before casting:-"+A+"\n");
     int B=(int)A;
        System.out.println("After casting double to int:-"+B+"\n");
    }
}


public class Casting {
    public static void main(String[] args){
Widening obj1=new Widening();
Narrowing obj2=new Narrowing();

//Widening method call
obj1.Widening_Method();

//Narrowing method call
obj2.Narrowing_Method();

    }
}
