package Prefix_Sum;

import java.util.HashMap;

public class MakeSumDivisiblebyP {
    public int minSubarray(int[] nums, int p) {
        long sumVal=0;
        for(int a : nums) sumVal+=a;
        int target = (int)(sumVal%p);
        if(target==0) return 0;

        HashMap<Integer,Integer> mapVal = new HashMap<>();
        mapVal.put(0,-1);

        long pref = 0;
        int ans = nums.length;
        for(int i=0;i<nums.length;i++){
            pref += nums[i];
            int curr = (int)(pref%p);

            int need = (curr-target+p)%p;
            if(mapVal.containsKey(need)){
                ans = Math.min(ans,i-mapVal.get(need));
            }
            mapVal.put(curr,i);
        }
        return ans==nums.length ? -1 : ans;
    }
}
