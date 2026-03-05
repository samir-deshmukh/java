/*
try:- contain code that might raise exception

catch:- handles exception

finally:-ALways execute if exception occur or not

throw:- use to create and throw exception manually 

throws:- Used in method declaration to declare that 
           this method might cause an exception.
           It shifts responsibility to the caller.
*/

public class Exception{
    public static void main(String[] args) {
        
        //Areathmatic exception
        
        //try block contain code that might rais exception
        try{
            int a=7;
    int b=0;
    int c=a/b;
}

//catch block handles exception
catch(ArithmeticException e){
    System.out.println("AreathmaticException");
}

//finally block always execute if exception occur or not
finally{
    System.out.print("Finally block\n");
}


//throw exception
try{
   int age=16;
   if(age<18){
          throw new IllegalArgumentException();
   }   
}
catch(IllegalArgumentException e){
System.out.println("Age must be 18+");
}

finally{System.out.println("Program continues.....");
}



}
}
