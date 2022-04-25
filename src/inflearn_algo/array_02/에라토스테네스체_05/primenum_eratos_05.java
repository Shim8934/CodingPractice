package inflearn_algo.array_02.에라토스테네스체_05;

/**

 자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.

 만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.

 첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.

 첫 줄에 소수의 개수를 출력합니다.
*/

class primenum_eratos_05 {

    public static void main(String[] args) throws Exception {
        primenum_eratos_05 T = new primenum_eratos_05();

        System.out.println("primenum_eratos_05 Start");

        int[] nums = {20, 30, 40, 50};

        int answer = 0;

        for(int n : nums) {
            answer = T.solution(n);
            System.out.println("answer = " + answer + " / number = " + n);
        }
    }

    public int solution(int x) {
        int answer = 0;

        int[] ch = new int[x + 1];
        for (int i = 2; i <= x; i++) {
            if (ch[i] == 0) { // 자신의 배열 값 확인하는 로직
                answer++;
                for(int j = i; j <= x; j = j+i) { // 자신의 배수 배열 값을 모조리 1로 체크하는 로직
                    ch[j] = 1;
                }
            }
        }

        return answer;
    }

}