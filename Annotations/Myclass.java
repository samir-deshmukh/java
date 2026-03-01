//Custom anoation
//We can give any name to custom annoation

@interface custom {

    String value() default "3";
    //if we are declearing default value them we dont need to assigne value to it
    String name();
    int age();
    String[] array();
}

@custom(
        name="Samir",
        age=18,
        array={"abc","bca","cab"}
        )
public class Myclass{
    
}
