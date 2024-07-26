import java.util.*;
public class InitAndDisplay{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arraySize = input.nextInt();
        int array[] = new int[arraySize];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<arraySize;i++)
            array[i]=input.nextInt();
        for(int i=0;i<arraySize;i++)
            System.out.println(array[i]);
  }
}
