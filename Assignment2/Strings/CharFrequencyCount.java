import java.util.*;
import java.lang.String;
public class CharFrequencyCount{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String characterCount = input.nextLine();
        char[] charCountArray = characterCount.toCharArray();
        int[] frequency = new int[charCountArray.length];

        for (int i=0;i<characterCount.length();i++) {
            int count5 = 1;
            if (frequency[i] == 0) {
                for (int j = i + 1; j < characterCount.length(); j++) {
                    if (charCountArray[i] == charCountArray[j]) {
                        count5++;
                        frequency[j] = -1;
                    }
                }
                frequency[i] = count5;
            }
        }

        for(int i=0;i<frequency.length;i++) {
            if(frequency[i]!= -1)
                System.out.println(charCountArray[i] + " -> " + frequency[i]);
        }
    }
}
