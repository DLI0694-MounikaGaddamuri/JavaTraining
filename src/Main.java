import java.util.*;
import java.lang.String;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

                                                    //Logical Problems
//        //1.Fibonacci Series.
//        System.out.println("Enter number of terms: ");
//        int num1=input.nextInt();
//        if(num1==1) System.out.println("0");
//        else if(num1==2) System.out.println("0 1");
//        else {
//            int a = 0, b = 1;
//            System.out.print(a + " " + b + " ");
//            for (int i = 3; i <= num1; i++) {
//                int c = a + b;
//                System.out.print(c + " ");
//                a = b;
//                b = c;
//            }
//        }
//        System.out.println();
//
//        //2.Perfect NUmber
//        System.out.println("Enter a number: ");
//        int num2=input.nextInt();
//        int sum=1;
//        for(int i=2;i<=num2/2;i++){
//            if(num2%i==0)
//                sum+=i;
//        }
//        if(sum==num2) System.out.println("Perfect Number");
//        else System.out.println("Not a Perfect Number");
//
//        System.out.println();
//        //3.Prime Number
//        System.out.println("Enter a number:");
//        int num3=input.nextInt();
//        int count=0;
//        for(int i=2;i<=num3/2;i++){
//            if(num3%i==0)
//                count++;
//        }
//        if(count==0) System.out.println("Prime Number");
//        else System.out.println("Not a Prime Number");
//
//        System.out.println();
//        //4.Reverse a number
//        System.out.println("Enter a number:");
//        int num4= input.nextInt();
//        int sum1=0;
//        while(num4>0){
//            sum1=(sum1*10)+(num4%10);
//            num4/=10;
//        }
//        System.out.println("Reversed Number: "+sum1);
//
//        System.out.println();
//                                                    //Operators Program
//       // Arithmetic Operators
//        //1.Addition and Subtraction
//        System.out.println("Enter any two numbers: ");
//        int n1=input.nextInt();
//        int n2=input.nextInt();
//        System.out.println("Addition: "+(n1+n2));
//        System.out.println("Subtraction: "+(n1-n2));

//        System.out.println();
//        //2.Multiplication table
//        System.out.println("Enter a number for multiplication table: ");
//        int n3=input.nextInt();
//        for(int i=1;i<=12;i++)
//            System.out.println(n3+" * "+i+" = "+(n3*i));
//        System.out.println();


