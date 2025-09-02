import java.util.*;

public class PostfixEvaluation {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();
        String[] tokens = expression.split(" ");
        
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") || 
                token.equals("*") || token.equals("/")) {
                
                int b = stack.pop();  // right operand
                int a = stack.pop();  // left operand
                
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break; // integer division
                }
            } else {
                stack.push(Integer.parseInt(token)); // push number
            }
        }
        
        return stack.pop(); // final result
    }

    public static void main(String[] args) {
        String expression = "2 1 + 3 *";
        System.out.println(evaluatePostfix(expression)); // Output: 9
    }
}
