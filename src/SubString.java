
import java.util.*;
public class SubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int a= 0;
        int maxLength = 0;
        List<Character> list = new ArrayList<>();
        while (a < str.length()) {
            boolean isContained = list.contains(str.charAt(a));
            if (!isContained) {
                list.add(str.charAt(a));
                a++;
                maxLength = Math.max(maxLength, list.size());
            } else {
                list.remove(0);
            }
        }
        System.out.println(maxLength);
    }
}
