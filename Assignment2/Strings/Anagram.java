import java.util.*;
import java.lang.String;
public class Anagram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two Strings: ");
        String string1 = input.nextLine();
        String string2= input.nextLine();

        string1.replaceAll("\\s","");
        string2.replaceAll("\\s","");

       if(string1.length() != string2.length())     System.out.println("Not Anagram");
       else{
           char[] string1Array = string1.toLowerCase().toCharArray();
           char[] string2Array = string2.toLowerCase().toCharArray();

           Arrays.sort(string1Array);
           Arrays.sort(string2Array);

           if(Arrays.equals(string1Array,string2Array)) System.out.println("Anagram.");
           else System.out.println("Not Anagram");
       }
    }
}
