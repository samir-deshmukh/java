//Dynamic Binding
/*
1.Decided at runtime
2.JVM decides based on actual object
Happens with:   1.Normal (non-static, "final", non-private) methods
                2.Method overriding
*/

class Parent2 {
      void show(){
      System.out.println("Parent static method ");
}    
}

class Child2 extends Parent2{
    @Override
     void show(){
        System.out.println("Child static method");
    }
}

