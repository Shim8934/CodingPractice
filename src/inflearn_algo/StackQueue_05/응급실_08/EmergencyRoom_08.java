package inflearn_algo.StackQueue_05.응급실_08;

import java.util.LinkedList;
import java.util.Queue;

public class EmergencyRoom_08 {

    public static void main(String[] args) throws Exception {
        EmergencyRoom_08 T = new EmergencyRoom_08();

        int patiences = 5;
        int order = 2;

        int[] patiencesRisk = {60, 50, 70, 80, 90};

        System.out.println(T.solution(patiences, order, patiencesRisk));

    }

    public int solution(int patiences, int order, int[] patiencesRisk) {
        int answer = 0;

        Queue<Person> queue = new LinkedList<>();

        for(int i = 0; i < patiences; i++) {
            queue.add(new Person(i, patiencesRisk[i]));
        }

        while (!queue.isEmpty()) {
            Person tmp = queue.poll();
            for (Person p : queue) {
                if (p.priority > tmp.priority) {
                    queue.add(tmp);
                    tmp = null;
                    break;
                }
            }

            if (tmp != null) {
                answer++;
                if (tmp.id == order) {
                    return answer;
                }
            }
        }


        return answer;
    }

}

class Person {

    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}
