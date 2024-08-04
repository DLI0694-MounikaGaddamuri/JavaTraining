import java.util.*;
public class PairSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size");;
        int array_size=input.nextInt();
        int[] array=new int[array_size];
        System.out.println("Enter the array elements:");
        for(int i=0;i<array_size;i++)
            array[i]=input.nextInt();
        System.out.println("Enetr the target element: ");
        int target=input.nextInt();
        for(int i=0;i<array_size;i++){
            for(int j=i+1;j<array_size;j++){
                if(array[i]+array[j]==target)
                    System.out.println(array[i]+" "+array[j]);
            }
        }
    }
}
