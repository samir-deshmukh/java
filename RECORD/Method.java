//Method in record

//simple method
record Student5(String name5,int age5)
{
    String method1(){
        return "Hi i am "+name5; //This is instance method
    }

//Overriding a Generated Method
//toString(),equals(),hashCode()

@Override //this overrid the default method
public String toString(){
    return "He is "+name5+" his age is "+age5; //instance method
}


//Static method
public static void method2(){
    System.out.println("This is static method\n");
}

/*Instance Method
1.Belongs to an object 
2.Can access instance variables 
3.Needs an object to call it
*/

//Instance method for static(Static method cant call instance(name or age)) 
public static void method3(Student5 s){
    System.out.println(s.name5());   
}

//1 more example of instance method
public String method4(){
    return name5().toUpperCase();
}


}

