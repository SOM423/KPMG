import java.util.* ;
import java.io.*; 
public class FirstUniqueChar {
	public static char firstNonRepeating(String str) {

		HashMap<Character,Integer> map = new LinkedHashMap<>();
		
		for(int i=0;i<str.length();i++)
		{
		   if(map.containsKey(str.charAt(i)))
		   {
			   map.put(str.charAt(i), map.get(str.charAt(i))+1);
		   }
		   else
		   {
			   map.put(str.charAt(i), 1);
		   }	
		}

		for(Map.Entry<Character,Integer> mp : map.entrySet())
		{
			if(mp.getValue() == 1)
			return mp.getKey();
		}
		return '#';
	}
}
