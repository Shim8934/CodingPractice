package inflearn_algo.hash_04.peerleader_01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
 학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
 투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
 선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
 반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.

 첫 줄에는 반 학생수 N(5<=N<=50)이 주어집니다.
 두 번째 줄에 N개의 투표용지에 쓰여져 있던 각 후보의 기호가 선생님이 발표한 순서대로 문자열로 입력됩니다.

 학급 회장으로 선택된 기호를 출력합니다.

 15
 BACBACCACCBDEDE

 */
public class PeerLeader_01 {

    public static void main(String[] args) throws Exception {
        PeerLeader_01 T = new PeerLeader_01();

        int num = 15;
        String vote = "BACBACCACCBDEDE";
        Scanner sc = new Scanner(System.in);

        System.out.println(T.solution(num, vote));
    }

    public String solution(int num, String vote) {
        String answer = "";

        HashMap<String, Integer> result = new HashMap<>();

        for (String s : vote.split("")) {
            result.put(s,result.getOrDefault(s,0)+1);
        }

        int chk = 0;
        Iterator<String> keys = result.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            if (result.get(key) > chk) {
                answer = key;
                chk = result.get(key);
            }
        }

        return answer;
    }
}
