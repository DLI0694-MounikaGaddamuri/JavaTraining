import java.util.*;
public class SumAndAverage{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arraySize1 = input.nextInt();
        int array1[] = new int[arraySize1];
        int sum3=0;
        System.out.println("Enter the array elements: ");
        for(int i=0;i<arraySize1;i++) {
            array1[i] = input.nextInt();
            sum3+=array1[i];
        }
        System.out.println("Average: "+sum3/arraySize1);
  }
}
