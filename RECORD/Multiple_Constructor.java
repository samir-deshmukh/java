/*
2 types:- 
        1.Canonical Constructor (main constructor)
        2.Custom / Overloaded Constructor
 */

//1.Canonical:- we dont need this type of constructor because java done this automatically
record Student2(String name2,int age2){

    public Student2(String name2,int age2){
        this.name2= name2;
        this.age2= age2;
    }
    
    
}

//BUT if we want valdation then we use it like this

record Student3(String name3,int age3){
public Student3{
    if(age3<0){
        throw new IllegalArgumentException("Age cannot be negative");
    }
}
}


//2.Custom/Overloaded Constructor

record Student4(String name4,int age4){

    //constructor with different parameter (Constructor overloading concept)
    public Student4(String name4){
        this(name4,19); // must call canonical constructor
        /*
        Every overloaded constructor must call:
               this(...)

    You cannot do this:-  public Student(String name) {
                          this.name = name;  ❌ ERROR
                                                      }
        */
    }
    
    
}