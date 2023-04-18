import java.util.*;

/**
 * created by James Vincent Escartin on 4/18/23
 **/
public class Palindrome {

    private Stack<Character> stack;
    private Queue<Character> queue;

    public Palindrome(){
        stack = new Stack<Character>();
        queue = new LinkedList<>();
    }

    public void pushCharacter(char ch){
        stack.push(ch);
    }

    public void enqueueCharacter(char ch){
        queue.add(ch);
    }

    public char popCharacter(){
        return stack.pop();
    }

    public char dequeueCharacter(){
        return queue.remove();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        Palindrome p = new Palindrome();

        //Enqueue and push each character
        for (int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            p.enqueueCharacter(ch);
            p.pushCharacter(ch);
        }

        //Compare
        boolean isPalindrome = true;
        for(int i= 0; i<s.length(); i++){
            char dequeue = p.dequeueCharacter();
            char popped = p.popCharacter();
            if(dequeue != popped){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println("The word, " + s + ", is a palindrome");
        } else {
            System.out.println(("The word, " + s + ", is not a palindrome"));
        }
    }
}
