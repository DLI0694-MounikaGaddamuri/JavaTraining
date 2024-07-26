import java.util.*;
public class OddOrEven{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n8=input.nextInt();
        System.out.println( ((n8 & 1) != 1) ? "Even":"Odd");
  }
}
