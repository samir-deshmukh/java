/* ORDER:- When you create an object:
            1.Static variables
            2.Static block
            3.Instance variables
            4.Instance initializer block
            5.Constructor
*/

public class Initilizer_block {
    public static void main(String[] args){

        //instance block
        Instance_block obj=new Instance_block();
        
        //Static block
        Static_block obj1=new Static_block();


        //Parent+Child+Ststic+instance Block
        Child obj2=new Child();

    }
}

/*
| Static Block          | Instance Block             |
| --------------------- | -------------------------- |
| Runs once             | Runs every object creation |
| Uses `static` keyword | No `static` keyword        |
| Runs when class loads | Runs before constructor    |

*/