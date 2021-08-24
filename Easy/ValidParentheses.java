package Easy;

import java.util.Arrays;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        var op = isValid("){}");
        System.out.println(op);
    }

    static boolean isValid(String s) {
        var stack = new Stack<Character>();
        var left = Arrays.asList('[', '{', '(');
        var right = Arrays.asList(']', '}', ')');
        for (Character ch : s.toCharArray()) {
            if (left.contains(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character top = stack.peek();
                if (top == left.get(0) && ch == right.get(0) || top == left.get(1) && ch == right.get(1)
                        || top == left.get(2) && ch == right.get(2)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
