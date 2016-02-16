import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Akshara on 2/15/16.
 */
public class Trees {

    class Node {
        Node left, right;
        int data = 0;

        public Node(int value) {
            this.left = null;
            this.right = null;
            int data = value;
        }
    }

    //uses Stack
public boolean  depthFirstSearch(Node root, int key) {
    if(root == null) {
    return false;
    }

    Stack<Node> dfStack = new Stack<>();
    dfStack.push(root);

    while(!dfStack.isEmpty()) {
        Node current =  dfStack.pop();
        if(current.data == key) return true;

        if(current.left != null) dfStack.push(current.left );
        if(current.right != null) dfStack.push(current.right);
    }

    return false;
}


    //Queue
    public boolean breadthSearch(Node root, int key) {
        if(root == null) {
            return false;
        }

        Queue<Node> dfqueue = new LinkedList<>();
        dfqueue.offer(root);

        while(!dfqueue.isEmpty()) {
            Node current =  dfqueue.poll();
            if(current.data == key) return true;

            if(current.left != null) dfqueue.offer(current.left );
            if(current.right != null) dfqueue.offer(current.right);
        }

        return false;
    }
}
