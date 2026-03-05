//Lambda Expresshion Interfaces With Default and Static Methods

public interface Interface3 {

//abstract
    int add(int a,int b);

//Default
    default void description(){
        System.out.println("This is calculator operation");
        }

//static method
    static boolean isPositive(int num){
    return num>0 ;      
    }

    
}
