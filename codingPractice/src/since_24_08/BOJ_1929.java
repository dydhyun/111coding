package since_24_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 에라토스테네스의 체를 사용하여 M까지의 소수 판별
        boolean[] isPrime = new boolean[M + 1];
        for (int i = 2; i <= M; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= M; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= M; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // N 이상 M 이하의 소수를 출력
        for (int i = N; i <= M; i++) {
            if (isPrime[i]) {
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb);
    }
}


// 백준 1929번 소수 구하기

// M 이상 N 이하의 소수를 모두 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다.
// (1 ≤ M ≤ N ≤ 1,000,000) M 이상 N 이하의 소수가 하나 이상 있는 입력만 주어진다.

// 출력
// 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.

