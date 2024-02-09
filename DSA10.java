import java.util.Stack;
public class DSA10 {//INFIX TO POSTFIX
    static boolean checkIfOperand(char ch){
        return (ch>='a' && ch<='z')|| (ch>='a'&& ch<='z');
    }
    static int precedence(char ch){
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    static void convertInfixToPostfix(String expr) {
        int i, j;
        Stack<Character> s = new Stack<>();
        StringBuilder result = new StringBuilder(new String(""));
        for (i = 0, j = -1; i < expr.length(); ++i) {
            if (checkIfOperand(expr.charAt(i)))
                result.append(expr.charAt(i));
            else if (expr.charAt(i) == '(')
                s.push(expr.charAt(i));
            else if (expr.charAt(i) == ')') {
                while (!s.empty() && s.peek() != '(') {
                    result.append(s.peek());
                    s.pop();
                }
                if (!s.empty() && s.peek() != '(')
                    return;
                else {
                    while (!s.empty() && precedence(expr.charAt(i)) <= precedence(s.peek())) {
                        result.append(s.peek());
                        s.pop();
                    }
                    s.push(expr.charAt(i));
                }
            }
            while (!s.empty()) {
                result.append(s.peek());
                s.pop();
            }
            System.out.println(result);


        }
    }
        //driver code

    public static void main(String[] args) {
        String expression="a+b*(c^d-e)^(f+g*h)-i";
        convertInfixToPostfix(expression);
    }

    }

