public class AnagramStrings {

	public static void main(String[] args) {
		
		String first = "Somesh";
		String second = "Somesh";
		
		Map<Character, Integer> map = new HashMap<>();
		

		for(char ch1 : first.toCharArray())
		{
			if(map.containsKey(ch1))
			{
				map.put(ch1, map.get(ch1)+1);
			}
			else
			{
				map.put(ch1, 1);
			}
		}
		
		for(char ch2 : second.toCharArray())
		{
			if(map.containsKey(ch2))
			{
				map.put(ch2, map.get(ch2)-1);
				
				//IMP Logic
				if(map.get(ch2) ==0)
				{
					map.remove(ch2);
				}
			}
			else
			{
				map.put(ch2, 1);
			}
		}
		
		System.out.println(map.isEmpty() ? "Anagram" : "Not Anagram");

	}

}
