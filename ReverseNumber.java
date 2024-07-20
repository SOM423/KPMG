import java.util.* ;
import java.io.*; 

public class Solution {
	public static long reverseNumber(long n) {
		// Write your code here
		long num = 0;
		while(n > 0)
		{
			long rem = n % 10;
			num = num *10 + rem;
			n= n/10;
		}
		return num;
	}

}
