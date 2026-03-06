public class CalculatoiMainClass {
    public static void main(String[] args){
AddStudent ad=new AddStudent();
MarkCalculator mc=new MarkCalculator(ad);

//Method call
ad.InputName();
ad.InputRollNo();
ad.InputSubMark();

mc.percentage();
    }
}
