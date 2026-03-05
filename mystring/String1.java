// String maipulation Demo in java

//Importinh arrey for split class
import java.util.Arrays;


// this class shows different way to create a string & Escape characters(\n,\t,\r,\\),\") 
class PracticeString  {
    // in java string is object

    String mystring= new String("Hello world");

    //string Literal. easy way to create a string
    String Mystring=("Hello! World");

    //EScape characters
    String escape=("\tJava \n It is a high level \\ \"interpreted programming\" \n \t langague");

}


//this class shows string leteral are constant or singoleton
 class Singleton{
        /* 1.JVM store both string in same memory location. 
           2. string are immutable we cannot change it.
           3. if we make change in str2 it is not going to affect str1
           */ 
      String str1="Hello!";
      String str2= "Hello!";  
}


//this class showes Texr Block feature
class TextBlock{
    String str3 = """
            This is a Text Block 
            Here we can write Texts or strings in multiple lines
            without using escape character like "\\n"
            """;

// Text Bolck Indentation feature
//The (""") affects the indentation of text base on the position of (""")  
String str4="""
This is a Text Block
""";

 String str5="""
   This is a Text Block
 """;

 String str6="""
    This is a Text Block
 """;
 //See in this 3 string the (""") position ,it affect the identation we will see on output

}


//String concatination :- Joining 2 or more strings to make a single string
 class Conca{
    String str7="Hellow";
    String str8="World!";

    //Ways to join strings

    //"+" operator use for small strings it is simple and redable
    String str9= str7+" "+str8;

    //concat() method use for large string it cannot concat on NUll 
    // in this the concat("") is use for give space 
    String str10= str7.concat( " ").concat(str8);

    //Stringbulder method use for larg strings it is mutable and faster for concatination(loop)
    StringBuilder sb= new StringBuilder();
    String str11= sb.append(str7).append(" ").append(str8).toString();

    //StringBuffer method use for large strings it is mutable and thrade safe, slower than StringBuilder
    StringBuffer sdf1= new StringBuffer();
    String str12=sdf1.append(str7).append(" ").append(str8).toString();

    //common Methof for stringBufer , append(),insert(),Replace(),delete(),reverse()
    StringBuffer sdf2=new StringBuffer("Hello World!");
    String str13= sdf2.insert(6,"Java ").toString();
    //String is now "Hello Java World!"
    String str14= sdf2.replace(6,17,"").toString();
    //String is now "Hello"
    String str15=sdf2.reverse().toString();
    //String is now "olleH"
    String str16=sdf2.delete(0,5).toString();
    //String is now "H"
    
}


//Mesures the Lengthg of string
class Strlength{
    String str17="Hello World!";
 int Length=str17.length();
}


//Substring:- Extract specific part from string
 class Substring{
    String str18="Hello Java!";
    String sub=str18.substring(0,5);
}


//Searching in string With inderof()
 class Indexing{
String str19="Hello World!";
int index1=str19.indexOf("World");
int index2=str19.indexOf("l");

//useing loop to find all related word index
//if no index found it will return -1
String str20= "This is a Java String Practice Program";
String substring="is";
int index = str20.indexOf(substring);
}


/*Matching a String Against a Regular Expression With matches()
* The Java String matches() method takes a regular expression as parameter, 
and returns true if the regular expression matches the string, and false if not. */
class Match{
    String str21="one two three two one";
    boolean match=str21.matches(".*two.*");
    boolean nomatch=str21.matches(".*five.*");
}


//Comparing Strings methods :- equals(),equalsIgnoreCase(),startsWith(),endsWith(),compareTo()
class Compare{
    //strings for equal(),equalsIgnorcase(),compareTo() methods
String strA= "abc";
String strB="def";
String strC="abd";
String strD="abc";
String strE="ABC";

//string for startsWith() and endsWith() methods
String strF="This is a java program"; 
}


//Trimming Strings With trim()
//trim is use remove white space characters at the beginning and end of the string
class Trim{
    String str22="  Hellow world!   ";//it dosent affect space bttween words only at begining and end
}


//Replacing Characters in Strings With replace().replaceFirst(),replaceAll()
class Replace{
String str23="one two three two one";

//replace()
String strF=str23.replace("three","five");

//replaceFrist()
String strG=str23.replaceFirst("two","three");

//replaceAll()
String strH=str23.replaceAll("two","four");
}

//Splitting Strings With split()
class Split{
    //creating two strings
    String str24="a man drove vith a car";
    String str25= "apple,banana,mango,orange";

    //split operation
    String[] split1=str24.split("a");
    String[] split2=str25.split(",");
}


//Converting Numbers to Strings With valueOf()
class Valueof{
    // valueOf convert integer into string
    String str26=String.valueOf(10);
    String str27=String.valueOf(9.99);
}


//Getting Characters and Bytes
class Character{
    //charAt() method to get index No of specific character in string
    String str28="Java is a programming language";
    char ch=str28.charAt(1);
    char ch1=str28.charAt(5);

}


