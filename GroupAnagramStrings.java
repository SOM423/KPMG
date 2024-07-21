public class Anagarm {

	public static void main(String[] args) {
		
		String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> groups = groupAnagram(strs);
        System.out.println(groups);
		
			

	}
	
	//IMP Program to Practice
	public static List<List<String>> groupAnagram(String[] str)
	{
		Map<String, List<String>> map = new HashMap<>();
		
		for(String s : str)
		{
			char[] charray = s.toCharArray();

			Arrays.sort(charray); // Sort the character array
			
			String sortedString = new String(charray);
			
			if(!map.containsKey(sortedString))
			{
				map.put(sortedString, new ArrayList<>());
			}
			
			map.get(sortedString).add(s);
			
			
		}
		
		List<List<String>> result = new ArrayList<>(map.values());
		
		return result;
	}

}
