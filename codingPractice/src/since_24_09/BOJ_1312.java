package since_24_09;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int result = A % B; // 나머지만 필요하므로 A를 B로 나눈 나머지를 계산
        for (int i = 0; i < N - 1; i++) {
            result = (result * 10) % B; // 다음 자리수의 나머지를 구함
        }

        result = (result * 10) / B; // N번째 자리수 계산
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
/*
import java.io.*;
import java.util.StringTokenizer;

public class BOJ_1312 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        br.close();

        // A를 B로 나눈 나머지를 구한 뒤, N번째 자리수까지 계산
        int remainder = A % B;
        for (int i = 1; i < N; i++) {
            remainder = (remainder * 10) % B;
        }

        // N번째 소수점 자리 계산
        int result = (remainder * 10) / B;

        System.out.println(result);
    }
}
* */


// 백준 1312번 소수

// 피제수(분자) A와 제수(분모) B가 있다. 두 수를 나누었을 때,
// 소숫점 아래 N번째 자리수를 구하려고 한다.
// 예를 들어, A=3, B=4, N=1이라면, A÷B=0.75 이므로 출력 값은 7이 된다.

// 입력
// 첫 번째 줄에 A와 B(1 ≤ A, B ≤ 100,000), N(1 ≤ N ≤ 1,000,000)이 공백을 경계로 주어진다.


// 출력
// A÷B를 했을 때, 소숫점 아래 N번째 수를 출력한다.
