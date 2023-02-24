import java.util.*;

public class valid_Pranthesis {
    public static boolean paranthesis_Validation(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                s.push(str.charAt(i));

            } else {
                if (s.isEmpty()) {
                    return false;
                }

                else if (s.peek() == '(' && str.charAt(i) == ')') {
                    s.pop();
                } else if (s.peek() == '{' && str.charAt(i) == '}') {
                    s.pop();
                } else if (s.peek() == '[' && str.charAt(i) == ']') {
                    s.pop();
                } else {
                    s.push(str.charAt(i));
                }
            }
        }
        if (s.isEmpty()) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        String str = "{[()]}";
        System.out.println(paranthesis_Validation(str));
    }
}
