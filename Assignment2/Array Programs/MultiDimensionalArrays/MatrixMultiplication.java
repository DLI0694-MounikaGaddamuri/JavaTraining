import java.util.*;
public class MatrixMultiplication{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array8 = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                array8[i][j]=input.nextInt();
            }
        }
        int[][] array9 = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                array9[i][j]=input.nextInt();
            }
        }
        int[][] multiplicationArray = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                multiplicationArray[i][j]=0;
                for(int k1=0;k1<3;k1++){
                        multiplicationArray[i][j] += array8[i][k1] * array9[k1][j];
                }
            }
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(multiplicationArray[i][j]+" ");
            }
            System.out.println();
        }
  }
}
