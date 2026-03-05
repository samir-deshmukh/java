//Enum
/*
A Java Enum is a special Java type used to define collections of constants. 
More precisely, a Java enum type is a special kind of Java class. 
An enum can contain constants(Monday,wed....), methods etc.


1.Enum cannot extend any class,But can implement interfaces
2.Enum constructors are always private.
3.You cannot create enum objects using new.
   Not allowed:Day d = new Day();
   Enums create objects automatically.
4.Enum constants are public static final
5.ordinal() Gives position (starting from 0):- Day.MONDAY.ordinal(); // 0
6.name()
Returns constant name as String

*/

import java.util.EnumSet;
import java.util.EnumMap;

enum Days
 {
  Sunday,
  Monday,
  Tuesday,
  Wednesday,
  Thursday,
  Friday,
  Satarday
 }


//toString
enum PaymentStatus1 {
    PAYMENT_PENDING,
    PAYMENT_SUCCESS,
    PAYMENT_FAILED;
    
  }
  

  enum PaymentStatus2 {
    PAYMENT_PENDING,
    PAYMENT_SUCCESS,
    PAYMENT_FAILED;

    
    @Override
    public String toString() {
      switch(this) {
        case PAYMENT_PENDING: return "Payment Pending";
        case PAYMENT_SUCCESS: return "Payment Successful";
        case PAYMENT_FAILED: return "Payment Failed";
        default: return "";
      }
    }
    
    
  }


//Enum field
/*
1.Fields must be declared after constants.
2.Constructor is automatically private.
3.You cannot create enum objects manually.
4.Each enum constant = one object
5.Total objects = number of constants
6.They are created automatically
7.You cannot create more using new
*/
enum field
{
  SMALL(100),
  MEDIUM(200),
  LARGE(300)
  ; //semicolon needed when fields / methods follow

  private int size;

  private field(int size){
    this.size=size;
  }

  public int getSize(){
    return size;
  }


}



//Enum Method
//Method using field
enum Method
{
  LOW(99),MEDIUM(199),HIGH(299);

private int level;

private Method(int level){
  this.level=level;
}

int getlevel(){
  return level;
}

public void Display(){
  System.out.println("This Level is :- "+this+"\t"+level+"\n");

}

}

//Constant-Specific Method (Advanced Level)
enum Operation {

    ADD {
        public int apply(int a, int b) {
            return a + b;
        }
    },

    SUBTRACT {
        public int apply(int a, int b) {
            return a - b;
        }
    };

    public abstract int apply(int a, int b); 
    //Abstract is used because normal method need body abstract method 
    // We want every constant (ADD, SUBTRACT) to provide its own implementation.
    //so we use abstract
}
  


//Enum Implementing Interface
interface Printable{
void print();
int apply(int a,int b);
}

enum level implements Printable{
HIGH,LOW,MEDIUM,
ADD{
  public int apply(int a,int b){
    return a+b;
  }
}  ,

MULTIPLY{
  public int apply(int a,int b){
  return a*b;
}
};

public void print(){
  System.out.println("This is "+this+" Level\n");
}

}






public class Enu{
  public static void main (String[] args){
    
    
      //Ex od enum
      Days Today=Days.Tuesday;
      System.out.println(Today+"\n");
      
      
      //Enums in if Statements
      Days Today1=Days.Wednesday;
      if(Today==Days.Monday){
        System.out.println(Today1+"\n");
      }
      else if(Today == Days.Tuesday){
        System.out.println(Today1+"\n");
      }
      else if(Today==Days.Wednesday){
        System.out.println(Today1+"\n");
      }
      else if(Today==Days.Thursday){
        System.out.println(Today1+"\n");
      }
      else if(Today==Days.Friday){
        System.out.println(Today1+"\n");
      }
      else if(Today==Days.Satarday){
        System.out.println(Today1+"\n");
      }
      else if(Today==Days.Sunday){
        System.out.println(Today1+"\n");
      }
      
      
      //Enums in switch Statements
      Days Day=Days.Thursday;
      switch(Day){
        case Monday: System.out.println(Day+"\n");
        break;
        case Tuesday: System.out.println(Day+"\n");
        break;
        case Wednesday : System.out.println(Day+"\n");
        break;
        case Thursday: System.out.println(Day+"\n");
        break;
        case Friday: System.out.println(Day+"\n");
        break;
        case Satarday: System.out.println(Day+"\n");
        break;
        
      }
      
      
      //Enum Iteration
      for( Days Day1 : Days.values()){
        System.out.println(Day1);//Prints all values
      }
      System.out.println("\n");
      
      
      
      //every class in Java has toString()
      
      /*
      Now suppose this is shown on a website.Without overriding toString():
      output:- PAYMENT_PENDING
      */
     PaymentStatus1 P=PaymentStatus1.PAYMENT_FAILED;
     System.out.println(P+"\n");
     /*
     The ooutput looks robotic and ugly.
     */
    //With override
    PaymentStatus2 ss=PaymentStatus2.PAYMENT_FAILED;
    System.out.println(ss);
    
    
    /*
    ValueOf operator :- it convert string into enum
    When input is String, I can’t directly compare it with enum.
    I must convert String → Enum using valueOf().
    */
   Days Today3=Days.valueOf("Monday");
   System.out.println(Today3+"\n");
   
   
   //Enum fields
   field f=field.MEDIUM;
   System.out.println(f.getSize()+"\n");
   
   
   //Enum MEthod
   Method.HIGH.Display();
   
   System.out.println(Operation.ADD.apply(7,2));
   System.out.println(Operation.SUBTRACT.apply(7,2)+"\n");
   
   
   //Enum + interface
   level l=level.MEDIUM;
   l.print();
   
   l=level.MULTIPLY;
   System.out.println(l.apply(7, 3));
   l=level.ADD;
   System.out.println(l.apply(7, 3)+"\n");
   
   
// EnumSet is a special Set implementation used only for enum types.
// It is faster and more memory-efficient than HashSet
// because it internally uses bit operations.
/*
 Internally it stores enums as bits.
Example:
MONDAY    → 0000001
TUESDAY   → 0000010
WEDNESDAY → 0000100

So operations like add/remove/check are just bit operations.
That’s O(1) speed.
*/

//of() → create with specific values
EnumSet<Days> Weekends=EnumSet.of(Days.Sunday,Days.Satarday);
System.out.println(Weekends);

//allOf() → all enum constants
EnumSet<Days> allDays=EnumSet.allOf(Days.class);
System.out.println(allDays);

//noneOf() → empty set
EnumSet<Days> noneDays=EnumSet.noneOf(Days.class);
System.out.println(noneDays);

//range() → range of enums
EnumSet<Days> rangeOfDays=EnumSet.range(Days.Wednesday,Days.Satarday);
System.out.println(rangeOfDays+"\n");


//Enum Map
// EnumMap stores enum keys(Days.Monday) with associated/mapped values(Gym).
EnumMap<Days,String> Schedule =new EnumMap<>(Days.class);
Schedule.put(Days.Monday ," Gym");
Schedule.put(Days.Wednesday ," Office");
System.out.println(Schedule);

}
}