//1. Array is a collection of variables of the same type.
//2. The variables in the array are ordered and indexed starting from 0.
//3. The size of arrey cannot chande once it is decleread

// This is a Array class "java.util is a packeg" & ".Array is a class"
//it use for copying,sorting,filling data,searching in array etc
import java.util.Arrays;
/*importing packeg because we cant print arrey directly it gives hashcode
it have a method "tostring()" which convert primitive type array into String  
*/


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
   int[] arre1=new int[]{1,2,3,4,5}; // OR  int[] arre1={1,2,3,4,5};
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
 //his loop will assign a ("String no "+i) value to each element
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
System.out.println("\n");
    }
}

//Inserting Elements Into an Array
class insertion{
    //Creating a arrey
    int[] array={1,3,5,9};
    int index=3; // index where i want to insert element
    int element=7; // element whic i want to insert

    //creatnig new arrey for more size
int[] newArray= new int[array.length+1];
    insertion(){
    
    //This loop will copy elements from "array to newArray"
        for(int i=0;i<index;i++)
            {
            newArray[i]=array[i];
        }
   //inserting element at index
         newArray[index]=element;
  //loop for copy remaining elements from "array"
      for(int i=index; i<array.length; i++) 
 
        {
            newArray[i+1]=array[i];
/*
  i<array.length because the we are copying array to newArray and 
  here array size is 4 & newarray size is 5 . we have to copy only 4 element 
  but if we use i<newArray.length then the loop will run 5 times but "array" size is four
  so it will give exception because we are trying to access element wwhich is not present in array  
*/
}
}
}


//Removing Elements From an Array
class remove{
    //create an array
    int[] array={2,4,3,6,8};
    int index=2; //index of element that we want ot remove
    
    int[] newarray=new int[array.length-1];
    //constructer
    remove(){

        //this loop will copy elements from "array to newarray"
for(int i=0; i<index;i++){
    newarray[i]=array[i];
}

    //this loop will start from index and it will change the value to its next element  
        for(int i=index; i<array.length-1; i++){
              newarray[i]=array[i+1];
                   }
}  
}


//Min and Max Value in Arrays
class minMax{
    // crating array
    int[] array={16,7,23,11,9};
    int min=array[0];
    int max=array[0];
    //MIN
    minMax(){
    //loop for finding min
        for(int i=0; i<array.length;i++){
         //condtion
         if(array[i]< min){
            min=array[i];
         }
    }   
    
    //loop for finding max
    for(int i=0; i<array.length;i++){
        if(array[i]>max){
            max=array[i];
        }
    }
}
}


//Copying Arrays
class copy{
    //creating array with value
    int[] array={1,3,5,7};
    int[] newArray1=new int[array.length];

    //Copying an Array by Iterating the Array
    void iteration(){
    for(int i=0; i<array.length; i++)
        {
          newArray1[i]=array[i];      
    }
System.out.println("coped array by iteration:-"+Arrays.toString(newArray1)+"\n");
}

//Copying an Array Using Arrays.copyOf()
int[] newArray2=new int[array.length];

void copyOf(){
    newArray2=Arrays.copyOf(array,newArray2.length);
    /*
    The Arrays.copyOf() method takes 2 parameters. 
    The first parameter is the array to copy. 
    The second parameter is the length of the new array
     */
    System.out.println("coped array by copyOf:-"+Arrays.toString(newArray2)+"\n");
}

//Copying an Array Using Arrays.copyOfRange()
int[] newArray3=new int[array.length];

void copyOfRange(){
    newArray3=Arrays.copyOfRange(array,0,array.length);
/*
 Arrays.copyOfRange() method takes 3 parameters. 
 first parameter is the array to copy. 
 second parameter is the first index in the source array to include in the copy. 
 third parameter is the last index in the source array to include in the copy
*/
System.out.println("copide array by copyOfrange:-"+Arrays.toString(newArray3)+"\n");
}

//Copying an Array Using System.arraycopy(source, 0, dest, 0, source.length);
int[] newArray4=new int[array.length];

void systemArrayCopy(){
    System.arraycopy(array, 0, newArray4, 0, array.length);
    /*
    "array" is thr array we want ot copy
    "0" is the starting index of "array"
    "newArray4" is ate array wehre we want to copy the elenments
    "0" is a starting index of "newArray4"
    "array.length" is the NO of elements to copy from "array"
    */
    System.out.println("copied array by system.arraycopy:-"+Arrays.toString(newArray4)+"\n");
}
}


