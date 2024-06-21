package since_24_06;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int var = 0;
//        while (st.hasMoreTokens()){
        while(n-- > 0){
            var = Integer.parseInt(st.nextToken());
            if (min > var)
                min = var;
            if (max < var)
                max = var;
        }
        bw.write(min + " " + max);
        bw.flush();
        bw.close();
        br.close();

    }
}
// BOJ_10818 최소,최대
//
// N개의 정수가 주어진다.
// 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//
// 입력:
// 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
// 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
// 모든 정수는 -1,000,000보다 크거나 같고,
// 1,000,000보다 작거나 같은 정수이다.
// 출력:
// 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
