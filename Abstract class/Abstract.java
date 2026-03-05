/*
IMP NOTE :- ALWAYS WRITE CLASS 1ST LETTER IN CAPITAL/UPPERCASE
*/

//Abstract class
/*
if we are creating abstract method in abstract class without implimentation 
then we need to define that method in another class which extends abstract class   
*/

abstract class Car{
    //abstract method
  abstract void fly();

      void drive(){
        System.out.println("Driving");
    }
}

class Thar extends Car{
 void fly(){
    System.out.println("Fly...");
 }
}

public class Abstract{
    public static void main(String[] args){
    
        //We ""can't create object"" of abstract class but """can create instance"""
        //car obj=new car(); //error
Car obj=new Thar(); //this is upcasting 
obj.fly();
obj.drive();

    }
}