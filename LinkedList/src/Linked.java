import java.util.Scanner;

/**
 * created by James Vincent C. Escartin on 4/12/23
 **/
public class Linked {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        Node head = null;
        while(t-- >0){
            int data = scanner.nextInt();
            head = insert(head, data);
        }
        printList(head);
        scanner.close();
    }

    public static Node insert(Node head, int data){
        if(head == null) {
            head = new Node();
            head.data = data;
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = new Node();
            current.next.data = data;
        }
        return head;
    }

    public static void printList(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}

class Node {
    int data;
    Node next;
}