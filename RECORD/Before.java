/*
Before records, if you wanted a simple data class, you had to write:
Fields
Constructor
Getters
toString()
equals()
hashCode()
So much boilerplate 😩
Record does all that automatically.
*/

class Student{

    private String name;
    private int age;

    //setter
    public Student (String name,int age){
     this.name=name;
      this.age=age;
    }

    //getter
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
}
