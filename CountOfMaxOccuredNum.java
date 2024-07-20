import java.util.*;
import java.util.stream.*;

class CountOfMaxOccuredNum {
    public static void main(String[] args) {
       
       int[] arr = {4,5,2,4,2,5,7,6,2,3,4,5,1,2,4,5,4,4};
       
       Map<Integer, Integer> occuranceCount = new HashMap<>();
       
       for (int i = 0; i < arr.length; i++) {
           occuranceCount.put(arr[i], occuranceCount.getOrDefault(arr[i], 0) + 1);
       }
       int max = 0;
       int num = 0;
       for (Map.Entry<Integer, Integer> mp : occuranceCount.entrySet()) {
           if(mp.getValue() > max)
           {
               max=mp.getValue();
               num = mp.getKey();
           }
           
       }
       
       System.out.println(num +" "+max);
    }
}
