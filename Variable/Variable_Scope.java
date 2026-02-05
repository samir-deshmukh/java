//Variable
//Variable is a contaner that contain data values

/*
1. Java variable names are case sensitive. 
   The variable name money is not the same as Money or MONEY.
2. Java variable names must start with a letter, or the $ or _ character.
3. After the first character in a Java variable name, 
   the name can also contain numbers (in addition to letters, the $, and the _ character).
4. Variable names cannot be equal to reserved key words in Java. 
   For instance, the words int or for are reserved words in Java. 
5. Variable names are written in lowercase. For instance, variable or apple.
6. If variable names consist of multiple words, 
   each word after the first word has its first letter written in uppercase. 
   For instance, variableName or bigApple.
6. Even though it is allowed, you do not normally start a Java variable name with $ or _ .
7. Static final fields (constants) are named in all uppercase, 
    typically using an _ to separate the words in the name. 
    For instance EXCHANGE_RATE or COEFFICIENT.
*/


class _variable{
//Declearing a variable
int Var; 

//Assigns a value to variable
int Var1=23;
//int (Data type) Var1(variable name) = 27(Data that variable will store)


//Local-Variable Type Inference
/*
From Java 10 it is no longer necessary to specify the type of the variable when declared, 
if the type can be inferred from the value assigned to the variable
*/

//Use var for inference

//    var str="Hello";
//var support only java 10 ang greter 
}


//scope of variable 
class VariableScope{

// class scope :- variable is accessible only inside a class
/*
it is declearde as "private" because if it is public 
 it will be accessible ouside of the class
 */   

 //Declearing a avariable & assigns value 
 private String name="Samir";

 public void method_class(){
   System.out.println("name(class scope ex):- "+name+"\n");
/*the variable "name" will be accessible here 
 because this method is inside a class */
 }
 

//Method Scope
public void method_Scope(){
 int age=18;
 System.out.println("age:-"+age+"\n");
}
/*
Here if we try to access "age" we cant,because of scope of variable
"age" variable is accesiable only inside the method called "method scaope" 
*/
public void method3(){
   // System.out.println(age);
   //it wil give error because of scope
}


//Bracket Scope
class BracketScope{
public void method_Bracket(){
   int num=7;
   {
      int sum = num+13;
       System.out.println(sum+"\n");
 // here sum is accesiable because the print statement is in a bracate scope
      }
   //we are trying to access the sume outside the bracate 
   // and we cant because od scope it give error
   
   /*
   System.out.println(sum);
   */
}
}

class accessName{
//Error will come because "name" variable is not accessible outside of class
/*
String accessName=name;
*/   
}


//Loop Scope
class LoopScope{
public void method_Loop() {
   int num1=5;

 for(int i=1; i<=num1; i++){
   int count = num1+i;
// here the i is accesiable because it is inside the loop 
   System.out.println(count+"\n");
}
//Here i cant access "i" variable because of loop scope

/*
System.out.println(i);
*/
      }
   
   }


class Shadowing{
   /*
1. The first time that we are printing title, it will print “Baeldung”. 
   After that, declare a method variable with the same name and 
   assign to it the value “John Doe“.
2. The title method variable overrides the possibility to access 
   to the class variable title again. 
3. That’s why the second time, it will print “John Doe“.
  "Confusing, right? This is called variable shadowing"
   */

  String title = "Baeldung";

    public void method_Shadowing() {
        System.out.println(title+"\n");
        String title = "John Doe";
        System.out.println(title+"\n");
    }
}

}


//Main method
public class Variable_Scope{
   public static void main(String[] args){
 _variable obj1=new _variable();
 VariableScope obj2=new VariableScope();

 //for access child class we need to do this
 VariableScope.BracketScope obj3=  obj2.new BracketScope();
 VariableScope.LoopScope obj4=obj2.new LoopScope();
 VariableScope.Shadowing obj5=obj2.new Shadowing();

 //Variable
 System.out.println(obj1.Var1+"\n");

 //class scope method call
 obj2.method_class();

 //Method scope call
 obj2.method_Scope();

 //Bracket Scope call
 obj3.method_Bracket();

// Loop scope call
obj4.method_Loop();

//Shadowing
obj5.method_Shadowing();
} 
}