
//@Override
class Parent_Anno{
    void methodpar(){
        System.out.println("This is a parent class method");
    }
}

class Child_Anno extends Parent_Anno{
    @Override
    void methodpar(){
        System.out.println("This is a child class method");
    }
}

