import java.util.Scanner;

/**
 * created by James Vincent Escartin on 4/25/23
 **/
public class Node {
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        left = right = null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Node root = null;
        for(int i =0; i<n; i++){
            int data = scanner.nextInt();
            root = insert(root, data);
        }

        int height = getheight(root);
        System.out.println(height);
    }

    public static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static int getheight(Node root){
        if (root == null){
            return -1;
        }
        return 1 + Math.max(getheight(root.left), getheight(root.right));
    }
}
