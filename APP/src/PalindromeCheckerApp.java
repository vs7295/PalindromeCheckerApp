import java.util.Deque;
import java.util.LinkedList;

public class DequeCompare {

    public static void main(String[] args) {

        String str = "madam";   // Input string
        Deque<Character> deque = new LinkedList<>();

        // Insert characters into deque
        for (char c : str.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        // Compare front and rear characters
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is Not a Palindrome");
        }
    }
}