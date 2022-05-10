package inflearn_algo.StackQueue_05.쇠막대기_05;

import java.util.Stack;

public class SteelStick_05 {
    public static void main(String[] args) throws Exception {
        SteelStick_05 T = new SteelStick_05();

        String input1 = "()(((()())(())()))(())";
        String input2 = "(((()(()()))(())()))(()())";

        System.out.println(T.solution(input1));
        System.out.println(T.solution(input2));

    }

    public int solution(String input) {
        int answer = 0;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push('(');
            }
            else {
                stack.pop();
                if (input.charAt(i-1) == '(') {
                    answer += stack.size();
                }
                else {
                    answer++;
                }
            }
        }

        return answer;
    }
}
