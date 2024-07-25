import java.util.*;
public class FibonacciSeries{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number of terms: ");
        int num1=input.nextInt();
        if(num1==1) System.out.println("0");
        else if(num1==2) System.out.println("0 1");
        else {
            int a = 0, b = 1;
            System.out.print(a + " " + b + " ");
            for (int i = 3; i <= num1; i++) {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
  }
}
  
