import java.util.ArrayList;

public class RotateArrayByKele {
	public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.

        ArrayList<Integer> sol = new ArrayList<>();

        for(int i=k;i<arr.size();i++)
        {
            sol.add(arr.get(i));
        }

         for(int i=0;i<k;i++)
         {
             sol.add(arr.get(i));
         }

         return sol;
    }
}
