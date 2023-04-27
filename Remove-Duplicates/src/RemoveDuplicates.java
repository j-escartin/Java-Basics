import java.util.Scanner;

/**
 * created by James Vincent Escartin on 4/27/23
 **/
public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Node head = null;
        Node tail = null;
        while (n-- >0){
            int data = scanner.nextInt();
            if(head == null){
                head = new Node(data);
                tail = head;
            } else {
                tail.next = new Node(data);
                tail = tail.next;
            }
        }
        scanner.close();
        head = removeDuplicates(head);
        printList(head);
    }

    public static Node removeDuplicates(Node head){
        if(head == null){
            return null;
        }
        Node current = head;
        while(current.next != null){
            if(current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void printList(Node head){
        while (head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
}
