import java.util.*;
public class ElementOccurrences{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int array4Size = input.nextInt();
        int[] array4 = new int[array4Size];
        System.out.println("Enter the array elements: ");
        for(int i=0;i<array4Size;i++)
            array4[i]=input.nextInt();
        System.out.println("Enter the target element: ");
        int target = input.nextInt();
        ArrayList<Integer> indices = new ArrayList<Integer>();
        for(int i=0;i<array4Size;i++){
            if(array4[i]==target)
                indices.add(i);
        }
        System.out.println("Element present in the indices: "+indices);
    }
}
