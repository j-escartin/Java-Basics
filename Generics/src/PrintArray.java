import java.util.Scanner;

/**
 * created by James Vincent Escartin on 4/23/23
 **/
public class PrintArray {
    public static <T> void printArray(T[] array){

        for (T element : array){
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What type of array would you like to create? (Integer, String, or Character): ");
        String type = sc.next();

        switch (type){
            case "Integer":
                System.out.println("Enter the number of elements in the Integer Array: ");
                int n = sc.nextInt();
                Integer[] integerArray = new Integer[n];
                for(int i = 0; i< n; i ++){
                    System.out.println("Enter element #" + (i+1) + ": ");
                    integerArray[i] = sc.nextInt();
                }
                System.out.println("Integer Array: ");
                printArray(integerArray);
                break;
            case "String":
                System.out.println("Enter the number of elements in the String Array: ");
                int m = sc.nextInt();
                String[]  stringArray  = new String[m];
                for(int i = 0; i< m; i ++){
                    System.out.println("Enter element #" + (i+1) + ": ");
                    stringArray[i] = sc.next();
                }
                System.out.println("String Array: ");
                printArray(stringArray);
                break;
            case "Character":
                System.out.println("Enter the number of elements in the Character Array: ");
                int p = sc.nextInt();
                Character[] characterArray  = new Character[p];
                for(int i = 0; i< p; i ++){
                    System.out.println("Enter element #" + (i+1) + ": ");
                    String s = sc.next();
                    characterArray[i] = s.charAt(0);
                }
                System.out.println("Character Array: ");
                printArray(characterArray);
                break;
            default:
                System.out.println("Invalid type!");
                break;
        }
    }
}
