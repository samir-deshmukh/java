/*
1.Decided at compile time
2.Compiler already knows which method to call

Happens wit: 1. static methods
             2. private methods
             3. Method overloading
*/
class Parent1 {
static void show(){
    System.out.println("Parent static method ");
}    
}

class Child1 extends Parent1{
    static void show(){
        System.out.println("Child static method");
    }
}

//Output:- parent show() 
// show() is static → static binding → decided using reference type (Parent), not object type.