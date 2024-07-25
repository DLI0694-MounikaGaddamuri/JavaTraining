import java.util.*;
import static java.lang.Math.random;
public class FlipCoin{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number of times to flip coin:");
        int n= input.nextInt();
        int tailCount=0,headCount=0;
        for(int i=0;i<n;i++){
            double value = random();
            //System.out.println(value);
            if(value<0.5)
                tailCount++;
            else
                headCount++;
        }

        System.out.println("Heads% :"+(int)(((float)headCount/n)*100));
        System.out.println("Tails% :"+(int)(((float)tailCount/n)*100));
  }
}
