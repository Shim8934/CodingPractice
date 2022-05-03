package inflearn_algo.twopointers_SlidingWindoe_03.commonelement_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.

 첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
 두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
 네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
 각 집합의 원소는 1,000,000,000이하의 자연수입니다.

 두 집합의 공통원소를 오름차순 정렬하여 출력합니다.

5
1 3 9 5 2
5
3 2 5 7 8

 */
public class CommonElement_02 {

    public static void main(String[] args) {
        System.out.println("SumTwoArrays_01 start");

        CommonElement_02 T = new CommonElement_02();

        int N = 5;
        int M = 5;

        int[] arr1 = {1, 3, 9, 5, 2};
        int[] arr2 = {3, 2, 5, 7, 8};

        System.out.println(T.solution(N, M, arr1, arr2).toString());

    }

    public ArrayList<Integer> solution(int N, int M, int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int p1 = 0, p2 = 0;

        while (p1 < N && p2 < M) {
            if (arr1[p1] < arr2[p2]) {
                p1++;
            }
            else if (arr1[p1] > arr2[p2]) {
                p2++;
            }
            else {
                answer.add(arr1[p1++]);
                p2++;
            }
        }

        return answer;
    }
}
