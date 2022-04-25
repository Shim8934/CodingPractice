package programmares.wordchain_5;

import java.util.*;

public class WordChain_5 {
    public static void main(String[] args) throws Exception {
        WordChain_5 T = new WordChain_5();

        int num1 = 3; int num2 = 5; int num3 = 2;

        String[] words1 = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        String[] words2 = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        String[] words3 = {"hello", "one", "even", "never", "now", "world", "draw"};

        List<Integer> nums = new LinkedList<>();
        nums.add(num1); nums.add(num2); nums.add(num3);
        List<String[]> words = new LinkedList<>();
        words.add(words1); words.add(words2); words.add(words3);


        for(int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(T.solution(nums.get(i),words.get(i))));
        }

    }

    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        List<String> check = new ArrayList<>();

        check.add(words[0]);
        for (int i = 1; i< words.length; i++) {
            if (check.contains(words[i])) {
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                break;
            }

            check.add(words[i]);

            if (i != 0 && words[i].charAt(0) != words[i-1].charAt(words[i-1].length() - 1)) {
                answer[0] = (i%n) + 1;
                answer[1] = (i/n) + 1;
                return answer;
            }

        }

        return answer;
    }
}
