import java.util.*;
public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int array11Size = input.nextInt();
        int[] array11 = new int[array11Size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<array11Size;i++)
            array11[i]=input.nextInt();
        int firstMax=array11[0],secondMax=array11[0];
        for(int i=1;i<array11Size;i++){
            if(array11[i]> firstMax){
                secondMax=firstMax;
                firstMax=array11[i];
            }
            if(array11[i]>secondMax && array11[i]<firstMax)
                secondMax=array11[i];
        }
        System.out.println("Second largest Element is: "+secondMax);
    }
}
