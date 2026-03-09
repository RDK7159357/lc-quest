package Hash;

import java.util.HashMap;
import java.util.Map;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListWithRandomPointer {
     public Node copyRandomList(Node head) {

       if (head == null) return null;

        // Use a map to store (Original Node -> Copied Node)
        Map<Node, Node> map = new HashMap<>();

        // PASS 1: Create all nodes and put them in the map
        Node curr = head;
        while (curr != null) {
            map.put(curr, new Node(curr.val));
            curr = curr.next;
        }

        // PASS 2: Connect the next and random pointers
        curr = head;
        while (curr != null) {
            // map.get(curr) is the copy node
            // map.get(curr.next) is the copy of the next node
            map.get(curr).next = map.get(curr.next);
            map.get(curr).random = map.get(curr.random);
            curr = curr.next;
        }

        return map.get(head);
    }
}
