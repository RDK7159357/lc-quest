package heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class ConstructTargetArraywithMultipleSums {
    public boolean isPossible(int[] target) {
       if(target.length==1) return target[0]==1;
       PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder()); //maxheap
       long totalsum=0;
       for(int i : target){

        pq.add((long) i);
        totalsum+=i;
       }
       while(pq.peek()>1){
        long max = pq.poll();
        long remainingsum = totalsum-max;
        if(remainingsum==1 ) return true;
        if(remainingsum>=max || remainingsum==0) return false;

        long prev = max % remainingsum;
        if(prev==0) return false;
        pq.add(prev);
        totalsum =remainingsum+prev;
       }
       return true;


    }

}
