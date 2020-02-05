package Solutions.Easy.ValidParentheses;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String input) {
        HashMap<Character, Character> meh = new HashMap<Character, Character>();
        meh.put('(', ')');
        meh.put('{', '}');
        meh.put('[', ']');
        // assuming that the input only contains parentheses
        if (input.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<Character>();
        for (Character each: input.toCharArray()) {
            if (meh.containsKey(each)) {
                stack.push(each);
            } else {
                // stack.isEmpty() must be validated first!!
                // peek() with empty stack will cause a crash
                if (stack.isEmpty() || !each.equals(meh.get(stack.peek()))) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
