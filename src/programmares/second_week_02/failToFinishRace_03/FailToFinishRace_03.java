package programmares.second_week_02.failToFinishRace_03;

import java.util.Arrays;
import java.util.HashMap;

/**
 https://programmers.co.kr/learn/courses/30/lessons/42584

 초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.

 제한 사항
 - prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
 - prices의 길이는 2 이상 100,000 이하입니다.
 */

class FailToFinishRace_03 {

    public static void main(String[] args) throws Exception {
        FailToFinishRace_03 T = new FailToFinishRace_03();

        System.out.println("FailToFinishRace_03 Start");

        String[] participant1 = {"leo", "kiki", "eden"};
        String[] participant2 = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] participant3 = {"mislav", "stanko", "mislav", "ana"};

        String[] completion1 = {"eden", "kiki"};
        String[] completion2 = {"josipa", "filipa", "marina", "nikola"};
        String[] completion3 = {"stanko", "ana", "mislav"};

        System.out.println(T.solution(participant1, completion1));
        System.out.println(T.solution(participant2, completion2));
        System.out.println(T.solution(participant3, completion3));

    }

    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> complete = new HashMap<>();

        for(String name : participant) {
            complete.put(name, complete.getOrDefault(name, 0) + 1);
        }
        for (String name : completion) {
            complete.put(name, complete.get(name) - 1);
        }

        for (String key : complete.keySet()) {
            if (complete.get(key) > 0) {
                answer = key;
                break;
            }
        }

        return answer;
    }

}