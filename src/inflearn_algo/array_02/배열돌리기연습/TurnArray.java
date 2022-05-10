package inflearn_algo.array_02.배열돌리기연습;

public class TurnArray {
    public static void main(String[] args) {
        TurnArray T = new TurnArray();
        int[][] rc = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        String[] operations = {"ShiftRow","Rotate"};
        for (int[] ar0 : T.solution(rc, operations)) {
            for (int s : ar0) {
                System.out.print(s + " ");
            }
            System.out.println();
        }

    }

    public int[][] solution(int[][] rc, String[] operations) {
        int m = rc.length;
        int n = rc[0].length;
        int[][] answer = new int[m][n];
        
        // 배열 할당
        for (int i = 0; i < rc.length; i++) {
            for (int j = 0; j < rc[i].length; j++) {
                answer[i][j] = rc[i][j];
            }
        }

        for(String s : operations) {
            if (s.equalsIgnoreCase("ShiftRow")) {
                for (int i = 0; i < rc.length; i++) {
                    for (int j = 0; j < rc[i].length; j++) {
                        if (i == (rc.length - 1)) {
                            answer[0][j] = rc[i][j];
                        }
                        else {
                            answer[i+1][j] = rc[i][j];
                        }
                    }
                }
                for (int i = 0; i < rc.length; i++) {
                    for (int j = 0; j < rc[i].length; j++) {
                        rc[i][j] = answer[i][j];
                    }
                }
            }
            else {
                int temp = answer[0][0];
                System.out.println("temp = " + temp);

                for (int j = 0; j < 2; j++) { // 좌
                    answer[j][0] = answer[j+1][0];
                }

                for (int j = 0; j < 2; j++) { // 하
                    answer[2][j] = answer[2][j+1];
                }

                for (int j = 2; j > 0; j--) { // 우
                    answer[j][2] = answer[j-1][2];
                }

                for (int j = 2; j > 0; j--) { // 상
                    answer[0][j] = answer[0][j-1];

                answer[0][1] = temp;
                }
            }
        }

        return answer;
    }
}
