import java.util.*;
public class RemoveDuplicates{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        char ch;
        do{
            System.out.println("Enter element to add in the list");
            list.add(input.nextInt());
            System.out.println("Do you want to add more elements ?then enter y else n ");
            ch=input.next().charAt(0);
        }while(ch=='y');
        ArrayList<Integer> uniqueElements = new ArrayList<Integer>();
        for(int i: list){
            if(uniqueElements.contains(i))
                continue;
            uniqueElements.add(i);
        }
        System.out.println(uniqueElements);
    }
}
