class RotateArrayPairof3 
{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        
        rotateArray(arr);
        
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
        
    }
    
    public static void rotateArray(int[] arr)
    {
        int n = arr.length;
       for(int i=0;i<n;i+=3)
		{
			if(i+2 < n)
			{
				int ele1 = arr[i];
				arr[i] = arr[i+2];
				arr[i+2] = ele1;
			}
		}
    }
}