//        //3.Average Calculation:
//        System.out.println("Enter any five numbers: ");
//        int arr[] = new int[5];
//        int sum2=0;
//        for(int i=0;i<5;i++) {
//            arr[i] = input.nextInt();
//            sum2+=arr[i];
//        }
//        System.out.println("Average: "+sum2/5);
//
//        System.out.println();
//        //4.Circle Measurements:
//        System.out.println("Enter the radius of circle: ");
//        int radius = input.nextInt();
//        System.out.println("Area: "+(3.14*radius*radius));
//        System.out.println("Perimeter: "+(2*3.14*radius));
//
//        System.out.println();
//        //Relational Operators
//        //1.Max of Three Numbers:
//        System.out.println("Enter any three numbers:");
//        int n4=input.nextInt();
//        int n5=input.nextInt();
//        int n6=input.nextInt();
//        System.out.println("Maximum of three numbers: "+(n4>n5?(n4>n6?n4:n6):(n5>n6?n5:n6)));
//
//        System.out.println();
//        //2.Equality Check:
//        System.out.println("Enter two Strings: ");
//        String str1=input.nextLine();
//        String str2 = input.nextLine();
//        if(str1.equals(str2)) System.out.println("Both the strings are equal.");
//        else System.out.println("Strings are not equal");
//
//        System.out.println();
//        //Logical Operators
//        //1. Leap Year Check:
//        System.out.println("Enter year:");
//        int year=input.nextInt();
//        if((year%100==0 && year%400==0)||(year%100!=0 && year%4==0)) System.out.println("Leap Year");
//        else System.out.println("Not Leap Year");
//
//        System.out.println();
//        //2. Divisibility Check:
//        System.out.println("Enter a number: ");
//        int n7=input.nextInt();
//        if(n7%5==0 && n7%7==0) System.out.println(n7+ " is Divisible by both 5 and 7.");
//        else System.out.println(n7+ " is not Divisible by both 5 and 7.");
//
//        System.out.println();
//        //Assignment Operators
//        //1. Compound Assignment:
//        int dup=12;
//        dup+=2;
//        System.out.println("+= : "+dup);
//        dup-=2;
//        System.out.println("-= : "+dup);
//        dup*=2;
//        System.out.println("*= : "+dup);
//        dup/=2;
//        System.out.println("/= : "+dup);
//        dup%=2;
//        System.out.println("%= : "+dup);
//
//        System.out.println();
//        //Unary Operators
//        //1. Post-Increment and Pre-Increment:
//        int postAndPre=4;
//        System.out.println("Post Increment: "+postAndPre++);
//        System.out.println("Pre Increment: "+ ++postAndPre);
//
//        System.out.println();
//        //2. Toggle Boolean:
//        boolean b=true;
//        System.out.println(!b);
//
//        System.out.println();
//
//        //Bitwise Operators
//        //1. Bitwise AND, OR, XOR:
//        int bit1=input.nextInt();
//        int bit2=input.nextInt();
//        System.out.println("Bitwise AND: "+ (bit1 & bit2));
//        System.out.println("Bitwise OR: "+ (bit1 | bit2));
//        System.out.println("Bitwise XOR: "+ (bit1 ^ bit2));
//
//        System.out.println();
//
//        //2. Bitwise Shifts:
//        int bit3=input.nextInt();
//        System.out.println("Left Shift: "+ (bit3<<2));  //multiplication
//        System.out.println("Right Shift: "+ (bit3>>2)); //division
//
//        System.out.println();
//
//        //3. Odd or Even:
//        int n8=input.nextInt();
//        System.out.println( ((n8 & 1) != 1) ? "Even":"Odd");
//
//        System.out.println();
//
//        //Ternary Operator
//        //1. Min of Two Numbers:
//        System.out.println("Enter two numbers: ");
//        int n9 = input.nextInt();
//        int n10 = input.nextInt();
//        System.out.println("Minimum: "+(n9 < n10 ? n9 : n10));
//
//        System.out.println();
//
//        //2. Pass or Fail:
//        System.out.println("Enter student marks: ");
//        int marks=input.nextInt();
//        System.out.println(marks > 28 ? "Pass" : "Fail");
//
//        System.out.println();
//
//                                                    //Array Programs
//        //1. Array Initialization and Display:
//        System.out.println("Enter the size of the array: ");
//        int arraySize = input.nextInt();
//        int array[] = new int[arraySize];
//        System.out.println("Enter the array elements: ");
//        for(int i=0;i<arraySize;i++)
//            array[i]=input.nextInt();
//        for(int i=0;i<arraySize;i++)
//            System.out.println(array[i]);
//
//        System.out.println();
//
//        //2. Sum and Average of Array Elements:
//        System.out.println("Enter the size of the array: ");
//        int arraySize1 = input.nextInt();
//        int array1[] = new int[arraySize];
//        int sum3=0;
//        System.out.println("Enter the array elements: ");
//        for(int i=0;i<arraySize1;i++) {
//            array1[i] = input.nextInt();
//            sum3+=array1[i];
//        }
//        System.out.println("Average: "+sum/arraySize1);
//
//        System.out.println();
//
//        //3. Find Maximum and Minimum:
//        System.out.println("Enter the size of the array: ");
//        int arraySize2 = input.nextInt();
//        int array2[] = new int[arraySize2];
//        System.out.println("Enter the array elements: ");
//        for(int i=0;i<arraySize2;i++)
//            array2[i]=input.nextInt();
//        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
//        for(int i=0;i<arraySize2;i++){
//            if(array2[i]<min)   min=array2[i];
//            if(array2[i]>max)   max=array2[i];
//        }
//        System.out.println("Minimum number: "+min);
//        System.out.println("Maximum number: "+max);
//
//        System.out.println();
//
//        //4. Array Reversal:
//        System.out.println("Enter the size of the array: ");
//        int arraySize3 = input.nextInt();
//        int array3[] = new int[arraySize];
//        System.out.println("Enter the array elements: ");
//        for(int i=0;i<arraySize3;i++)
//            array3[i]=input.nextInt();
//        int start=0,end=arraySize3-1;
//        while(start<=end){
//            int temp=array3[start];
//            array3[start]=array3[end];
//            array3[end]=temp;
//
//            start++;
//            end--;
//        }
//        for(int i=0;i<arraySize3;i++)
//            System.out.println(array3[i]);
//
//        System.out.println();
//
//        //Conditional Operations:
//        //5. Count Even and Odd Numbers:
//        System.out.println("Enter the size of the array: ");
//        int arraySize4 = input.nextInt();
//        int array4[] = new int[arraySize4];
//        int oddCount=0, evenCount=0;
//        System.out.println("Enter the array elements: ");
//        for(int i=0;i<arraySize4;i++) {
//            array4[i] = input.nextInt();
//            if(array4[i]%2==0)  evenCount++;
//            else oddCount++;
//        }
//        System.out.println("Even Count: "+evenCount);
//        System.out.println("Odd Count: "+oddCount);
//
//        System.out.println();
//
//        //6. Separate Positive and Negative Numbers:

       // System.out.println();

        //Frequency of elements:
