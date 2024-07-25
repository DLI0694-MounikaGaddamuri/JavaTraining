import java.util.*;
public class MultiplicationTable{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for multiplication table: ");
        int n3=input.nextInt();
        for(int i=1;i<=12;i++)
            System.out.println(n3+" * "+i+" = "+(n3*i));
        System.out.println();
  }
}
