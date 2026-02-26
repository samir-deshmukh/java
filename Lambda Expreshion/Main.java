/*
1.A lambda expression is an anonymous function (function without name)
2.Lambda works only with Functional Interface.
3.Functional Interface = Interface with only ONE abstract method
*/
//Lambda function make code clenar, less boilerplate.

/*
 (parameter) -> {body};
*/

public class Main{
public static void main(String[] args) {

//Normal way  
Interface1 obj=new Interface1(){
public void show(){
System.out.println("Hello using normal method");
                  }    
                             };
obj.show();


//Using lambda function
Interface1 obj1=() ->System.out.println("Hello using lambda function");
obj1.show();


//another Example
/*
Lambda Function Body= if we have to write single expreshion we write 
like below or if we want multiple expreshion we write it in {}
*/
Interface2 obj2=(a,b)-> a+b;
System.out.println(obj2.add(2, 7));


//Interface 3 calculator
Interface3 obj3=(a,b)->a-b; //lambda implementation
System.out.println(obj3.add(2, 7));

obj3.description(); //default method

System.out.println(Interface3.isPositive(11));//static method


//Lambda Type Inference =Java guessing parameter types using the target interface method signature.
/*
in java 11+ we can use ""var"" in parameters
Add obj = (var a, var b) -> a + b; 

we cannot use (var a, int b) -> a + b it is incorrect way
*/


} 
}