//Converting to Uppercase and Lowercase
class Case{
String str29="Java IS a ProgRamming LANGAUge";
String upper=str29.toUpperCase();
String lower=str29.toLowerCase();
}


//String Formatting
class Formating{
    //in string formtine the word %S is replaced by the string value
    String str30="Hello %s";
    String str31=String.format(str30,"world!");
}


//Translate Escape Codes
class Translation_Escape{
     String str32= "This is a \\n escape chatacter";
     //Here the translateEscape() method will translate \\n into a new line character(\n)
     String str33= str32.translateEscapes();
}


//Main class
public class String1{
public static void main(String[] args){
    PracticeString obj1 = new PracticeString();
    Singleton obj2 = new Singleton();
    TextBlock obj3= new TextBlock();
    Conca obj4=new Conca();
    Strlength  obj5=new Strlength();
    Substring obj6=new Substring();
    Indexing obj7=new Indexing();
    Match obj8=new Match();
    Compare obj9=new Compare();
    Trim obj10=new Trim();
    Replace obj11=new Replace();
    Split obj12=new Split();
    Valueof obj13=new Valueof();
    Character obj14=new Character();
    Case obj15=new Case();
    Formating obj16=new Formating();
    Translation_Escape obj17=new Translation_Escape();

    //Practicer
    System.out.println(obj1.escape+"\n");

    //Singleton
    System.out.println(obj2.str1 + "\n" + obj2.str2 + "\n" + obj2.str2+"World" + "\n");
    
    //TextBlock
    System.out.println(obj3.str3 + "\n");
    //Tsext Block Indentation
    System.out.println(obj3.str4 + "\n"+obj3.str5+"\n"+obj3.str6+"\n");

    //Concatination
    System.out.println(obj4.str9+"\n" +obj4.str10+"\n" +obj4.str11+"\n" +obj4.str12+"\n" +obj4.str13+"\n" +obj4.str14+"\n" +obj4.str15+"\n"+obj4.str16+"\n");

   //String length
   System.out.println(obj5.Length+"\n");

   //Substring
   System.out.println(obj6.sub+"\n");

   //Indexing
   System.out.println(obj7.index1+"\n"+obj7.index2+"\n");
//inexing with loop to find all character index in string 
while(obj7.index !=-1){
System.out.println(obj7.index);
    obj7.index=obj7.str20.indexOf(obj7.substring,obj7.index+1);
    System.out.println("\n");
}

//Matches
System.out.println(obj8.match+"\n"+obj8.nomatch+"\n");

//comparing using equals() method
/*tests if two Strings are exactly equal to each other. 
If they are, the equals() method returns true. 
If not, it returns false*/
System.out.println(obj9.strA.equals(obj9.strB));
System.out.println(obj9.strA.equals(obj9.strC));
System.out.println(obj9.strA.equals(obj9.strD)+"\n");

// using equalsIgnoreCase() method
/*compares two strings but ignores the case of the characters. 
Thus, uppercase characters are considered to be equal to their lowercase equivalents. */
System.out.println(obj9.strA.equalsIgnoreCase(obj9.strE)+"\n");

//using startsWith() method
/*startsWith() and endsWith() methods check if the String starts with or ends with a certain substring */
System.out.println(obj9.strF.startsWith("This"));
System.out.println(obj9.strF.endsWith("program"));
//it is case sensitive if i change p to P it will give false

/*The compareTo() method compares the String to another String and 
returns an int telling whether this String is smaller, 
equal to or larger than the other String.
If the String is earlier in sorting order than the other String, 
compareTo() returns a negative number. 
If the String is equal in sorting order to the other String, compareTo() returns 0. 
If the String is after the other String in sorting order, 
the compareTo() metod returns a positive number. */
System.out.println(obj9.strA.compareTo(obj9.strB)); //-3
System.out.println(obj9.strA.compareTo(obj9.strC)); //-1
System.out.println(obj9.strA.compareTo(obj9.strD)); //0
System.out.println(obj9.strA.compareTo(obj9.strE)+"\n"); //32

//Trimming
System.out.println(obj10.str22.trim()+"\n");

//Replace
System.out.println(obj11.strF+"\n"+obj11.strG+ "\n" +obj11.strH+"\n");

//Split
//use Arrays.toString() to print array altho in the output it will give string array object,prints its memory refirance
//see difference
System.out.println(obj12.split1+"\n"+obj12.split2+"\n"); 
System.out.println(Arrays.toString(obj12.split1)+"\n"+Arrays.toString(obj12.split2)+"\n");

//valueOf()
System.out.println(obj13.str26+"\n"+obj13.str27+"\n");

//Character
System.out.println(obj14.ch+"\n"+obj14.ch1+"\n");

//case
System.out.println(obj15.upper+"\n"+obj15.lower+"\n");

//Formating string
System.out.println(obj16.str31+"\n");

//Translation Escape
System.out.println("This is a normal string:-"+obj17.str32+"\n");
System.out.println("This is a translated string:- "+obj17.str33+"\n");

}
}