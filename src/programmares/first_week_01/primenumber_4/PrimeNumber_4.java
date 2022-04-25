package programmares.primenumber_4;

import java.util.HashMap;
import java.util.Map;

/**
주어진 숫자 중 3개의 수를 더했을 때 소수가 되는 경우의 개수를 구하려고 합니다.
숫자들이 들어있는 배열 nums가 매개변수로 주어질 때, nums에 있는 숫자들 중 서로 다른 3개를 골라 더했을 때
소수가 되는 경우의 개수를 return 하도록 solution 함수를 완성해주세요.

제한사항
- nums에 들어있는 숫자의 개수는 3개 이상 50개 이하입니다.
- nums의 각 원소는 1 이상 1,000 이하의 자연수이며, 중복된 숫자가 들어있지 않습니다.

*/

class PrimeNumber_4 {

    public static void main(String[] args) throws Exception {
        PrimeNumber_4 T = new PrimeNumber_4();

        int[] nums1 = {1,2,3,4};
        int[] nums2 = {1,2,7,6,4};

        Map<Integer, int[]> answer = new HashMap<>();
        answer.put(0, nums1);
        answer.put(1, nums2);

        int check = 0;
        for(int i = 0; i < answer.size(); i++) {
            check = T.solution(answer.get(i));
            System.out.println("answer " + i + " = " + check);
        }

    }

    public int solution(int[] nums) {
        int answer = 0;
        int temp = 0; // 합용 임시 변수

        // 1. 모든 경우의 수 따지기
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j< nums.length; j++) {
                for (int k = j+1; k<nums.length; k++) {
                    temp = nums[i] + nums[j] + nums[k];
                    if (checkPrime(temp)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    private boolean checkPrime(int chkNum) {
        for(int i = 2; i <= Math.sqrt(chkNum); i++) {
            if (chkNum % i == 0) {
                return false;
            }
        }

        return true;
    }
}

