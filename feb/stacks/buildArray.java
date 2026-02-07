package feb.stacks;
import java.util.*;
class buildArray {
    public List<String> buildArray_with_stk_ops(int[] target, int n) {
        List<String> res = new ArrayList<>();

            int curr_target_pointer = 0;
        for(int i=1;i<=n;i++){
            res.add("Push");
            if(i==target[curr_target_pointer]){
                curr_target_pointer++;
            }
            else{
                res.add("Pop");
            }
            if(curr_target_pointer == target.length){
                break;
            }

        }
        return res;
    }
    public static void main(String[] args) {
        buildArray obj = new buildArray();
        System.out.println(obj.buildArray_with_stk_ops(new int[]{1,2},2));
    }
}