//        int [] arr1 = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};
//        int [] fr = new int [arr1.length];
//        int visited = -1;
//        for(int i = 0; i < arr1.length; i++){
//            int count1 = 1;
//            for(int j = i+1; j < arr1.length; j++){
//                if(arr1[i] == arr1[j]){
//                    count++;
//                    fr[j] = visited;
//                }
//            }
//            if(fr[i] != visited)
//                fr[i] = count1;
//        }
//        for(int i = 0; i < fr.length; i++){
//            if(fr[i] != visited)
//                System.out.println(arr1[i] + "->" + fr[i]);
//        }
//
//        System.out.println();
//
//        //Duplicates in the array.
//        int [] arr2 = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1,8};
//
//        int visited1 = -1,k=-1;
//        for(int i = 0; i < arr2.length; i++){
//            int count2 = 1;
//            for(int j = i+1; j < arr2.length; j++){
//                if(arr2[i] == arr2[j]){
//                    arr2[j]=k--;
//                    count2++;
//                }
//            }
//            if(count2>1 && arr2[i]>0){
//                System.out.println(arr2[i]);
//            }
//        }
//
//        System.out.println();
//        //Multi-dimensional Arrays
//        //9. Matrix Addition:
//        int[][] array6 = new int[3][3];
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                array6[i][j]=input.nextInt();
//            }
//        }
//        int[][] array7 = new int[3][3];
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                array7[i][j]=input.nextInt();
//            }
//        }
//        int[][] sumArray = new int[3][3];
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                sumArray[i][j]=array6[i][j]+array7[i][j];
//            }
//        }
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                System.out.print(sumArray[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//        //10. Matrix Multiplication:
//        int[][] array8 = new int[3][3];
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                array8[i][j]=input.nextInt();
//            }
//        }
//        int[][] array9 = new int[3][3];
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                array9[i][j]=input.nextInt();
//            }
//        }
//        int[][] multiplicationArray = new int[3][3];
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                multiplicationArray[i][j]=0;
//                for(int k1=0;k1<3;k1++){
//                        multiplicationArray[i][j] += array8[i][k1] * array9[k1][j];
//                }
//            }
//        }
//
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                System.out.print(multiplicationArray[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//
//                                                        //String Programs
//        //11.Palindrome Check:
//        System.out.println("enter a string: ");
//        String s1 = input.nextLine();
//        String dup1="";
//        for(int i=s1.length()-1;i>=0;i--)
//            dup1+=s1.charAt(i);
//        if(s1.equals(dup1)) System.out.println("Palindrome");
//        else System.out.println("Not Palindrome");
//
//        System.out.println();
//
//        //Anagram
//        System.out.println("Enter two Strings: ");
//        String string1 = input.nextLine();
//        String string2= input.nextLine();
//
//        string1.replaceAll("\\s","");
//        string2.replaceAll("\\s","");
//
//       if(string1.length() != string2.length())     System.out.println("Not Anagram");
//       else{
//           char[] string1Array = string1.toLowerCase().toCharArray();
//           char[] string2Array = string2.toLowerCase().toCharArray();
//
//           Arrays.sort(string1Array);
//           Arrays.sort(string2Array);
//
//           if(Arrays.equals(string1Array,string2Array)) System.out.println("Anagram.");
//           else System.out.println("Not Anagram");
//       }
//
//        System.out.println();
//
//        //Character Frequency Count:
//        System.out.println("Enter a string: ");
//        String characterCount = input.nextLine();
//        char[] charCountArray = characterCount.toCharArray();
//        int[] frequency = new int[charCountArray.length];
//
//        for (int i=0;i<characterCount.length();i++) {
//            int count5 = 1;
//            if (frequency[i] == 0) {
//                for (int j = i + 1; j < characterCount.length(); j++) {
//                    if (charCountArray[i] == charCountArray[j]) {
//                        count5++;
//                        frequency[j] = -1;
//                    }
//                }
//                frequency[i] = count5;
//            }
//        }
//
//        for(int i=0;i<frequency.length;i++) {
//            if(frequency[i]!= -1)
//                System.out.println(charCountArray[i] + " -> " + frequency[i]);
//        }
//
//        System.out.println();
//
//        //array rotation.
//        int[] array10={7,2,6,1,0,4};
//        int count6=0;
//        int n=input.nextInt();
//        while(count6<n) {
//            int rotatingElement = array10[0];
//            for (int i = 0; i < array10.length -1; i++) {
//                array10[i] = array10[i + 1];
//            }
//            array10[array10.length -1] = rotatingElement;
//            count6++;
//
//            for (int i = 0; i < 6; i++)
//                System.out.print(array10[i]+" ");
//            System.out.println();
//            //System.out.println(count);
//        }
//
//        System.out.println();

        //2. Array Merging:
//        System.out.println("Enter the first array size: ");
//        int array14Size = input.nextInt();
//        int[] array14= new int[array14Size];
//        System.out.println("Enter the first array elements: ");
//        for(int i=0;i<array14Size;i++)
//            array14[i]=input.nextInt();
//
//        System.out.println("Enter the second array size: ");
//        int array15Size = input.nextInt();
//        int[] array15 = new int[array15Size];
//        System.out.println("Enter the second array elements: ");
//        for(int i=0;i<array15Size;i++)
//            array15[i]=input.nextInt();

//        int[] mergedArray = new int[array14Size+array15Size];
//        int k=0;
//        for(int i=0;i<array14Size;i++){
//            for(int j=0;j<array15Size;j++){
//                mergedArray[k++]=(array14[i]<array15[j]? array14[i]: array15[j]);
//            }
//        }
//        for(int i=0;i<mergedArray.length;i++)
//            System.out.println(mergedArray[i]);

        //3. Intersection of Arrays:

        System.out.println("Enter the first array size: ");
        int array12Size = input.nextInt();
        int[] array12 = new int[array12Size];
        System.out.println("Enter the first array elements: ");
        for(int i=0;i<array12Size;i++)
            array12[i]=input.nextInt();

        input.nextLine();
        System.out.println("Enter the second array size: ");
        int array13Size = input.nextInt();
        int[] array13 = new int[array13Size];
        System.out.println("Enter the second array elements: ");
        for(int i=0;i<array13Size;i++)
            array13[i]=input.nextInt();

        for(int i=0;i<array12Size;i++){
            for(int j=0;j<array13Size;j++)
            if(array12[i]==array13[j])
                System.out.println(array12[i]);
        }

        //System.out.println();
        //4. Second-Largest Element:
//        System.out.println("Enter the array size: ");
//        int array11Size = input.nextInt();
//        int[] array11 = new int[array11Size];
//        System.out.println("Enter the array elements: ");
//        for(int i=0;i<array11Size;i++)
//            array11[i]=input.nextInt();
//        int firstMax=array11[0],secondMax=array11[0];
//        for(int i=1;i<array11Size;i++){
//            if(array11[i]> firstMax){
//                secondMax=firstMax;
//                firstMax=array11[i];
//            }
//            if(array11[i]>secondMax && array11[i]<firstMax)
//                secondMax=array11[i];
//        }
//        System.out.println("Second largest Element is: "+secondMax);





    }
}