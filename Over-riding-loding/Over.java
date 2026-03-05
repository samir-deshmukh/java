//Overloading:- Multiple methods with different parameters at same class
//Overloading is also known as "compile time polymorphism"

class Calculator{

    void add(int a,int b){
 System.out.println("Add:- "+(a+b));
}

 void add(double a,double b){
 System.out.println("Add:- "+(a+b));
}

 void add(int a,int b,int c){
 System.out.println("Add:- "+(a+b+c));
}
}



//Overriding:- same method in parent & Child class 
//Overriding is also known as "runtime polymorphism"

class Parent{ 
    void sound(){
        System.out.println("Parent ");
    }
}

class Child extends Parent{
    void sound(){
        System.out.println("Child ");
    }
}


public class Over {
    public static void main(String[] args){

//Overloading
        Calculator obj=new Calculator();
        //compiler decide at compile time to which method should call based on parameters
        obj.add(2,7);
        obj.add(2.3,7.9);
        obj.add(2,7,3);


//Overriding
//the class object we will create that class method will execute

//This is a overriding child method overriding parent method
Parent p=new Child();
p.sound(); //Child class method


//object matter
Parent a=new Parent();
a.sound(); //Parent class method

    }
}

//IMP Static method cant override but it can overload
