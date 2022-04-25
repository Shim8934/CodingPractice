package programmares.nextlargenum_2;

/**
 https://programmers.co.kr/learn/courses/30/lessons/12911

 자연수 n이 주어졌을 때, n의 다음 큰 숫자는 다음과 같이 정의 합니다.

 조건 1. n의 다음 큰 숫자는 n보다 큰 자연수 입니다.
 조건 2. n의 다음 큰 숫자와 n은 2진수로 변환했을 때 1의 갯수가 같습니다.
 조건 3. n의 다음 큰 숫자는 조건 1, 2를 만족하는 수 중 가장 작은 수 입니다.
 예를 들어서 78(1001110)의 다음 큰 숫자는 83(1010011)입니다.

 자연수 n이 매개변수로 주어질 때, n의 다음 큰 숫자를 return 하는 solution 함수를 완성해주세요.

제한사항
- n은 1,000,000 이하의 자연수 입니다.

*/

class NextLargeNum_2 {

    public static void main(String[] args) throws Exception {
        NextLargeNum_2 T = new NextLargeNum_2();

        System.out.println("nextlargenum Start");

        int[] nums = {78, 15};

        int answer = 0;

        for(int n : nums) {
            answer = T.solution(n);
            System.out.println("answer = " + answer + " / number = " + n);
        }
    }

    public int solution(int n) {
        int answer = 0;

        /**
         여기서 질문, String 메소드와 직접 구하는 방식이랑 무슨 차이가 있을까?

         음... 나름대로 생각해 본 요소
         1. 연산 속도 면에서 직접 구하는 방식이 더 월등할 것이다.
         Why? -> 형변환 과정이 필요하다. 즉, 직접 구하는 방식에서는 필요 없던 별도의 연산 과정이 추가되기 때문이다.( Integer.parseInt() )
         */

        int origin_count = 0; // 원래 수의 이진법 1 카운트 변수
        int plus_count = 0; // 늘리는 수의 이진법 1 카운트 변수

        // * 이진법 수 변환 중 1만 카운팅하는 로직.
        origin_count = checkNum(n);

        while (origin_count != plus_count) {
            n++;
            plus_count = checkNum(n);
            answer = n;
        }

        return answer;
    }

    private int checkNum(int n) {
        int count = 0;
        while (n > 0) {
            if(n % 2 == 1) {
                count++;
            }
            n /= 2;
        }

        return count;
    }

}