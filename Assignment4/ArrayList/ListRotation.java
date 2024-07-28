import java.util.*;
public class ListRotation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Enter number of times to rotate the list: ");
        int n = input.nextInt();
        int count = 0;
        while (count < n) {
            int rotatingElement = list.getLast();
            for (int i = list.size() - 1; i > 0; i--)
                list.set(i, list.get(i - 1));
            //System.out.println(list);
            list.set(0, rotatingElement);
            count++;
        }
        System.out.println(list);
    }
}
