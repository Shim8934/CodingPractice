package inflearn_algo.array_02.격자판최대합_09;

class maximumsum_09 {

    public static void main(String[] args) throws Exception {
        maximumsum_09 T = new maximumsum_09();

        System.out.println("maximumsum_09 Start");

        int n = 5;
        int[][] nums = {
                {10, 13, 10, 12, 15},
                {12, 39, 30, 23, 11},
                {11, 25, 50, 53, 15},
                {19, 27, 29, 37, 27},
                {19, 13, 30, 13, 19}

        };

        System.out.println(T.solution(n, nums));
    }

    public int solution(int n, int[][] nums) {
        int answer = 0;
        int tmp1, tmp2;

        for (int i = 0; i<n; i++) {
            tmp1 = tmp2 = 0;
            for (int j = 0; j<n; j++) {
                tmp1+=nums[i][j];
                tmp2+=nums[j][i];
            }
            answer = Math.max(answer, tmp1);
            answer = Math.max(answer, tmp2);
        }

        tmp1 = tmp2 = 0;
        for (int i = 0; i<n; i++) {
            tmp1 += nums[i][i];
            tmp2 += nums[i][n-i-1];
        }
        answer = Math.max(answer, tmp1);
        answer = Math.max(answer, tmp2);

        return answer;
    }

}