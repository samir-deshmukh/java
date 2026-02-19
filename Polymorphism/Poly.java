//Polymorphism:- Single "Object" shows different behaviour


//Runtime polymorphism.
/*
Java checks the object at runtime → calls Dog’s sound()
That dynamic decision = runtime polymorphism
*/

interface Animal{
    void sound();
}

class Dog implements Animal{
    public void sound(){
System.out.println("Bark");
    }
}

class Cat implements Animal{
    public void sound(){
System.out.println("Meow");
    }
}



//Complie time polymorphism
//which mehtod should call is decide at compile time
class Calculator{
    int add(int a,int b){
return a+b;
}

double add(double a,double b){
    return a+b;
}

int add(int a,int b,int c){
    return a+b+c;
}
}



public class Poly{
public static void main(String[] args){

    //Instance of interface

//This is runtime polymorphism.
    Animal a;

    a= new Dog();
    a.sound();

    a=new Cat();
    a.sound();



    //Compile time polymorphism.
 Calculator obj=new Calculator();

 System.out.println(obj.add(2,7));
 System.out.println(obj.add(2.0,7.5));
 System.out.println(obj.add(2,7,1));



}
}