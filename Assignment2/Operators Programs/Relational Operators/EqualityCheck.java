import java.util.*;
import java.lang.*;
public class EqualityCheck{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two Strings: ");
        String str1=input.nextLine();
        String str2 = input.nextLine();
        if(str1.equals(str2)) System.out.println("Both the strings are equal.");
        else System.out.println("Strings are not equal");
  }
}
