package since_240522;

import java.util.Arrays;
import java.util.stream.Stream;

// 프로그래머스 > 코딩테스트 연습 > 자릿수 더하기
public class Programmers_DigitsAdd {
    public static void main(String[] args) {
        Programmers_DigitsAdd sol = new Programmers_DigitsAdd();
        System.out.println(sol.solution(123));

    }



//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
//예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
    public int solution(int n) {
//        int sum = 0;
//        String number = Integer.toString(n);
//        for (int i = 0; i < number.length(); i++) {
//            sum += Character.getNumericValue(number.charAt(i));
//        }
//        // Character.getNumbericValue 메소드는 0~9까지의 숫자를 표현한문자 (로마자 포함)에
//        // 대해 0~9 값 반환, 그외 문자는 -1 반환하는 메소드
//        return sum;

//        return Stream.of(Integer.toString(n).split("")).mapToInt(Integer::parseInt).sum();

        int sum = 0;

        while (n > 0) {
            sum += n % 10;  // n의 마지막 자릿수를 더함
            n /= 10;        // n의 마지막 자릿수를 제거
        }
        return sum;
    }

}
