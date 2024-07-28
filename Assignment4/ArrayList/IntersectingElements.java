import java.util.*;
public class IntersectingElements{
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list2.add(3);
        list2.add(9);
        list2.add(6);
        list2.add(1);
        list2.add(2);

        for(int i=0; i<list1.size(); i++){
            for(int j=0; j<list2.size(); j++){
                if(list1.get(i)==list2.get(j)){
                    System.out.println(list1.get(i));
                    break;
                }
            }
        }
    }
}
