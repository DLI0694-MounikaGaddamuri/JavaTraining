import java.util.*;
public class ArrayRotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array size:");
        int num= input.nextInt();
        int[] array10= new int[num];
        for(int i=0;i<num;i++)
            array10[i]=input.nextInt();
        int count6=0;
        int n=input.nextInt();
        while(count6<n) {
            int rotatingElement = array10[0];
            for (int i = 0; i < array10.length -1; i++) {
                array10[i] = array10[i + 1];
            }
            array10[array10.length -1] = rotatingElement;
            count6++;

            for (int i = 0; i < array10.length; i++)
                System.out.print(array10[i]+" ");
            System.out.println();
            //System.out.println(count);
        }
    }
}
