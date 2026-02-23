/*
1.Runs every time an object is created
2.Runs before constructor
Order:- 1. Instance Initializer Block
        2. Constructor
*/

public class Instance_block{

    {
       System.out.println("Instance initilazer Block");
    }

    //Constructor
    Instance_block(){
        System.out.println("Constructor\n");
    }

}