//Sorting Arrays using Arrays.sort() method
class sorting{
//creating a array with elements
int[] array={2,5,3,7,1,4,6};

void sorting1(){
    Arrays.sort(array);
    System.out.println("sorted array:-"+ Arrays.toString(array)+"\n");
}

}


//Checking if Arrays are Equal with Arrays.equals()
class equal{

int[] ints1 = {0,2,4,6,8,10};
int[] ints2 = {0,2,4,6,8,10};
int[] ints3 = {10,8,6,4,2,0};

boolean ints1EqualsInts2 = Arrays.equals(ints1, ints2);
boolean ints1EqualsInts3 = Arrays.equals(ints1, ints3);

void equal1(){
System.out.println("ints1 is equal to ints2:-"+ints1EqualsInts2);
System.out.println("ints1 is equal to ints3:-"+ints1EqualsInts3+"\n");
}
}


//Filling Arrays With Arrays.fill()
class fillArray{
    int[] array=new int[7];

   void fill(){
    Arrays.fill(array, 7);
/*
in this syntax, "array" is the array we want to fill, 
and "7" is the value we want to fill the array with.
*/
    System.out.println("Filled array:- "+Arrays.toString(array)+"\n");

}

//filling in part of array
void fill1(){
Arrays.fill(array,3,5,13);
/*
in this syntax "array" is the array we want to fill,
and "3" is the index from their the given value will be filled 
& "6" it is the last index where filling value will stop 
(3,4,5)
last is a value that we are filling  
*/
System.out.println("Array filling in part:-"+Arrays.toString(array)+"\n");
}
}


//Searching Arrays with Arrays.binarySearch()
/*
   If more than one element exists in the array with the searched value, 
   there is no guarantee about which element will be found.
*/
class binarySearch{
     int[] array={0,2,4,6,8};
     
    int index1=Arrays.binarySearch(array,6);
   // "6" it is a value we are finding 

   int index2 = Arrays.binarySearch(array, 0, 4, 2);
   // it find last value "2" in array betweel the range of "0"-"4(without 4 it will be 3)"

   int index3 = Arrays.binarySearch(array, 7);
/*
    7 is not in a array then The number 7 should have been inserted into the array 
    at index 4, if 7 was to be inserted into the array (and the sort order kept).
    Therefore binarySearch() returns -4 - 1 = -5 .
 */
   
   int index4 = Arrays.binarySearch(array, 12);
   /*
1. If all elements in the array are smaller than the sought value, 
   then binarySearch() will return - length of the array - 1.
2. In this example we search for 12 in the array, 
   but all elements in the array are smaller than 12. 
   ""Therefore binarySearch() will return -length (-5) - 1 = -5 -1 = -6.""
   */

    void index1(){
        System.out.println("The value index No:- "+index1+"\n"); //3
        System.out.println("The value index No:- "+index2+"\n"); //1
        System.out.println("The value index No:- "+index3+"\n"); //-5
         System.out.println("The value index No:- "+index4+"\n"); //-6
    }

}


public class Array {
    public static void main(String[] args) {

        ArrayDecleartion obj1=new ArrayDecleartion();
        literal obj2= new literal();
        access obj3=new access();
        multiDimenshion obj4=new multiDimenshion();
        insertion obj5=new insertion();
        remove obj6=new remove();
        minMax obj7=new minMax();
        copy obj8=new copy();
        sorting obj9=new sorting();
        equal obj10=new equal();
        fillArray obj11=new fillArray();
        binarySearch obj12=new binarySearch();

        
//ArrayDecleartion
    System.out.println("Arrey:- "+obj1.Integer_Arrey); 
// it will give hashcode
    System.out.println("Arrey:- "+Arrays.toString(obj1.Integer_Arrey)+"\n"); 
    // using arrey packeg Arrays.toString()
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

//insertion
System.out.println("Array:-"+Arrays.toString(obj5.array)+" Array after insertion:-"+Arrays.toString(obj5.newArray));
 
// Removing element
System.out.println("Array:-"+Arrays.toString(obj6.array)+" Array after removing an element:-"+Arrays.toString(obj6.newarray)+"\n");

//Min & Max
System.out.println("Array:-"+Arrays.toString(obj7.array)+"\n");
System.out.println("Max value:-"+obj7.max+"\t"+"Min value:-"+obj7.min+"\n");

//copying array by loop
obj8.iteration();
obj8.copyOf();
obj8.copyOfRange();
obj8.systemArrayCopy();

//Sorting array
obj9.sorting1();

//check array is match or not
obj10.equal1();

//Filling array
obj11.fill();
obj11.fill1();

//binarySearch
obj12.index1();

}
}