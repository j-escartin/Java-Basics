import java.util.Scanner;

/**
 * created by James Vincent Escartin on 4/26/23
 **/
public class BtsLevelOrderTransversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        Node root = null;

        while (t-- > 0){
            int data = scanner.nextInt();
            root = insert(root, data);
        }

        Solution.levelOrder(root);
    }

    public static Node insert(Node root,int data){
        if(root == null){
            return new Node(data);
        } else {
            Node currNode;
            if(data <= root.data){
                currNode = insert(root.left, data);
                root.left = currNode;
            } else {
                currNode = insert(root.right, data);
                root.right = currNode;
            }
            return root;
        }
    }
}
