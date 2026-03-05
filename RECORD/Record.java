/*
Record:- Record is a special immutable data class in Java that automatically 
generates constructor, getters, equals, hashCode, and toString methods.

record is final  & immutable
Record cannot extend a class but Can implement interface

*/



public class Record {
    public static void main(String[] args){

//Before records
        Student obj=new Student("samir", 19);
        System.out.println("Name:- "+obj.getname()+"\n"+"Age:- "+obj.getage()+"\n");



//After records
after obj1=new after("Samir",19);

System.out.println("Nmae:- "+obj1.name1());
System.out.println("Age:- "+obj1.age1());

System.out.println(obj1.toString()+"\n");


//Constructor overloading

Student3 obj3=new Student3("Samir",19);
System.out.println(obj3.name3()+" "+obj3.age3()+"\n "); //if we enter age 0 it will give exception

Student4 obj4=new Student4("Samir"); //it is a inner constructor with single parameter
System.out.println(obj3.name3()+" "+obj3.age3()+"\n");


//Method 
Student5 obj5=new Student5("Samir",19);
System.out.println(obj5.method1());
System.out.println(obj5);
//no need to write toString() because "println()"" automatically calls "toString()""
  
obj5.method2();
obj5.method3(obj5);

System.out.println(obj5.method4());

}
}
