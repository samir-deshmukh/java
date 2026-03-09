public class MarkCalculator {
 AddStudent ad; // received from main, not created here
// Constructor - accepts the same AddStudent object used in main
    public MarkCalculator(AddStudent ad)
     {
        this.ad = ad;
    }

//percentage calculating method
public void percentage(){
    int i=ad.complete;
int totalMarks=ad.info.MathMark[i]+ad.info.BiologyMark[i]+ad.info.ChemistryMark[i]+ad.info.PhysicMark[i];
double percent= (totalMarks/400.0)*100;
System.out.println("Percentage:- "+percent+"\n");

//Grade
if(totalMarks<100){ System.out.print("Grade:- D");}
else if (totalMarks<200) { System.out.print("Grade:- C");}
else if (totalMarks<300) { System.out.print("Grade:- B");}
else{ System.out.print("Grade:- A");}

ad.complete++;
}
}
