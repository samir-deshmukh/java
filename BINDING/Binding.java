
public class Binding{
public static void main(String[] args) {
    
    //Static Binding
    Parent1.show(); //parent

    //Dynamic Binding
    Parent2 obj=new Child2(); 
    obj.show(); //Child
}
}