import java.util.*;
public class PositiveNegative{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int arraySize5 = input.nextInt();
        int array5[] = new int[arraySize5];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<arraySize5;i++)
            array5[i] = input.nextInt();
        int negative[]= new int[arraySize5];
        int positive[]= new int[arraySize5];
        int e=0,o=0;
        for(int i=0;i<arraySize5;i++){
            if(array5[i]>0)
                positive[e++]=array5[i];
            else
                negative[o++]=array5[i];
        }
        System.out.println("Even: ");
        for(int i=0;i<negative.length;i++){
            if(positive[i]!=0)
                System.out.print(positive[i]+" ");
        }
        
        System.out.println();
        System.out.println("Odd: ");
        for(int i=0;i<positive.length;i++){
             if(negative[i]!=0)
                System.out.print(negative[i]+" ");
        }

  }
}
