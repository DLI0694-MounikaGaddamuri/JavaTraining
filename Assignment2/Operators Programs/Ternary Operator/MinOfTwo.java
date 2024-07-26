import java.util.*;
public class MinOfTwo{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int n9 = input.nextInt();
        int n10 = input.nextInt();
        System.out.println("Minimum: "+(n9 < n10 ? n9 : n10));
  }
}
