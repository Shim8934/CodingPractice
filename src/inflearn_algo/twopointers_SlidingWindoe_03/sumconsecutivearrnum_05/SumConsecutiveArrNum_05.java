package inflearn_algo.twopointers_SlidingWindoe_03.sumconsecutivearrnum_05;

/**
 N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
 만약 N=15이면
 7+8=15
 4+5+6=15
 1+2+3+4+5=15

 와 같이 총 3가지의 경우가 존재한다.

 첫 번째 줄에 양의 정수 N(7<=N<1000)이 주어집니다.

 첫 줄에 총 경우수를 출력합니다.

 15
 */
public class SumConsecutiveArrNum_05 {

    public static void main(String[] args) throws Exception {

        System.out.println("SumConsecutiveArrNum_05 start");

        SumConsecutiveArrNum_05 T = new SumConsecutiveArrNum_05();

        int N = 15;

        System.out.println(T.solution(N));

    }

    private int solution(int N) {
        int answer = 0;
        int sum = 0;

        int lt = 1;
        for (int rt = 1; rt < N; rt++) {
            sum += rt;
            if (sum == N) {
                answer++;
            }
            while (sum >= N) {
                sum -= lt++;
                if (sum == N) {
                    answer++;
                }
            }
        }

        return answer;
    }
}
