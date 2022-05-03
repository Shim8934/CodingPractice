package inflearn_algo.twopointers_SlidingWindoe_03.sumtwoarrays_01;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.

 첫 번째 줄에 첫 번째 배열의 크기 N(1<=N<=100)이 주어집니다.
 두 번째 줄에 N개의 배열 원소가 오름차순으로 주어집니다.
 세 번째 줄에 두 번째 배열의 크기 M(1<=M<=100)이 주어집니다.
 네 번째 줄에 M개의 배열 원소가 오름차순으로 주어집니다.
 각 리스트의 원소는 int형 변수의 크기를 넘지 않습니다.

 오름차순으로 정렬된 배열을 출력합니다.

3
1 3 5
5
2 3 6 7 9

 */
public class SumTwoArrays_01 {

    public static void main(String[] args) {
        System.out.println("SumTwoArrays_01 start");

        SumTwoArrays_01 T = new SumTwoArrays_01();

        int N = 3;
        int M = 5;

        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 3, 6, 7, 9};

        System.out.println(T.solution(N, M, arr1, arr2).toString());

    }

    public List solution(int N, int M, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList();

        int p1 = 0, p2 = 0;

        while (p1 < N && p2 < M) {
            if (arr1[p1] < arr2[p2]) {
                answer.add(arr1[p1++]); // arr1[p1] 값을 List에 추가한 다음 p1 = p1+1 연산이 증가됨.
            } else answer.add(arr2[p2++]);
        }

        while (p1 < N) {
            answer.add(arr1[p1++]);
        }
        while (p2 < M) {
            answer.add(arr2[p2++]);
        }
        return answer;
    }
}
