package inflearn_algo.array_02.등수구하기_08;

import java.util.ArrayList;

class graderanking_08 {

    public static void main(String[] args) throws Exception {
        graderanking_08 T = new graderanking_08();

        System.out.println("graderanking_08 Start");

        int n = 5;
        int[] nums = {87, 89, 92, 100, 76};

        for(int x : T.solution(n, nums)) {
            System.out.print(x + " ");
        }

    }

    public ArrayList<Integer> solution(int n, int[] points) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i<n; i++) {
            int tmp = 1;
            for(int j = 0; j<n; j++) {
                if (points[j] > points[i]) {
                    tmp++;
                }
            }
            answer.add(tmp);
        }
        return answer;
    }

}