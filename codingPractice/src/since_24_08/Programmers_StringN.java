package since_24_08;

import java.io.*;

// 프로그래머스 코딩테스트 연습 > 코딩 기초 트레이닝 > 문자열 앞의 n 글자
public class Programmers_StringN {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String my_string = br.readLine();
        int n = Integer.parseInt(br.readLine());

        br.close();

//        bw.write(my_string.substring(0,n));
        bw.write(solution(my_string,n));
        bw.flush();
        bw.close();


    }

    public static String solution(String my_string, int n) {
        return my_string.substring(0,n);
    }

}
// 문자열 my_string 과 정수 n이 매개변수로 주어질 때,
// my_string 의 앞의 n 글자로 이루어진 문자열을 return
// 하는 solution 함수를 작성해 주세요.
