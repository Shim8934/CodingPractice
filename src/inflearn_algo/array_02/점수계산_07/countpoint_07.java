package inflearn_algo.array_02.점수계산_07;

class countpoint_07 {

    public static void main(String[] args) throws Exception {
        countpoint_07 T = new countpoint_07();

        System.out.println("countpoint_07 Start");

        int n = 10;
        int[] nums = {1, 0, 1, 1, 1, 0, 0, 1, 1, 0};

        System.out.println(T.solution(n, nums));

    }

    public int solution(int n, int[] nums) {
        int answer = 0;
        int tmp = 0;

        for (int x : nums) {
            if (x == 1) {
                tmp++;
                answer += tmp;
            }
            else {
                tmp = 0;
            }
        }

        return answer;
    }

}