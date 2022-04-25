package programmares.hashardnumber_1;

/**
 https://programmers.co.kr/learn/courses/30/lessons/12947

양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.

제한사항
- x는 1 이상, 10000 이하인 정수입니다.

*/

class Hashard {

    public static void main(String[] args) throws Exception {
        Hashard T = new Hashard();

        System.out.println("Hashard Start");

        int[] nums = {10, 12, 11, 13};

        boolean answer;

        for(int n : nums) {
            answer = T.solution(n);
            System.out.println("answer = " + answer + " / number = " + n);
        }
    }

    public boolean solution(int x) {
        boolean answer = true;

        int total = 0; // 자리수 합치기용 변수
        int originNum = x;

        while (originNum > 0) {
            total += originNum % 10;
            originNum /= 10;
        }

        if (x % total != 0) {
            answer = false;
        }

        return answer;
    }

}