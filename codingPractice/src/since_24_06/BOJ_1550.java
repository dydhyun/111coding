package since_24_06;

import java.io.*;

public class BOJ_1550 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int result = 0;
        int mul = 1;

        for(int i = input.length() - 1; i >= 0; i--){
            if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                result += (input.charAt(i) - '0' ) * mul;
            } else {
                result += (input.charAt(i) - 'A' + 10 ) * mul;
            }
            mul *= 16;
        }

        br.close();
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
// BOJ_1550 16진수
//
// 16진수 수를 입력받아서
// 10진수로 출력하는 프로그램을 작성하시오.

// 첫째 줄에 16진수 수가 주어진다.
// 이 수의 최대 길이는 6글자이다.
// 16진수 수는 0~9와 A~F로 이루어져 있고, A~F는 10~15를 뜻한다.
// 또, 이 수는 음이 아닌 정수이다.

// 첫째 줄에 입력으로 주어진 16진수 수를 10진수로 변환해 출력한다.