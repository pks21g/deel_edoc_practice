import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        boolean check = isValid("()");
        boolean check2 = isValid("()[]{}");
        boolean check3 = isValid("(]");
        boolean check4 = isValid("(){}}{");
        System.out.println(check);
        System.out.println(check2);
        System.out.println(check3);
        System.out.println(check4);
    }

    private static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (stack.isEmpty()) {
                return false;
            } else if (stack.peek() == '(' && ch == ')' ||
                    stack.peek() == '{' && ch == '}' ||
                    stack.peek() == '[' && ch == ']') {
                stack.pop();
            } else
                return false;
        }

        return stack.isEmpty();
    }

}
