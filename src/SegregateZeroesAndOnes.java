import java.util.*;
public class SegregateZeroesAndOnes {

    public static void segregateZeroesAndOnes(int[] array){
        int countOfZeroes=0;
        for(int i=0;i< array.length;i++){
            if(array[i]==0)
                countOfZeroes++;
        }
        System.out.println(countOfZeroes);
        for(int i= countOfZeroes-1;i>=0;i--) {
            array[i] = 0;
            //System.out.println(i+"->"+array[i]);
        }
        for(int i= array.length-1;i>=countOfZeroes;i--) {
            array[i] = 1;
            //System.out.println(i+"->"+array[i]);
        }

        for(int i=0;i< array.length;i++)
            System.out.print(array[i]+" ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int array_size = input.nextInt();
        int[] array = new int[array_size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<array_size;i++)
            array[i]=input.nextInt();
        segregateZeroesAndOnes(array);

    }
}
