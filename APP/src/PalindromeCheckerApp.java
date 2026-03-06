import java.util.*;

public class QueueStackDemo {
    public static void main(String[] args) {

        String str = "HELLO";

        // Queue for FIFO
        Queue<Character> queue = new LinkedList<>();

        // Stack for LIFO
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            queue.add(ch);   // Enqueue
            stack.push(ch);  // Push
        }

        System.out.println("Queue (FIFO) Output:");
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " "); // Dequeue
        }

        System.out.println();

        System.out.println("Stack (LIFO) Output:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " "); // Pop
        }
    }
}