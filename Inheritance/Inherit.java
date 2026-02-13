//Java support single,Multilevel & Hierarchical inheritance

//single inheritance & //Upcasting and Downcasting
class Parent{
static String name="Samir";
void method1(){
    System.out.println("This is parent method ");
}
}

 class Child extends Parent{
   public Child(){
    System.out.println(name+"\n");
   }
   void method2(){
               System.out.println("This is a clild method \n");
}
}


//Multilevel inheritance
class superclass{
  void mehtod1(){
    System.out.println("Super class");
}
}

class subclass extends superclass{
 void mehtod2(){
    System.out.println("Sub class");
}
}

class subsubclass extends subclass{
void mehtod3(){
    System.out.println("subsubclass inherit from Sub class \n");
}
}


//In Hierarchical 2 different child class can inherit from same parent class


//Method overriding & @override Annotation
class parent2{
void method(){
    System.out.println("This is parent method \n");
}
}

 class child2 extends parent2{
    @Override 
//this keyword tell compiler this methed is overriding 
// "it is for sefty" 
// if we write wrong method name then compiler cant do overriding so we use @Override
   void method(){
               System.out.println("This is a clild method \n");
}
}


//super method
class parent3{
   void method(){
    System.out.println("This is parent method\n");
} 
}
class child3 extends parent3{
    @Override 
    void method(){
     super.method();
     //using this "super" method we can access parent method in condition of overriding  
/*
    super() must be first statement in constructor
    Cannot use super in static context
*/ 
}
}


public class Inherit{
    public static void main(String[] args) {
        
        //child inherit from parent
        new Child();
        
        //superclass obj=new subclass();
    // subclass obj1=new subsubclass();
    subsubclass obj2=new subsubclass();
    
    //here just by creating objct of subsubclass i can access methods in subclass & superclass
    obj2.mehtod1();
    obj2.mehtod2();
    obj2.mehtod3();
    
    //Upcasting 
    Parent obj1=new Child();
    //parent = reference
    //object = child
    obj1.method1();
    /*
    obj1.method2(); //We cant do this child methods is accessiable only through child reference
    */ 
   
   //Downcasting
   Child obj3=(Child) obj1;
   /*
   //Risky if object != Child
   Ex:- Parent obj=new Parent();
   here  parent = reference 
   object = parent 
   */
  obj3.method2(); //by downcasting now i can call chld method 
  
  
  //Method overriding
  parent2 obj4=new child2();
  
  obj4.method(); //output child method
  
  //Super method
  parent3 obj5=new child3();
  obj5.method();
  
  //The "instanceof" instruction can determine whether a given object is an instance of some class
  parent2 obj6= new parent2();
  boolean isparent= obj6 instanceof parent2;
  System.out.println(isparent);// true bacause obj6 is instance of parent2
}
}