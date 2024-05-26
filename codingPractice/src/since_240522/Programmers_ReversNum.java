package since_240522;

import java.util.Arrays;
// 프로그래머스 > 코딩테스트 연습 > 자연수 뒤집어 배열로 만들기
public class Programmers_ReversNum {
    public static void main(String[] args) {

        Programmers_ReversNum sol = new Programmers_ReversNum();
        long n = 123456314223566L;
        System.out.println(Arrays.toString(sol.solution(n)));
    }
    // 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요.
    // 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
    public int[] solution(long n) {
//        int digit = 0;
//        long nn = n;
//        while(nn > 0){
//            nn /= 10;
//            digit++;
//        }
//
//        int[] answer = new int[digit];
//        for (int i = 0; i < digit; i++){
//            answer[i] = (int) (n % 10);
//            n /= 10;
//        }
//        return answer;
        return new StringBuilder().append(n).reverse()
                    .chars().map(Character::getNumericValue).toArray();
    }
}
