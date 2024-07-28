import java.util.*;
public class CountCharacterOccurrence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter string: ");
        String str1 = input.nextLine();
        char[] str1CharArray = str1.toCharArray();
        int[] count = new int[str1.length()];
        for(int i=0; i<str1CharArray.length; i++){
            int countOfCharacter=1;
            for(int j=i+1;j<str1CharArray.length; j++){
                if(str1CharArray[i]==str1CharArray[j]){
                    countOfCharacter++;
                    count[j]=-1;
                }
            }
            if(count[i]!=-1)
                count[i]=countOfCharacter;

        }

        System.out.println("Frequency of each character is: ");
        for(int i=0; i< str1CharArray.length; i++) {
            if(count[i]!=-1)
                System.out.println(str1CharArray[i] + " -> " + count[i]);
        }
    }
}
