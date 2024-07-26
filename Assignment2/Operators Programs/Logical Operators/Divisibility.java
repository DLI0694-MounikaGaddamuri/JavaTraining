import java.util.*;
public class Divisibility{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n7=input.nextInt();
        if(n7%5==0 && n7%7==0) System.out.println(n7+ " is Divisible by both 5 and 7.");
        else System.out.println(n7+ " is not Divisible by both 5 and 7.");
  }
}
