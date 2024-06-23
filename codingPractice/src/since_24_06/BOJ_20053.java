package since_24_06;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_20053 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testNum = Integer.parseInt(br.readLine());
        int[] min = new int[testNum];
        int[] max = new int[testNum];

      for(int i = 0; i < testNum; i++){
          min[i] = Integer.MAX_VALUE;
          max[i] = Integer.MIN_VALUE;
          int var = 0;
          int n = Integer.parseInt(br.readLine());
          StringTokenizer st = new StringTokenizer(br.readLine());

              while(n-- > 0) {
                  var = Integer.parseInt(st.nextToken());
                  if (min[i] > var)
                      min[i] = var;
                  if (max[i] < var)
                      max[i] = var;
          }
      }
        for(int i = 0; i < testNum; i++) {
            bw.write(min[i] + " " + max[i] + '\n');
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
// BOJ_20053 최소,최대2
//
// N개의 정수가 주어진다.
// 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//
// 입력:
// 첫째 줄에 테스트 케이스의 개수 T (1 ≤ T ≤ 10)가 주어진다.
// 각 테스트 케이스는 두 줄로 이루어져 있다.
// 각 테스트 케이스의 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
// 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
// 모든 정수는 -1,000,000보다 크거나 같고,
// 1,000,000보다 작거나 같은 정수이다.
// 출력:
// 각 테스트 케이스마다 주어진 정수 N개의
// 최솟값과 최댓값을 공백으로 구분해
// 한 줄에 하나씩 차례대로 출력한다.