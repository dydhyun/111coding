package since_240522;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 연습 > 하샤드 수
public class Programmers_HarshadNum {
    public static void main(String[] args) {
        Programmers_HarshadNum sol = new Programmers_HarshadNum();
        System.out.println(sol.solution(112));
    }

    // 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
    // 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
    // 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
    // 제한 조건
    // x는 1 이상, 10000 이하인 정수입니다.
    public boolean solution(int x) {
        int sum = 0;
        int input = x;
        while (x > 0){
            sum += x % 10;
            x /= 10;
        }
        return input % sum == 0;
//        sum = String.valueOf(x).chars().map(ch -> ch - '0').sum();
//        return x % sum == 0;
    }
}
