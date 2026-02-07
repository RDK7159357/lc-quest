package feb.stacks;
import java.util.*;
class Exclusive_time {
    public int[] exclusiveTime(int n, List<String> logs) {
        int res[] = new int[n];
        Deque<Integer> stk = new ArrayDeque<>();
        int prevtime = 0;
        for(String log : logs){
            String parts[] = log.split(":");
            int id = Integer.parseInt(parts[0]);
            String type = parts[1];
            int timestamp = Integer.parseInt(parts[2]);

            if(type.equals("start")){
                if(!stk.isEmpty()){
                    res[stk.peek()] += timestamp - prevtime;
                }
                stk.push(id);
                prevtime = timestamp;
            }
            else{
                res[stk.pop()] += timestamp - prevtime +1;
                prevtime = timestamp+1; 
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Exclusive_time obj = new Exclusive_time();
        System.out.println(Arrays.toString(obj.exclusiveTime(2, Arrays.asList("0:start:0","1:start:2","1:end:5","0:end:6"))));
    }
}
