package inflearn_algo.hash_04.allofanagram_04;

import java.util.HashMap;

public class AllOfAnagram_04 {

    public static void main(String[] args) throws Exception {
        AllOfAnagram_04 T = new AllOfAnagram_04();

        String s = "bacaAacba";
        String t = "abc";

        System.out.println(T.solution(s, t));
    }

    public int solution(String s, String t) {
        int answer = 0;

        HashMap<Character, Integer> tempCheck = new HashMap<>();
        HashMap<Character, Integer> checkOrigin = new HashMap<>();

        for (char x : t.toCharArray()) {
            checkOrigin.put(x, checkOrigin.getOrDefault(x, 0) + 1);
        }

        int L = t.length() - 1;
        for (int i = 0; i < L; i++) {
            tempCheck.put(s.charAt(i), tempCheck.getOrDefault(s.charAt(i), 0) + 1);
        }

        int lt = 0;
        for (int rt = L; rt < s.length(); rt++) {
            tempCheck.put(s.charAt(rt), tempCheck.getOrDefault(s.charAt(rt), 0) + 1);

            if (tempCheck.equals(checkOrigin)) {
                answer++;
            }

            tempCheck.put(s.charAt(lt), tempCheck.get(s.charAt(lt)) - 1);
            if (tempCheck.get(s.charAt(lt)) == 0) {
                tempCheck.remove(s.charAt(lt));
            }
            lt++;
        }

        return answer;
    }
}
