import java.util.*;
public class FrequencyOfElements{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = input.nextInt();
        int [] arr1 = new int [n];
        for(int i=0;i<n;i++)
            arr1[i]=input.nextInt();
        int [] fr = new int [arr1.length];
        int visited = -1;
        for(int i = 0; i < arr1.length; i++){
            int count1 = 1;
            for(int j = i+1; j < arr1.length; j++){
                if(arr1[i] == arr1[j]){
                    count1++;
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited)
                fr[i] = count1;
        }
        for(int i = 0; i < fr.length; i++){
            if(fr[i] != visited)
                System.out.println(arr1[i] + "->" + fr[i]);
        }
  }
}
