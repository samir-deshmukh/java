/*
1. loops are used to iterate a part of the program several times. 
2. There are four types of loops in Java, for, forEach, while, and do...while.
3. Syntax of for loop is for(initialization;condition;increment/decrement){}
4. Syntax of forEach loop is for(data_type variable:array_name){}
 */
    
class LOOPEx{
//for loop Used when you know in advance how many times the loop should run.

//Syntax:- for (initialization; condition; increment/decrement) {// code }

//Example: print numbers 1 to 5
void forLoopEx(){
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
System.out.println("\n");
}

//for-each loop (Enhanced for loop) Used only for arrays and collections. You cannot control index here.
//Syntax:- for (datatype variable : array) { // code }

//Example: array elements
int[] numbers = {10, 20, 30, 40};

void forEach(){

for (int num : numbers) {
    System.out.println(num);
}
System.out.println("\n");
}

//Example: String array
String[] names = {"Ram", "Shyam", "Amit"};

void forEachString(){
for (String name : names) {
    System.out.println(name);
}
System.out.println("\n");
}


//while loop Used when number of iterations is not known. Condition is checked before loop runs.
//Syntax:- while (condition) { // code }
//Example: print 1 to 5
int i = 1;

void WhileLoop(){
while (i <= 5) {
    System.out.println(i);
    i++;
}
System.out.println("\n");
}


//do...while loop Loop runs at least once, even if condition is false.
/*
Syntax:- 
        do { 
             // code
           } while (condition);
*/
//Example: condition false but runs once

int A = 10;

void doWhile(){
do {
    System.out.println(A);
} while (A < 5);

}
}

public class Loop{
    public void main(String[] args){
        LOOPEx obj = new LOOPEx();


        System.out.println("For Loop Example:");
        obj.forLoopEx();
        
        System.out.println("\nFor-Each Loop Example with Integers:");
        obj.forEach();
        
        System.out.println("\nFor-Each Loop Example with Strings:");
        obj.forEachString();
        
        System.out.println("\nWhile Loop Example:");
        obj.WhileLoop();
        
        System.out.println("\nDo-While Loop Example:");
        obj.doWhile();
    }
}