/*@.....
Java annotation can have elements for which you can set values. 
An element is like an attribute or parameter. 
Here is an example of a Java annotation with an element:
@Entity(tableName = "vehicles")
annotation can contain multiple elements
*/

/*
Annotation Placement:- classes,interfaces,methods,method parameters,fields and local variables
*/
/*
Built-in Java Annotations
@Deprecated
@Override
@SuppressWarnings:- Hide compile time warning
@Contended:- It is used to avoid false sharing by adding padding to variables so 
             they don’t share cache lines in multi-threaded environments.
*/


public class Main_Anno {
@SuppressWarnings("deprecation")//Hide warning of Deprecated anonation
    public static void main(String[] args) {

    Parent_Anno p= new Child_Anno();
    p.methodpar();

    Deprecated_Annotations D=new Deprecated_Annotations();
    D.old_method();//It only give warning nothing else
}
}
