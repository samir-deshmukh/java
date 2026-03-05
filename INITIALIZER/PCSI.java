//Parent+Child+Ststic+instance Block

class Parent {
//static block
    static{
    System.out.println("Parent Static Block");
}

//instance block
{
    System.out.println("Parent instance block");
}

//constructor
Parent(){
    System.out.println("Parent Constructor");
}
}

class Child extends Parent{
//static block
    static{
    System.out.println("Child Static Block");
}

//instance block
{
    System.out.println("Child instance block");
}

//constructor
Child(){
    System.out.println("Child Constructor");
}
}


/* Execution Order:- 
                    1. Static parent block
                    2. Static Child block
                    3. Instance parent block
                    4. Parent constructor
                    5. Instance Child block
                    6. Child constructor

*/
