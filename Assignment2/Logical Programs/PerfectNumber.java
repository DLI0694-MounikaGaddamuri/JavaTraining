import java.util.*;
public class PerfectNumber{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num2=input.nextInt();
        int sum=1;
        for(int i=2;i<=num2/2;i++){
            if(num2%i==0)
                sum+=i;
        }
        if(sum==num2) System.out.println("Perfect Number");
        else System.out.println("Not a Perfect Number");
  }
}
