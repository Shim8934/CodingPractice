package inflearn_algo.StackQueue_05.pairbracket_01;

import java.util.Stack;

public class PairBracket_01 {
    public static void main(String[] args) throws Exception {
        PairBracket_01 T = new PairBracket_01();

        String s = "(()(()))(()";

        System.out.println(T.solution(s));
    }

    public String solution(String bracket) {
        Stack<Character> checkStack = new Stack<>();

        for (char x : bracket.toCharArray()) {
            if (x == '(') {
                checkStack.push(x);
            }
            else {
                if (checkStack.isEmpty()) {
                    return "NO";
                }
                checkStack.pop();
            }
        }

        if (!checkStack.isEmpty()) {
            return "NO";
        }
        return "YES";
    }
}
