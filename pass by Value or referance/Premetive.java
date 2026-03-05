/*
Java is pass-by-value. Always.

1.When you pass a primitive → Java copies the actual value.
2.When you pass an object → Java copies the reference (the address), not the object itself.
3.Because the reference is copied:
4.You can modify the object’s data
5.You cannot change the original reference
*/

class Premetive{

    static void change(int x){
     x=7;
    }

public static void main(String[] args) {
 int a=2;

 Premetive.change(a); //when we pass premitive value java copi the actual value
 System.out.println(a); //2

}
}