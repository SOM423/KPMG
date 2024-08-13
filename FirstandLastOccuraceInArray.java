class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = firstOccurace(nums,target);
        int last =  LastOccurance(nums,target);

        return new int[] {first,last};

    }

    public static int firstOccurace(int[] nums, int target)
    {
        int low = 0;
        int high = nums.length -1;
        int first = -1;

       while(low <= high)
       {
         int mid = low + (high - low)/2;

         if(nums[mid] == target)
         {
            first=mid;
            high = mid-1;
         }

        else if(nums[mid] > target)
         {
            high = mid-1;
         }
         else
         {
            low = mid+1;
         }
       }
       return first;

    }

    public static int LastOccurance(int[] nums, int target)
    {
        int low = 0;
        int high = nums.length -1;
        int Last = -1;

       while(low <= high)
       {
         int mid = low + (high - low)/2;

         if(nums[mid] == target)
         {
            Last=mid;
            low = mid+1;
         }

        else if(nums[mid] > target)
         {
            high = mid-1;
         }
         else
         {
            low = mid+1;
         }
       }
       return Last;

    }
}
