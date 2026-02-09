package heap;

import java.util.*;
class kSmallestPairs {
    public List<List<Integer>> kSmallestPairs1(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int []> minHeap = new PriorityQueue<>((a,b)->a[0]-b[0]);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i<Math.min(nums1.length,k);i++){
            minHeap.offer(new int[]{nums1[i]+nums2[0],i,0});

        }

        while(k-->0 && !minHeap.isEmpty()){
            int curr[] = minHeap.poll();
            int x = curr[1];
            int y = curr[2];
            res.add(Arrays.asList(nums1[x],nums2[y]));

            if(y+1<nums2.length ){
                minHeap.offer(new int []{
                    nums1[x]+nums2[y+1],x,y+1
                });
            }


        }
        return res;
    }
}

