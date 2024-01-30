import java.util.Stack;
public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element (without removal): " + stack.peek());
        System.out.println("Elements in the stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
