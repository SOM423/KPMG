import java.util.* ;
import java.io.*; 
public class PalindromString {

	public static boolean checkPalindrome(String str) {
	
	    String abc = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		if(reverse(abc)) return true;


		return false;	
	 
	}

	public static boolean reverse(String str)
	{
		StringBuffer sb = new StringBuffer();

		for(int i=str.length()-1;i>=0;i--)
		{
			sb.append(str.charAt(i));
		}
		if(sb.toString().equals(str)) return true;
		return false;
	}
}
