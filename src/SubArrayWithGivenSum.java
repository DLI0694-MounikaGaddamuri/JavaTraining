import java.util.*;
public class SubArrayWithGivenSum {

    public static void subArray(int[] array,int target){
        ArrayList<Integer> list = new ArrayList<>();
        int k=0;
        for(int i=0;i<array.length;i++){
            list.clear();
            list.add(array[i]);
            int sum=array[i];
            if(sum==target) {
                k=1;
                System.out.println("Helo"+list);
            }else {
                for (int j = i + 1; j < array.length; j++) {
                    sum += array[j];
                    if (sum == target) {
                        list.add(array[j]);
                        k = 1;
                        System.out.println("equal"+list);
                        break;
                    }
                    else if (sum < target)
                        list.add(array[j]);
                    else {
                        sum = array[i];
                        break;
                    }
                }
            }
        }
       if(k==0) System.out.println("No sub array!");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int array_size = input.nextInt();
        int[] array = new int[array_size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<array_size;i++)
            array[i]=input.nextInt();
        System.out.println("Enter target element: ");
        int target=input.nextInt();
        subArray(array,target);
    }
}
