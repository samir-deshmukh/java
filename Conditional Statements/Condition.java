/*
"if" to specify a block of code to be executed, if a specified condition is true
"else" to specify a block of code to be executed if the same condition is false
"else if" to specify a new condition to test; if the first condition is false
"switch" to specify many alternative blocks of code to be executed
 "?,:" operator to specify one line condition
*/



class conditionEX{
    
//if statement Used when you want to execute code only if a condition is true.
    int age = 20;

void ifCondition(){
if (age >= 18) {
    System.out.println("You are eligible to vote"+"\n");
}
//If condition is false → nothing happens
}


//if–else statement Used when you want two paths: true or false.
int number = 5;

void ifElsecondition(){
if (number % 2 == 0) {
    System.out.println("Even number"+"\n");
} else {
    System.out.println("Odd number"+"\n");
}
}


//else if ladder Used when you have multiple conditions.
int marks = 75;

void elseifCondition(){
if (marks >= 90) {
    System.out.println("Grade A"+"\n");
} else if (marks >= 75) {
    System.out.println("Grade B"+"\n");
} else if (marks >= 50) {
    System.out.println("Grade C"+"\n");
} else {
    System.out.println("Fail"+"\n");
}
}


//Nested if An if inside another if.
int age1 = 22;
boolean hasId = true;

void nested(){

if (age1 >= 18) {
    if (hasId) {
        System.out.println("Entry allowed"+"\n");
    } else {
        System.out.println("ID required"+"\n");
    }
} else {
    System.out.println("Underage"+"\n");
}
}


//switch statement Used when you compare one variable with many fixed values.
int day = 3;
 void SwitchCondition(){
switch (day) {
    case 1:
        System.out.println("Monday"+"\n");
        break;
    case 2:
        System.out.println("Tuesday"+"\n");
        break;
    case 3:
        System.out.println("Wednesday"+"\n");
        break;
    case 4:
        System.out.println("Thursday"+"\n");
        break;
    default:
        System.out.println("Invalid day"+"\n");
}

//break stops execution
//default runs if no case matches
}



//Switch with String (very common)
String fruit = "Apple";

void SwitchString(){
switch (fruit) {
    case "Apple":
        System.out.println("Red fruit"+"\n");
        break;
    case "Banana":
        System.out.println("Yellow fruit"+"\n");
        break;
    default:
        System.out.println("Unknown fruit"+"\n");
}

//"break" if the condition match it will terminate the loop or condition 
//"continue" if the condition match it will skip the current iteration and continue with the next iteration 
}


//Ternary Operator ?: (one-line condition) Used as short form of if–else.
//Syntax:- condition ? value_if_true : value_if_false;

//Example 1:
int a = 10, b = 20;
void Ternery1(){
int max = (a > b) ? a : b;
System.out.println(max+"\n");
}

//Example 2
int age2 = 16;

void Ternery2(){
String result = (age2 >= 18) ? "Adult" : "Minor";
System.out.println(result);
}
}


public class Condition{
    public static void main(String[] args){
        conditionEX obj = new conditionEX();

        obj.ifCondition();
        obj.ifElsecondition();
        obj.elseifCondition();
        obj.nested();
        obj.SwitchCondition();
        obj.SwitchString();
        obj.Ternery1();
        obj.Ternery2();
    }
}