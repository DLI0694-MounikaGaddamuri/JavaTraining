import java.util.*;
public class MaxOfThree{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any three numbers:");
        int n4=input.nextInt();
        int n5=input.nextInt();
        int n6=input.nextInt();
        System.out.println("Maximum of three numbers: "+(n4>n5?(n4>n6?n4:n6):(n5>n6?n5:n6)));
  }
}
