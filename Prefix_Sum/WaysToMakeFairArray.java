package Prefix_Sum;

public class WaysToMakeFairArray {
       public int waysToMakeFair(int[] nums) {
        int totEven =0;
        int totOdd = 0;
        for(int i=0; i<nums.length; i++){
            if(i%2==0) totEven+=nums[i];
            else totOdd+=nums[i];
        }

        int leftEven=0, leftOdd=0, count=0;

        for(int i=0;i<nums.length;i++){
            int rightEven = totEven - leftEven - (i%2==0?nums[i]:0);
            int rightOdd = totOdd - leftOdd - (i%2==1?nums[i]:0);

            int newEvenSum = leftEven + rightOdd;
            int newOddSum = leftOdd + rightEven;
            if(newEvenSum==newOddSum) count++;

            if(i%2==0) leftEven+=nums[i];
            else leftOdd+=nums[i];
        }
        return count;
    }
}
