import java.util.LinkedList;
import java.util.Queue;

/**
 * created by James Vincent Escartin on 4/26/23
 **/
public class Solution {
    public static void levelOrder(Node root){
        if(root == null) return;

        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node currNode = queue.poll();
            System.out.print(currNode.data + " ");

            if(currNode.left != null) queue.add(currNode.left);

            if(currNode.right != null) queue.add(currNode.right);
        }
    }
}
