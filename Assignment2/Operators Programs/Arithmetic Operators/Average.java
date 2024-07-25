import java.util.*;
public class Average{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any five numbers: ");
        int arr[] = new int[5];
        int sum2=0;
        for(int i=0;i<5;i++) {
            arr[i] = input.nextInt();
            sum2+=arr[i];
        }
        System.out.println("Average: "+sum2/5);
}
