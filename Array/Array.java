//1. Array is a collection of variables of the same type.
//2. The variables in the array are ordered and indexed starting from 0.
//3. The size of arrey cannot chande once it is decleread

//importing packeg because we cant print arrey directly it gives hashcode
import java.util.Arrays;


// creating a class for Array decleration
class ArrayDecleartion{
//Declaring an Array Variable

//Both way of declearing is correct
//first way is commonly used and more readable
int[] Integer_Arrey;
int intArray[];
/*
 class cant contain executable statements it alll only to have
 Variables,Methods,Construster,Blocks,inner classes
*/ 

// If i didnt create a construster it will give error 
// constructor name should be same as class name
ArrayDecleartion(){
//Instantiating an Array
    Integer_Arrey=new int[5]; // we create an arrey size of 5 variables
}
}


//Array Literals
class literal{
    /*
     If you already know what values to insert into the array
     you can use an array literal
    */
   int[] arre1=new int[]{1,2,3,4,5}; 
   // if i try to declear size of arrey it will give error
/*
 java allow
int[] arre;
int[] arre=new int[5]; //only inside constuster or method
         OR
int[] aree=new int[]{1,2,3,4};

// Java identify it autometecly its size by the size given 
   OR
// the elements inside a curly bracket
*/

//Short way of arrey literal
int[] arre2={1,2,3,4,5};

}


//Accessing Java Array Elements
class access{
    int[] arre={2,4,6,8};
    
    int firstElement=arre[0];
    // one elemet at one time we can use loop to access and print all element 
    // or we can print directly using arrey packeg(Arrays.toString())
    
    //accessing all elemrnts by loop
    void loop1(){
        // in loop i use "Arrey_Name.length;" it use to find length of arre 
        for(int i=0; i<=arre.length-1; i++){
            System.out.println(arre[i]+"\n");
        }
    }

//Iterating Arrays example
    void loop2(){
        String[] stringArray = new String[10]; //string with defined size but no elements

for(int i=0; i < stringArray.length; i++) {
 //Yhis loop will assign a ("String no "+i) value to each element
    stringArray[i] = "String no " + i;
}
//this loop will print all elements in loop
for(int i=0; i < stringArray.length; i++) {
    System.out.println( stringArray[i]);
//output
/* String no 0
String no 1
String no 2
.......
*/
}
}

//The "for-each" loop Ex 
void loop3(){

    //arrey with no elements
    int[] intarrey=new int[5];
    for(int print : intarrey){
 System.out.println(print);
 //out put will be 0 because no elements in arre    
}
System.out.println("\n");

//arrey with elements
int[] intarrey1={1,3,5,7};
for(int print: intarrey1){
System.out.println(print);
}
System.out.println("\n");
}
    }
   
              
//Multidimensional Arrays 2D,3D
class multiDimenshion{
    //arrey with no elements
    int[][] intArray = new int[10][20];
 void MDloop(){
         intArray[0][2] = 129;

        int oneInt = intArray[0][2];
        System.out.println(oneInt+"\n");
 }

    //iterating 2D arrey
     void MDloop1(){
       //arre with elements
   int[][] intArray ={ 
    //"i" is a complete bracket and j is a elements inside bracket 
    {1,3,5,7,9},
    {2,4,6,8,10,},
    {1,2,3,4,5},
    {5,4,3,2,1}
};

for(int i=0; i < intArray.length; i++){
    for(int j=0; j < intArray[i].length; j++){
        System.out.println("i: " + i + ", j: " + j+" = "+ intArray[i][j]);
    }
}

    }


}

public class Array {
    public static void main(String[] args) {

        ArrayDecleartion obj1=new ArrayDecleartion();
        literal obj2= new literal();
        access obj3=new access();
        multiDimenshion obj4=new multiDimenshion();

        //ArrayDecleartion
        System.out.println("Arrey:- "+obj1.Integer_Arrey); 
        // it will give hashcode
System.out.println("Arrey:- "+Arrays.toString(obj1.Integer_Arrey)+"\n"); // using arrey packeg Arrays.toString()
        //output = {0,0,0,0,0} because default value

//literal
 System.out.println("Arrey:- "+Arrays.toString(obj2.arre1)); 
 System.out.println("Arrey:- "+Arrays.toString(obj2.arre2)+"\n"+"Using loop:-"+"\n");
 obj3.loop1();
 obj3.loop2();
obj3.loop3();


//multiDimenshion arrrey
obj4.MDloop();
obj4.MDloop1();
 
 
}
}