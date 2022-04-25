package inflearn_algo.array_02.임시반장정하기_11;

import java.util.Arrays;

class tempcaptain_11 {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public static void main(String[] args) throws Exception {
        tempcaptain_11 T = new tempcaptain_11();

        System.out.println("tempcaptain_11 Start");

        int n = 5;
        int[][] nums = {
                {2, 3, 1, 7, 3},
                {4, 1, 9, 6, 8},
                {5, 5, 2, 4, 4},
                {6, 5, 2, 6, 7},
                {8, 4, 2, 2, 2},
        };

        System.out.println(T.solution(n, nums));
    }

    public int solution(int n, int[][] arr) {
        int answer = 0;
        int cnt, checker;

        for (int i = 0; i<n; i++) {
            cnt = 0;
            for (int j = 0; j<n; j++) {
                checker = arr[i][j];

            }
        }

        return answer;
    }

}