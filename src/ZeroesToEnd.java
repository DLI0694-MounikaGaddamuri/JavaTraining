import java.util.*;
public class ZeroesToEnd {
    public static void zeroesToEnd(int[] array){
        int position=0;
        for(int i:array){
            if(i!=0)
                array[position++]=i;
        }
        while(position<array.length)
            array[position++]=0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int array_size = input.nextInt();
        int[] array = new int[array_size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<array_size;i++)
            array[i]=input.nextInt();
        zeroesToEnd(array);
        System.out.println(Arrays.toString(array));
    }
}
