import java.util.Stack;

class p20 {

    public static boolean isValid(String s) {
        Stack<Character> list = new Stack<>();
        char[] ch = s.toCharArray();
        for (char c : ch) {
            if (c == '(' || c == '{' || c == '[') {
                list.push(c);
            } else {
                if(list.empty()) return false;
                if(c == ')' && list.peek()  == '(')
                    list.pop();
                else if (c == '}' && list.peek() == '{')
                    list.pop();
                else if (c == ']' && list.peek() == '[')
                    list.pop();
            }
        }
        return list.empty();
    }
}
