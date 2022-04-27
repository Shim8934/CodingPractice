package programmares.second_week_02.phoneNumber_05;

import java.util.Arrays;
import java.util.HashSet;

/**
 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
 전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

 구조대 : 119
 박준영 : 97 674 223
 지영석 : 11 9552 4421
 전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때,
 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.

 제한사항
 - phone_book의 길이는 1 이상 1,000,000 이하입니다.
    - 각 전화번호의 길이는 1 이상 20 이하입니다.
    - 같은 전화번호가 중복해서 들어있지 않습니다.
 */
public class PhoneNumber_05 {
    public static void main(String[] args) throws Exception {
        PhoneNumber_05 T = new PhoneNumber_05();

        System.out.println("PhoneNumber_05 Start");

        String[] phone_book1 = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123", "456", "789"};
        String[] phone_book3 = {"12", "123", "1235","567", "88"};


        System.out.println(T.solution(phone_book1));
        System.out.println(T.solution(phone_book2));
        System.out.println(T.solution(phone_book3));

    }

    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashSet<String> phNum = new HashSet<>(Arrays.asList(phone_book));

        for (String ph_number : phone_book) {
            for (String num : phNum) {
                if (ph_number.equals(num)== false && num.startsWith(ph_number)) {
                    return false;
                }
            }
        }

        return answer;
    }
}
