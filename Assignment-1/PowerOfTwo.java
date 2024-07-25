import java.util.*;
public class PowerOfTwo{
  public static void main(String[] args) {
    int num = Integer.parseInt(args[0]);
		if(num>31 || num<0)
		{
			System.out.println("Enter the number in range of 0 - 31");
			System.exit(0);
		}


		for(int i=1; i<=num; i++)
		{
			System.out.println(Math.pow(2,i));
		}
  }
