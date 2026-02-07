package feb.Mono_stk;
import java.util.*;
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int arr []= new int[temperatures.length];
        Deque<Integer> stk = new ArrayDeque<>();
        for(int i=0;i<temperatures.length;i++){
          while(!stk.isEmpty() && temperatures[i]>temperatures[stk.peek()]){
            
                int popped_ind = stk.pop();
                arr[popped_ind] = i-popped_ind;
            
          }
            stk.push(i);
        }
        return arr;
    }
}
