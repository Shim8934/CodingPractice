package inflearn_algo.StackQueue_05.후위식연산_04;

import java.util.Stack;

public class Postfix_04 {

    public static void main(String[] args) throws Exception {
        Postfix_04 T = new Postfix_04();
        String input = "352+*9-";

        System.out.println(T.solution(input));
    }

    public int solution(String input) {
        int answer = 0;
        int tmp = 0, a = 0, b = 0;

        Stack<Integer> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                stack.push(Character.getNumericValue(c));
            }
            else {
                b = stack.pop();
                a = stack.pop();

                tmp = operatePostfix(a, b, c);
                stack.push(tmp);
            }
        }

        answer = stack.pop();

        return answer;
    }

    public int operatePostfix(int a, int b, char oper) {
        if (oper == '+') {
            return a + b;
        }
        else if (oper == '-') {
            return a - b;
        }
        else if (oper == '*') {
            return a * b;
        }
        else {
            return a / b;
        }
    }
}
