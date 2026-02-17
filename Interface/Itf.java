//Interface
/*
1. interface is like a class which contain only abstract method
2. It is defined using "interface" keyword
3. The "methods" in a class will be "abstract method" by default
4. Variables are public,static & final by default
*/

//In java if input value is not valid like alphabet or No, java throw exception


//package for taking input 
import java.util.Scanner;

interface Client1{
//variable
    String a="Samir";
//Method
void Input1();
void Output1();
}


//Multipal inetrfaces Ex
interface Client2{
    void Input2();
    void Output2();
}

class Developer1 implements Client1, Client2 {
    //Variable for single interface
    String name;
    double salary;

    //variable for multiple interface
    int id;
    String MoNo;
    
    public void Input1(){
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Name: ");
         name =sc.nextLine(); //nextLine() for String
        
         System.out.print("Enter Salary: ");
         salary=sc.nextDouble(); //nextDouble() fir Double value
         
    }
    public void Output1(){
        System.out.println("Name:- "+name+"\n"+"Salary:- "+salary+"\n");

    } 


//Multiple interfaces operation

public void Input2(){
    
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter ID: "); //i use print not println because println() = print + new line
    id=sc.nextInt();
    sc.nextLine(); 
    //If i diden't write this then the program will think the next MoNo input is 0

    //check valadation
    if(id<=0){
        System.out.println("Incorrect Id");
        System.exit(0);
    }
    
    System.out.print("Enter Mobile Number: ");
    MoNo=sc.nextLine();
    //check valadation
      if(/*MoNo.length()==10*/ MoNo.matches("[6-9][0-9]{9}")){

         }else{
           System.out.println("Incorrect Mobile No");
           System.exit(0);
    
          }
}

public void Output2(){
    System.out.println("Id: "+id);
System.out.println("Mobile No: "+MoNo+"\n");
}
}


//Interface Static Methods
interface Static_Method{
   // interface can contain static method

 static void method(){
    System.out.println("Static Method");
 }
}

//Interfaces and Inheritance We can inherit Single & multipal interfaces
interface Client3{
    void method3();
    // Rule No 3, abstract method cant contain implemtation like {System.out.print();}
    }

interface Client4{
    void method4();
}

interface Client extends Client3,Client4{
    //Writing this method again in not neccessary if i didn't write it it will be ok
  void method3();
  void method4();
}

class Developer2 implements Client3,Client4{
    //Absract method is neeed to be public
    public void method3(){
        System.out.println("Method from Client 3");
    }

    public void method4(){
        System.out.println("Method from Client 4");
    }
}



//Inheritance and Default Methods

//Class Inheritance + Default Method & Class Overrides Default Method

interface inter1{
    //Rule No 3 but if we define it ddefault then we can do implementation
 default void method(){
      System.out.println("Default method from inter1");
    }
}

class Alphabet implements inter1{
//If i didn't overide then it will execute interface A default method
//overiding method inter1
    @Override
  public void method(){
        System.out.println("Overide method from inter1");
    }
}


//Class Inheritance + Interface Default
interface inter2{
    default void method(){
        System.out.println("Interface inter2 default method");
    }
}

class Inherit{
   public void method(){
        System.out.println("class Inherit method");
    }    
}

class Demo extends Inherit implements inter2{
    //i call Method so it will execute method from class Inherit because
    // CLASS > INTERFACE
}


//Multiple Interfaces Same Default Method (Diamond Problem)
interface A{
default void method() {
 System.out.println("Default method from A");
}
}

interface B{
    default void method(){
 System.out.println("Default method from B");
}
}

/*
💀 ERROR — Java doesn’t know which one to use

" class Demo2 implements A,B{} ""

*/
class Demo2 implements A,B{
    //Need to define which method should call by "super"
public void method() {
        A.super.method();  // or B.super.show();
    }
} 

/*
Priority Rules (Very Important)

When same method exists
Java follows this order:
Class method  >  Most specific interface  >  You must override
*/



//Interface and Polymorphism
//Runirme polymorphism
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



//Generic Interfaces:- using this we can pass value/paremeter of any type
//It is use for reduce duplication of code,To achieve type safety, 
// To avoid type casting,To write reusable and scalable code

//Ex simple generic interface
 interface Generic<T> {
 void set(T value);
T get();    
}

class Box<T> implements Generic<T>{
private T value;

public void set(T value){
this.value= value;
}

public T get(){
    return value;
}

}

//Ex generic interface with multipel type
interface Generic_Multi<N,A>{
N getName();
A getAge();
} 

class Box1<N,A> implements Generic_Multi<N,A>{
private N Name;
private A age;

public void Set(N Name,A age){
this.Name=Name;
this.age=age;
}

public N getName() {
    return Name;
}

public A getAge(){
    return age;
} 

}



//Main class
public class Itf{
    public static void main(String[] args) {
        System.out.println(Client1.a); //static 
        //i can access variable of client class directly because rule NO "4" 
        
        //Calling Methods
        Developer1 obj=new Developer1();
        Client1 obj1=obj;
        obj1.Input1();
        obj1.Output1();
        
        
        //Multipel interfaces Example
Client2 obj2=obj;
obj2.Input2();
obj2.Output2();

//Interface Static Methods
Static_Method.method();
   

//Interfaces and Inheritance
 Developer2 obja=new Developer2();
obja.method3();
obja.method4();


//Class Inheritance + Default Method & Class Overrides Default Method
Alphabet obj4=new Alphabet();
obj4.method();

//Class Inheritance + Interface Default
Demo obj5=new Demo();
obj5.method();


//interface + Polymorphism
Animal a;
a=new Dog();
a.sound();

a= new Cat();
a.sound();


//Generic Interfaces

//passing integer
Box<Integer> BoxObj= new Box<>();
BoxObj.set(7);
System.out.println("Integer:-"+BoxObj.get());//Integer:-7

//Passing String
Box<String> stringObj=new Box<>();
stringObj.set("Hello!");
System.out.println("Stirng:-"+stringObj.get()); //String:-Hello!

//generic interface with multipel type
Box1<String,Integer> Boxobj=new Box1<>();
Boxobj.Set("Samir",19);
System.out.println("NAme:- "+Boxobj.getName()+"\n"+"Age:- "+Boxobj.getAge());




}
}