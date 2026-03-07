import java.util.InputMismatchException;
import java.util.Scanner;

public class AddStudent {
Scanner sc=new Scanner(System.in);

//Creating object to access the storage from Student Info class
StudentInfo info=new StudentInfo();
  
//variable
String name;
int RollNo; 
int Math,Biology,Chemistry,Physic;
int complete=0;

//Method to take input
public void InputName(){
    System.out.print("Enter Name:- ");
    name=sc.nextLine();  
    info.Storename[info.n]=name;
    info.n++;
    }
   
public void InputRollNo(){
    try{
    System.out.print("Enter Roll No:- ");
    RollNo=sc.nextInt();
    sc.nextLine();//clear buffer
    info.StoreRollNo[info.r]=RollNo;
    info.r++;
    } catch(InputMismatchException e) {
        System.out.println("Invalid Roll No");
    sc.nextLine();
    }   
} 

public void InputSubMark(){
    try{
    System.out.println("Enter Marks");
    //math
    System.out.print("Math:- ");
    Math=sc.nextInt(); 
    info.MathMark[info.m]=Math;
      
    //Biology
    System.out.print("Biology:- ");
    Biology=sc.nextInt();
    info.BiologyMark[info.m]=Biology;

    //Chemistry
    System.out.print("Chemistry:- ");
    Chemistry=sc.nextInt();
    info.ChemistryMark[info.m]=Chemistry;

    //Physic
    System.out.print("Physic:- ");
    Physic=sc.nextInt();
    info.PhysicMark[info.m]=Physic;

    sc.nextLine();//clear buffer
    info.m++;
    } catch(InputMismatchException e){
        System.out.println("Invalid input");
        sc.nextLine();
    }
} 
}