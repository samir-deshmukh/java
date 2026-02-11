/*
The static keyword means that a member – like a field or method – belongs 
to the class itself, rather than to any specific instance of that class. 
As a result, we can access static members 
without the need to create an instance of an object.
*/
//From the memory perspective, static variables are stored in the heap memory.

/*
1. instance methods can directly access both instance methods and instance variables
2. instance methods can also access static variables and static methods directly
3. static methods can access all static variables and other static methods
4. static methods can’t access instance variables and instance methods directly. 
   They need some object reference to do so.
*/

class car{
   String carname;
   String color;
   //Static variable that is accessible without creating object of class
   static int No_of_cars;

   static int num=7;
    
   //constructer
 public car(String carname,String color){
     this.carname=carname;
     this.color=color;
     No_of_cars++;
  System.out.println(carname+" "+color+" "+No_of_cars);
    }

//mehtod
public static void display(String name){
    //this print the name passed as argument to method
    System.out.println(name);

}
}


/*
if the static variables require multi-statement logic
during initialization we can use a static block instead.
*/
class StaticBlock{
    int no=11;
    static String name;
    static int age;

    //This is a static block
    static{
        name="samir";
        age=19;
    }
}


//Static nested class
/* 
inner classes have access to all members of the enclosing class (including private ones), 
whereas the "static nested classes" only have access to static members of the outer class.
*/
class OuterClass{
//non-static
private String name="Samir";
//static
private static int Age=19;

    public static class InnerClass{

        public static void display(){
            /*
            i cant access non-static variable "name" because the nested class is 
            static so it cant directly access non-static variable
             */
             //System.out.println("Name:-"+name); //Give error
             
             //access static variable "Age"
             System.out.println("Age:-"+Age);

             /*
             To access non-static variable in nested static class 
            we need to create object of outer class or use new keyword
             */
             System.out.println("Name:-"+new OuterClass().name);
            }
    }
}


//Understanding non-sttaic variable error
class Error{
//non-static variable
    int age=19;
    
    public static void method(){
      //  System.out.println(age); //give error non static variable
       
      //need to create object
      System.out.println(new Error().age); 
    }
}



public class StaticKey{
    public static void main(String[] args){
// here new keyword is used because the increment & print statement inside a constructer
//if the static variable is outside of constructer or method then we can access without new keyword
        new car("Bugatti", "W16");
    new car("BMW","RED");

    //directly accesing static variable
    System.out.println(car.num);

    //accessing method directly
    car.display("Samir");

    //Static block Accessing Static variable in static block
    System.out.println("Name:-"+StaticBlock.name+", Age:-"+StaticBlock.age+"\n");

    //Static nested class
    OuterClass.InnerClass.display();
   
    }
}
  