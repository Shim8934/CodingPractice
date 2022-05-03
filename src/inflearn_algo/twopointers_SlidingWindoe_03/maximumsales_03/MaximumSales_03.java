package inflearn_algo.twopointers_SlidingWindoe_03.maximumsales_03;

import java.util.ArrayList;
import java.util.Arrays;

/**
 현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
 만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면

 12 15 11 20 25 10 20 19 13 15
 연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
 여러분이 현수를 도와주세요.

 첫 줄에 N(5<=N<=100,000)과 K(2<=K<=N)가 주어집니다.
 두 번째 줄에 N개의 숫자열이 주어집니다. 각 숫자는 500이하의 음이 아닌 정수입니다.

 첫 줄에 최대 매출액을 출력합니다.

10 3
12 15 11 20 25 10 20 19 13 15


 */
public class MaximumSales_03 {

    public static void main(String[] args) {
        System.out.println("MaximumSales_03 start");

        MaximumSales_03 T = new MaximumSales_03();

        int day = 10;
        int n = 3;

        int[] sales = {12, 15, 11, 20, 25, 10, 20, 19, 13, 15};

        System.out.println(T.solution(day, n, sales));
    }

    public int solution(int day,int N, int[] sales) {
        int answer = 0;
        int sum = 0;

        for (int i = 0 ; i < N; i++) {
            sum += sales[i];
        }

        answer = sum;

        for (int i = N; i < day; i++) {
            sum += (sales[i] - sales[i - N]);
            if (sum > answer) {
                answer = sum;
            }
        }

        return answer;
    }
}
