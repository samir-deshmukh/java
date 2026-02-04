//Java Math Operators

//importing java Math 
/*
It have provides more advanced mathematical calculations
The Math class contains methods
*/
import java.lang.Math;

 class BasicOperator {

    // Basic operators +,-,*,\,%

    //deckearing variables
    int A=7;
    int B=13;
    //performing operations
    int add=A+B;
    //int add1= A+=B; //A+=B   :-  A=A+B
    int sub=A-B;
    //int sub1= A-=B;  //A=A-b
    int mul=A*B; 
    float div=(float)B/A; // IMP :- Float point or Double result is not 100% accurate
    float mod=B%A;         
}


//Java Math Operator Precedence
class Precidence{
    //Java forllow BODMAS Rule
    double C= 2*5/7+9*2;
    double D = 2*5/(2+7)+4*7;
    /* 1.  2+7
       2.  2*5
       3.  10/9=1 (Because No are integer)
       4.  1+4*7
       5.  1+28
       6.  29
       If any No in equation taken as float then result will be 29.11111111
    */
    

/*
Java has a way to force all numbers in a calculation to be floating point variables. 
You suffix the numbers with either a capital F or D
*/
double E=1000D/5D;
    }

//Basic Math Functions
class  MathFunction1{

/*
    Math.abs()
    Math.ceil()
    Math.floor()
    Math.floorDiv()
    Math.min()
    Math.max()
    Math.round()
    Math.random()
 */

    //Math.abs :- it give absolute vlue (Return positive value always)
    int q=10;
    int w=(-20); 
 int ansQ=Math.abs(q);
 int ansW=Math.abs(w);

 //Math.ceil rounds a floating point value up to the nearest integer value
 float r=7.257f;
 float ansR=(float)Math.ceil(r); //can use Double at the place of float

 //Math.floor rounds a floating point value down to the nearest integer value
 //opposite of ceil
 float ansT=(float)Math.floor(r);

 //Math.floorDiv
 // it give same result as "/" operator when num are postive altho 
 // if num is negative then it gives down nearest integer
 double Y=100/9; //11.0
 double U=-100/9; //-11.0
 double div=Math.floorDiv(100,9); //11.0
 double div1=Math.floorDiv(-100,9); //-12.0

 //Math.min() & math.max()
 int NO1=27;
 int NO2=13;
 int result1=Math.min(NO1,NO2);
 int result2=Math.max(NO1,NO2);

 //Math.round():- it give closest integer valut to the result
 double roundUp=Math.round(23.545); //24
 double roundDown=Math.round(23.445); //23
 double roundMid=Math.round(23.500);

 //Math.random :- it take random NO between 0 & 1  
 // It is not fully random it make calculation unpredictable as possible
 double random=Math.random();
 double random1=Math.random()*1000;
}


//Exponential and Logarithmic Math Functions
class MathFunction2{
/*
    Math.exp()
    Math.log()
    Math.log10()
    Math.pow()
    Math.sqrt()
*/

//Math.exp() :-The Math.exp() function returns e (Euler's number) 
// raised to the power of the value provided as parameter
double exp=Math.exp(1);
double exp1=Math.exp(2); // Euler's No rais to power "2"(any no inside the bracket)

//Math.log()
/*
  The Math.log() method provides the logarithm of the given parameter. 
  The base for the logarithm is "i" (Euler's number)
*/
double log1=Math.log(1);
double log2=Math.log(10);

//Math.log10()
/*
  The Math.log10 method works like the Math.log() method except 
  it uses 10 as is base for calculating the logarithm instead of e (Euler's Number)
*/

double log10a=Math.log10(1);
double log10b=Math.log10(100);

//Math.pow() :- return power of 1st arameter to 2nd EX:- (4,2)=16
int power1=(int)Math.pow(2,2);
int power2=(int)Math.pow(2,8);

//Math.sqrt :- give square root of given parameter
double sqr1=Math.sqrt(16);
double sqr2=Math.sqrt(32);
}


//Trigonometric Math Functions
class Trigno{
/*
Math.PI
Math.sin(),Math.cos(),Math.tan() :- calculates the...value of some angle value in radians
Math.asin(),Math.acos(),Math.atan() :- calculates the arc...value of a value between 1 and -1
Math.sinh(),Math.cosh(),Math.tanh():- calculates the hyperbolic...value of a value between 1 and -1
Math.toDegrees():- converts an angle in radians to degrees
Math.toRadians():- converts an angle in degrees to radians
*/
}



public class MathOperator {
    public static void main(String[] args) {
        BasicOperator obj1 = new BasicOperator();
        Precidence obj2 = new Precidence();
        MathFunction1 obj3=new  MathFunction1();
        MathFunction2 obj4=new MathFunction2();

        //Basic Operator
        System.out.println("Addition: " + obj1.add);
        System.out.println("Subtraction: " + obj1.sub);
        System.out.println("Multiplication: " + obj1.mul);
        System.out.println("Division: " + obj1.div);
        System.out.println("Modulus: " + obj1.mod+"\n");
       

//Precidence
        System.out.println(obj2.C+"\n"+obj2.D+"\n"+obj2.E+"\n");


// MathFunction

    //Math.abs
    System.out.print("ansQ:- "+obj3.ansQ+"\n"+"ansW:- "+obj3.ansW+"\n");
    
    //Math.ceil
    System.out.print("ansR:- "+obj3.ansR+"\n");

    //Math.floor
    System.out.print("ansT:- "+obj3.ansT+"\n");

    //Math.floorDiv
     System.out.println("Y:- "+obj3.Y+"\n" +"U:- "+ obj3.U+"\n"+"div:- "+ obj3.div+"\n" +"div1:- "+ obj3.div1+"\n");

    //Math.min & Math.max
     System.out.print("Min:- "+obj3.result1+"\n"+"Max:- "+obj3.result2+"\n");

    //Math.round
    System.out.print("Round Up:-"+obj3.roundUp+"\n"+"Round Down:-"+obj3.roundDown+"\n"+"Round Mid:-"+obj3.roundMid+"\n");

    //Math.random
 System.out.print("Random No:- "+obj3.random+"\n"+"Random No wit multiply with 1000:- "+obj3.random1+"\n");
  

 //MAthFunction

 //Math.exp()
 System.out.println("Euler's number:- "+obj4.exp+"\n"+"Euler's No rais to power 2:- "+obj4.exp1+"\n");

 //Math.log()
 System.out.println("log1:- "+obj4.log1+"\n"+"log2:- "+obj4.log2+"\n");

 //Math.log10()
 System.out.println("log10 a:- "+obj4.log10a+"\n"+"log10 b:- "+obj4.log10b+"\n");

 //Math.pow()
 System.out.println("2^2:- "+obj4.power1+"\n"+"2^8:- "+obj4.power2+"\n");

//Main.sqrt()
System.out.println("Square root of 16:- "+obj4.sqr1+"\n"+"Square root of 32:- "+obj4.sqr2+"\n");

}
}
