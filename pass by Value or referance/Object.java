/*
1.When you pass an object → Java copies the reference (the address), not the object itself.
2.Because the reference is copied:
3.You can modify the object’s data
4.You cannot change the original reference
*/


class Box{
    int value;  //the object value 97 comes but
}

public class Object {
    static void change(Box b){
   b.value=23;  //Here the value changes to 23 after we call change 
    }
public static void main(String[] args) {

    Box obj=new Box();
    obj.value=97;

    change(obj);
    System.out.println(obj.value); //23

}
}


