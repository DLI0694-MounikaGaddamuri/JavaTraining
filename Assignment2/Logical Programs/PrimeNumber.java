import java.util.*;
public class PrimeNumber{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num3=input.nextInt();
        int count=0;
        for(int i=2;i<=num3/2;i++){
            if(num3%i==0)
                count++;
        }
        if(count==0) System.out.println("Prime Number");
        else System.out.println("Not a Prime Number");
}
