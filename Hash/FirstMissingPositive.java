package Hash;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositive {
     public int firstMissingPositive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        int j=1;
        while(j<=nums.length){
            if(!s.contains(j)){
                return j;
            }
            j++;
        }
        return j;
    }
}
