import java.util.*;
public class DuplicateElements{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.println("Enter the size of array:");
        int n = input.nextInt();
        int [] arr2 = new int [n];
        for(int i=0;i<n;i++)
            arr2[i]=input.nextInt();
        int visited1 = -1,k=-1;
        for(int i = 0; i < arr2.length; i++){
            int count2 = 1;
            for(int j = i+1; j < arr2.length; j++){
                if(arr2[i] == arr2[j]){
                    arr2[j]=k--;
                    count2++;
                }
            }
            if(count2>1 && arr2[i]>0){
                System.out.println(arr2[i]);
            }
        }
  }
}
