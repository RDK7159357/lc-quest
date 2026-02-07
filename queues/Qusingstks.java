package queues;
import java.util.*;

class Qusingstks {
        private Deque<Integer> stk1;
        private Deque<Integer> stk2;
    public Qusingstks() {
      stk1 = new ArrayDeque<>();
       stk2 = new ArrayDeque<>();

    }
    
    public void push(int x) {

        stk1.push(x);
    }
    
    public int pop() {
        if(stk2.isEmpty()){
    while(!stk1.isEmpty()){

        int temp = stk1.pop();
        stk2.push(temp);
    }
        }
        return stk2.pop();
    }
    
    public int peek() {
    if(stk2.isEmpty()){
        while(!stk1.isEmpty()){

            int temp = stk1.pop();
            stk2.push(temp);
                                }
        }
        return stk2.peek();
    }
    
    public boolean empty() {
        return stk1.isEmpty() && stk2.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
