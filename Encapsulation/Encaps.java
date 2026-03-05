//Encapsulation

class Demo{
    private String name;
    private int age;

    //Using "geter & setter"
  
    //Setter
    public void setName(String newName){
      name=newName;
    }
    
    public void setAge(int newAge){
     age=newAge;
    }

    //Getter
    public String getName(){
return name ;
    }

    public int getAge(){
        return age;
    }

}


//Read only class
class Demo1{
private int No=7;
private String A="Hello World";

//this is read only class so we define getter only not setter

public String geta(){
return A;
}

public int getno(){
    return No;
}

}


//Write only class
class Demo2{
    private String Name;
    private int Age;

    public void setAge(int newAge){
        Age=newAge;
    }
 public void setName(String newName){
    Name=newName;
 }
}

public class Encaps{
    public static void main(String[] args){
Demo obj=new Demo();
obj.setName("Sam");
obj.setAge(19);

System.out.print("Name:- "+obj.getName()+"\n"+"Age:- "+obj.getAge()+"\n");

//Read only class
Demo1 obj1=new Demo1();
System.out.print("String:- "+obj1.geta()+"\n"+"Num:- "+obj1.getno()+"\n");


//Write only class
Demo2 obj2=new Demo2();
obj2.setAge(19);
obj2.setName("Sam");  //No output because we are getting value just assigning
}
}