package heap;
import java.util.*;
class lastStoneWeight {
    public int lastStoneWeight1(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
   
        for(int i : stones){
            q.add(i);
        }

        while(q.size()>1){
            int y = q.poll();
            int x = q.poll();
            if(x!=y){
                q.add(y-x);
            }
        }
        return q.isEmpty() ? 0 : q.peek();
    }
}
