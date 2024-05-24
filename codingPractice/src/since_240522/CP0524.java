package since_240522;

import java.util.*;
import java.util.stream.IntStream;

public class CP0524 {
    public static void main(String[] args) {
        CP0524 sol = new CP0524();
        String str = "abcdefpython";
        String instr = "-1-123456";
        System.out.println(sol.solutionPY(str));
        System.out.println(sol.solutionStrint(instr));
        System.out.println(sol.solutionSumDivisor(524));

    }

//대문자와 소문자가 섞여있는 문자열 s가 주어집니다.
// s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return
// 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
// 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
//예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
    boolean solutionPY(String s) {
        int cnt=0;
        s = s.toUpperCase();
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'P'){
                cnt++;
            } else if(s.charAt(i) == 'Y') {
                cnt--;
            }
        }
        return cnt == 0;
//        s = s.toUpperCase();
//
//        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
    }


    // String 타입의 숫자 -> int 변환
    public int solutionStrint(String s) {
        int answer = 0;
//        answer = Integer.parseInt(s);
//        return answer;
        boolean isNegative = s.charAt(0) == '-';
        int startIndex = isNegative ? 1 : 0;

        for (int i = startIndex; i < s.length(); i++) {
            answer = answer * 10 + (s.charAt(i) - '0');
        }

        return isNegative ? -answer : answer;
    }

    // 약수의 sum
    public int solutionSumDivisor(int n) {
        int answer = 0;
//        for (int i = 1; i <= n; i++){
//            if(n%i==0) answer+=i;
//        }
//        return answer;

//        return IntStream
//                .rangeClosed(1, n)
//                .parallel()
//                .filter(i -> n % i == 0)
//                .sum();

        for(int i = 1 ; i <= n / 2; i++){
            if(n % i == 0){
                answer += i ;
            }
        }
        return answer+n;
    }

}
