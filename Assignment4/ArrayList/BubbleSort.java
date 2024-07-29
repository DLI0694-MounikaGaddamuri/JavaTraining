import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(12);
        list.add(2);
        list.add(34);
        list.add(4);
        list.add(58);

        for(int i=0;i<list.size();i++){
            for(int j=0 ; j<list.size()-i-1;j++){
                if(list.get(j)>list.get(j+1)){
                    int temp=list.get(j);
                    list.set(j,list.get(j+1));
                    list.set(j+1,temp);
                }
            }
        }
        System.out.println("After sorting the list: "+list);

    }
}
