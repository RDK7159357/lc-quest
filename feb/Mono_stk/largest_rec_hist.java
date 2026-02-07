package feb.Mono_stk;
import java.util.*;
class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stk = new ArrayDeque<>();
        int maxArea=0;
        int n = heights.length;
        for(int i=0;i<=n;i++){
            int currheight = (i==n) ? 0 : heights[i];
            while(!stk.isEmpty() && currheight<heights[stk.peek()]){
                int h = heights[stk.pop()];
                int w = stk.isEmpty() ? i : i-stk.peek()-1;
                maxArea = Math.max(maxArea,h*w);
            }
            stk.push(i);
        } 
        return maxArea;
    }
}