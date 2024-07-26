import java.util.*;
public class ArrayReverse{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arraySize3 = input.nextInt();
        int array3[] = new int[arraySize3];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<arraySize3;i++)
            array3[i]=input.nextInt();
        int start=0,end=arraySize3-1;
        while(start<=end){
            int temp=array3[start];
            array3[start]=array3[end];
            array3[end]=temp;

            start++;
            end--;
        }
        for(int i=0;i<arraySize3;i++)
            System.out.println(array3[i]);
  }
}
