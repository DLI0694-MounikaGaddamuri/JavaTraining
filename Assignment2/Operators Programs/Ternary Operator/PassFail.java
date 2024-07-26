import java.util.*;
public class PassFail{
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student marks: ");
        int marks=input.nextInt();
        System.out.println(marks > 28 ? "Pass" : "Fail");
  }
}
