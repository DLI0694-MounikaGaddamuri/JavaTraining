import java.util.*;
public class MergeSortedArrays {

    public void mergeArrays(int[] array1,int[] array2,int array1Size,int array2Size){
        int length=array1Size+array2Size;
        int gap=(length/2)+(length%2);
        while(gap>0){
            //System.out.println(gap);
            int left=0;
            int right=left+gap;
            while(right<length){
                //array1 and array2
                if(left<array1Size && right>=array1Size)
                    swapIfGreater(array1,array2,left,right-array1Size);
                else if(left>=array1Size) //array2 and array2
                    swapIfGreater(array2,array2,left-array1Size,right-array1Size);
                else    //array1 and array1
                    swapIfGreater(array1,array1,left,right);

                left++;
                right++;
            }
            if(gap==1)
                break;
            gap=(gap/2)+(gap%2);
        }
    }

    public void swapIfGreater(int[] array1,int[] array2,int ind1,int ind2){
        if(array1[ind1]>array2[ind2]){
            int temp=array1[ind1];
            array1[ind1]=array2[ind2];
            array2[ind2]=temp;
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the first array: ");
        int array1Size = input.nextInt();
        int array1
                [] = new int[array1Size];
        System.out.println("Enter the first array elements: ");
        for(int i=0;i<array1Size;i++)
            array1[i]=input.nextInt();

        System.out.println("Enter the size of the second array: ");
        int array2Size = input.nextInt();
        int array2[] = new int[array2Size];
        System.out.println("Enter the second array elements: ");
        for(int i=0;i<array2Size;i++)
            array2[i]=input.nextInt();

        MergeSortedArrays m = new MergeSortedArrays();
        m.mergeArrays(array1,array2,array1Size,array2Size);

        for(int i=0;i<array1Size;i++)
            System.out.print(array1[i]+" ");
        for(int i=0;i<array2Size;i++)
            System.out.print(array2[i]+" ");
    }
}
