public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
		int n = nums.length;
		int maxSum = Integer.MIN_VALUE;

       for(int i=0;i<n;i++)
	   {
		   int currSum = 0;

		   for(int j=i;j<n;j++)
		   {
			   currSum += nums[j];
			   if(currSum > maxSum)
			   {
				   maxSum = currSum;
			   }
		   }
	   }

	   return maxSum;

}}

OR ALTERNATE Solution 

public class Solution {
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int maxCurrent = nums[0];
        int maxGlobal = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }

        return maxGlobal;
    }
