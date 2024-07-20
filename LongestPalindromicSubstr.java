import java.util.HashSet;

public class LongestPalindromicSubstr {

	public static void main(String[] args) {
		
		String str="abcdeabc";
		
		int result = lengthOflongSub(str);
		
		System.out.println(result);
		
	}
	
	public static int lengthOflongSub(String str)
	{
		int n = str.length();
		int maxLength = 0;
		
		int i=0,j=0;
		
		HashSet<Character> set = new HashSet<>();
		
		while(i <n && j <n)
		{
			if(!set.contains(str.charAt(j)))
			{
						set.add(str.charAt(j));
				         j++;
						maxLength=Math.max(maxLength, j-i);
			}
			
			else
			{
				set.remove(str.charAt(i));
				i++;
			}
		}
		
		return maxLength;
	}
	
	
	

}
