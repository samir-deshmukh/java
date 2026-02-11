//Final Keyword
/*
Important Rule:-
For a final instance variable:
                                It must be assigned
                                either at declaration
                                OR inside constructor
                                But only once

This mean we can assigne value to final varibale only once
*/
//This is Final class
final class Final_Class {
//It cant be extend or inherited by other class

//class Final_Cless extends car 
//we cant extend it will give error
}


//Methods marked as final cannot be overridden
class methodOverriding{
    final void display(){
        System.out.println("This is final method cant be overrriden");
    }

    class child{
        void display(){
             System.out.println("This is method cant override final method");
             //If method is not final then we can override            }
    }
}
}


//Final Variable
//It is constant once decleard we cant change its value


//Final Reference Variables
/* 
  If we have a final reference variable, we can’t reassign it either. 
  But this doesn’t mean that the object it refers to is immutable. 
  We can change the properties of this object freely.
 */


  //Final Parameters
  //A final parameter can’t be changed inside a method


public class FinalKey{
public static void main(String[] args){

//we can acces methods all other things from final class by creating object
Final_Class obj1=new Final_Class();
methodOverriding obj2= new methodOverriding();

//Overriding
obj2.display();


}
}   

