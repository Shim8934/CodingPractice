package inflearn_algo.StackQueue_05.교육과정설계_07;

import java.util.LinkedList;
import java.util.Queue;

public class DesignofEducationCurriculm_07 {

    public static void main(String[] args) throws Exception {
        DesignofEducationCurriculm_07 T = new DesignofEducationCurriculm_07();

        String s1 = "CBA";
        String s2 = "CBDAGE";

        System.out.println(T.solution(s1, s2));
    }

    public String solution(String must, String plan) {
        String answer = "YES";

        Queue<Character> queue = new LinkedList<>();

        for (char x : must.toCharArray()) {
            queue.offer(x);
        }

        for (char x : plan.toCharArray()) {
            if (queue.contains(x)) {
                if (x != queue.poll()) {
                    return "NO";
                }
            }
        }

        if (!queue.isEmpty()) {
            return "NO";
        }

        return answer;
    }

}
