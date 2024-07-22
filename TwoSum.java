//Two sum (if array is sorted will use two pointers else MAP) :


public int[] twoSum(int[] arr,int target)
{
	Map<Integer,Integer> map = new HashMap<>();
	
	for(int i=0;i<n;i++)
	{
		int result = target - arr[i];
		
		if(map.containKey(result)
		{
			return new int[] {map.get(result),i};
		}
		
			map.put(arr[i],i);
	}
	 throw new IllegalArgumentException("No match found");
}

------------------------------------------------------------------
    public int[] twoSum(int[] nums, int target) {
       int start = 0;
       int end = nums.length-1;

       while(start < end)
       {
        if(nums[start]+nums[end] == target)
        {
            return new int[]{start+1,end+1};
        }
        else if(nums[start]+nums[end] > target)
        {
            end--;
        }
        else
        {
            start++;
        }
       }

       throw new IllegalArgumentException("No Match Found");
    }
	
