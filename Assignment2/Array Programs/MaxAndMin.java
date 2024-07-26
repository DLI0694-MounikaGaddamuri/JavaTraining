import java.util.*;
public class MaxAndMin{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
        int arraySize2 = input.nextInt();
        int array2[] = new int[arraySize2];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<arraySize2;i++)
            array2[i]=input.nextInt();
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<arraySize2;i++){
            if(array2[i]<min)   min=array2[i];
            if(array2[i]>max)   max=array2[i];
        }
        System.out.println("Minimum number: "+min);
        System.out.println("Maximum number: "+max);
  }
}
