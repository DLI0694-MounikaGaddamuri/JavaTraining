import java.util.*;
public class IntersectionOfArrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first array size: ");
        int array12Size = input.nextInt();
        int[] array12 = new int[array12Size];
        System.out.println("Enter the first array elements: ");
        for(int i=0;i<array12Size;i++)
            array12[i]=input.nextInt();

        input.nextLine();
        System.out.println("Enter the second array size: ");
        int array13Size = input.nextInt();
        int[] array13 = new int[array13Size];
        System.out.println("Enter the second array elements: ");
        for(int i=0;i<array13Size;i++)
            array13[i]=input.nextInt();

        for(int i=0;i<array12Size;i++){
            for(int j=0;j<array13Size;j++)
            if(array12[i]==array13[j])
                System.out.println(array12[i]);
        }
    }
}
