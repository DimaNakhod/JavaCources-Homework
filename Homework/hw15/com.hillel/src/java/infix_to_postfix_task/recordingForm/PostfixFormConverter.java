package infix_to_postfix_task.recordingForm;

import java.util.Stack;

public class PostfixFormConverter {

    private Stack<Character> stack;

    public String changeInfixToPostfix(String mathExpression) {
        StringBuilder result = new StringBuilder();
        stack = new Stack<>();
        for (int i = 0; i < mathExpression.length(); i++) {
            char expr = mathExpression.charAt(i);

            if (expr == ')') {
                char temp = stack.pop();
                while (temp != '(') {
                    result.append(temp);
                    temp = stack.pop();
                }
            } else if (expr == '(') {
                stack.push(expr);
            } else if (priority(expr) > 0) {
                while (!stack.isEmpty() && priority(expr) <= priority(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(expr);
            } else {
                result.append(expr);
            }
        }
        for (int i = 0; i <= stack.size(); i++) {
            result.append(stack.pop());
        }
        return result.toString();
    }

    private int priority(char value) {
        if (value == '+' || value == '-') {
            return 1;
        } else if (value == '*' || value == '/') {
            return 2;
        } else {
            return 0;
        }
    }

}
