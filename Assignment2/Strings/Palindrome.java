import java.util.*;
import java.lang.String;
public class  Palindrome{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string: ");
        String s1 = input.nextLine();
        String dup1="";
        for(int i=s1.length()-1;i>=0;i--)
            dup1+=s1.charAt(i);
        if(s1.equals(dup1)) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }
}
