package inflearn_algo.StackQueue_05.공주구하기_06;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class SavePrincess_06 {
    public static void main(String[] args) throws Exception {

        SavePrincess_06 T = new SavePrincess_06();

        int princes = 8;
        int num = 3;

        System.out.println(T.solution(princes, num));

    }

    public int solution(int princes, int num) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= princes; i++) {
            queue.offer(i);
        }

        while(!queue.isEmpty()) {
            for (int i = 1; i < num; i++) { // 숫자를 외치기 전의 왕자들은 빼면서 바로 새로 큐에 삽입.
                queue.offer(queue.poll());
            }

            queue.poll(); // 숫자에 해당되는 왕자의 번호는 빠지게 됨.

            if (queue.size() == 1) {
                answer = queue.poll();
            }
        }

        return answer;
    }
}
