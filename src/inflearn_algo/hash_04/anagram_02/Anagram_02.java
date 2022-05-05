package inflearn_algo.hash_04.anagram_02;

import java.util.HashMap;

public class Anagram_02 {

    public static void main(String[] args) throws Exception {
        Anagram_02 T = new Anagram_02();

        String[] word1 = {"AbaAeCe","baeeACA"};
        String[] word2 = {"abaCC", "Caaab"};

        System.out.println(T.solution(word1));
        System.out.println(T.solution(word2));
    }

    public String solution(String[] word) {
        String answer = "YES";

        HashMap<Character, Integer> check = new HashMap<>();

        for (String s : word) {
            for (Character c : s.toCharArray()) {
                check.put(c, check.getOrDefault(c, 0) + 1);
            }
        }

        for (Character c : check.keySet()) {
            if (check.get(c) % 2 != 0) {
                return "NO";
            }
        }

        return answer;
    }
}
