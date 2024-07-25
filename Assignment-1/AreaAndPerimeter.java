import java.util.*;
public class AreaAndPerimeter{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Rectangle obj1 = new Rectangle(40,20);
        obj1.area();
        obj1.perimeter();
  }
}
class Rectangle{
    int length,width;
    Rectangle(int length, int width){
        this.length=length;
        this.width=width;
    }
    void perimeter(){
        System.out.println("Perimeter: "+(2*(length+width)));
    }

    void area(){
        System.out.println("Area: "+length*width);
    }
}
