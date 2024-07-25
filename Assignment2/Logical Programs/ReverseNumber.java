import java.util.*;
public class ReverseNumber{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num4= input.nextInt();
        int sum1=0;
        while(num4>0){
            sum1=(sum1*10)+(num4%10);
            num4/=10;
        }
        System.out.println("Reversed Number: "+sum1);
  }
}
