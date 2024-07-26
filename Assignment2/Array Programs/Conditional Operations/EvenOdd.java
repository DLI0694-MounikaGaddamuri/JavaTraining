import java.util.*;
public class EvenOdd{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arraySize4 = input.nextInt();
        int array4[] = new int[arraySize4];
        int oddCount=0, evenCount=0;
        System.out.println("Enter the array elements: ");
        for(int i=0;i<arraySize4;i++) {
            array4[i] = input.nextInt();
            if(array4[i]%2==0)  evenCount++;
            else oddCount++;
        }
        System.out.println("Even Count: "+evenCount);
        System.out.println("Odd Count: "+oddCount);
  }
}
