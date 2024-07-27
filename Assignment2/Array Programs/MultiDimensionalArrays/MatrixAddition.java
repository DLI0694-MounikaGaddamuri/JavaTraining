import java.util.*;
public class MatrixAddition{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array6 = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                array6[i][j]=input.nextInt();
            }
        }
        int[][] array7 = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                array7[i][j]=input.nextInt();
            }
        }
        int[][] sumArray = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                sumArray[i][j]=array6[i][j]+array7[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(sumArray[i][j]+" ");
            }
            System.out.println();
        }
  }
}
