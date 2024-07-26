import java.util.*;
public class CircleMeasurements{
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        int radius = input.nextInt();
        System.out.println("Area: "+(3.14*radius*radius));
        System.out.println("Perimeter: "+(2*3.14*radius));
   }
  
}
