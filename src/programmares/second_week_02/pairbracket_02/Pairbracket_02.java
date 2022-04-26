package programmares.second_week_02.pairbracket_02;

import java.util.Stack;

/**
 https://programmers.co.kr/learn/courses/30/lessons/12909

 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 문자로 닫혀야 한다는 뜻입니다. 예를 들어

 "()()" 또는 "(())()" 는 올바른 괄호입니다.
 ")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다.
 '(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 문자열 s가 올바른 괄호이면 true를 return 하고, 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.

 제한 사항
 - 문자열 s의 길이 : 100,000 이하의 자연수
 - 문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다.
 */

class Pairbracket_02 {

    public static void main(String[] args) throws Exception {
        Pairbracket_02 T = new Pairbracket_02();

        System.out.println("Pairbracket_02 Start");

        String s1 = "()()";
        String s2 = "(())()";
        String s3 = ")()(";
        String s4 = "(()(";

        System.out.println(T.solution(s1));
        System.out.println(T.solution(s2));
        System.out.println(T.solution(s3));
        System.out.println(T.solution(s4));

    }

    public boolean solution(String s) {
        if (s.startsWith("(") && s.endsWith(")")) {
            return checkCount(s.split(""));
        }
        else {
            return false;
        }
    }

    private boolean checkCount(String[] sArr) {
        Stack<String> checkStack = new Stack<>();

        for (String s : sArr) {
            if (s.equals("(")) {
                checkStack.push(s);
            }
            else if (checkStack.empty()) {
                return false;
            }
            else {
                checkStack.pop();
            }
        }

        if (checkStack.empty()) {
            return true;
        }
        else {
            return false;
        }
    }

}