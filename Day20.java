import java.util.Stack;

public class SortStackUsingRecursion {

    // Function to insert element in sorted order
    public static void sortedInsert(Stack<Integer> stack, int element) {
        // Base case: If stack is empty or element is greater than top
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }

        // Otherwise, pop top and recur
        int top = stack.pop();
        sortedInsert(stack, element);

        // Push the top back
        stack.push(top);
    }

    // Function to sort the stack
    public static void sortStack(Stack<Integer> stack) {
        // Base case: If stack is empty
        if (stack.isEmpty()) {
            return;
        }

        // Remove top element
        int top = stack.pop();

        // Recursively sort the remaining stack
        sortStack(stack);

        // Insert the popped element back in sorted order
        sortedInsert(stack, top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }
}
