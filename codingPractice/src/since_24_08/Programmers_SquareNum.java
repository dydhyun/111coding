package since_24_08;

import java.io.*;

// 프로그래머스 코딩테스트 연습 > 입문 > 제곱수 판별하기
public class Programmers_SquareNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        br.close();

        System.out.println(solution(n));


    }
//    public static int solution(int n){
//
//        if ((int)Math.sqrt(n) * (int)Math.sqrt(n) == n){
//            System.out.println("N:" + (int)Math.sqrt(n));
//            return 1;
//        }
//
//        System.out.println("N:" + (int)Math.sqrt(n));
//        return 2;
//    }
    public static int solution(int n) {
        int sqrt = (int) Math.sqrt(n);
        return (sqrt * sqrt == n) ? 1 : 2;
    }

}
// 어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
// 정수 n이 매개변수로 주어질 때,
// n이 제곱수라면 1을
// 아니라면 2를 return 하도록 solution 함수를 완성해주세요.