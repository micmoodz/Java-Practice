import java.util.*;
public class Strings {
    public static void main(String[] args){
        // Scanner sc= new Scanner(System.in);
        //    String name= sc.nextLine();
        //    System.out.println("Your name is: " + name);
        //concatenation
        // String firstName="Dibya";
        // String lastName="Disha";
        // String fullName= firstName + " " + lastName;
        // System.out.println(fullName);
        //print length of a string
        // String firstName="Dibya";
        // String lastName="Disha";
        // String fullName= firstName + " "    + lastName;
        // System.out.println(fullName.length());
        //charAt
        // String firstName="Dibya";
        // String lastName="Disha";
        // String fullName= firstName + " "    + lastName;
        // System.out.println(fullName.length());
        // for (int i=0; i<fullName.length(); i++){
        //     System.out.println(fullName.charAt(i));
        // }
        //compare two strings
        // String name1= "Dibya";
        // String name2= "Dibya";
        // if(name1.compareTo(name2)==0){
        //     System.out.println("Strings are equal");
        // }
        // else{
        //     System.out.println("Strings are not equal");
        // }
        //substring
        String sentence="My name is Dibya";
        String name= sentence.substring(11,sentence.length());
        System.out.println(name);
    }   
}