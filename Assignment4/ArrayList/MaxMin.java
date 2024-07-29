import java.util.*;
public class MaxMin{
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(12);
        list.add(2);
        list.add(34);
        list.add(4);
        list.add(58);

        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>max)
                max=list.get(i);
            if(list.get(i)<min)
                min=list.get(i);
        }

        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);

    }
}
