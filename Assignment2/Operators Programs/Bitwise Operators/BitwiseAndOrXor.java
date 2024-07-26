import java.util.*;
public class BitwiseAndOrXor{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bit1=input.nextInt();
        int bit2=input.nextInt();
        System.out.println("Bitwise AND: "+ (bit1 & bit2));
        System.out.println("Bitwise OR: "+ (bit1 | bit2));
        System.out.println("Bitwise XOR: "+ (bit1 ^ bit2));
  }
}
