package since_24_09;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ_2501 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int N = Integer.parseInt(st.nextToken());
//        int K = Integer.parseInt(st.nextToken());
//
//        List<Integer> measureList = new ArrayList<>();
//
//        for (int i = 1; i <= N ; i++) {
//            if(N % i == 0)
//                measureList.add(i);
//        }
//
//
//
//        if(measureList.size() >= K)
//            bw.write(String.valueOf(measureList.get(K-1)));
//        else
//            bw.write(Integer.toString(0));
//        bw.flush();
//        bw.close();
//    }
//}
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        int count = 0; // 약수의 개수를 카운트하기 위한 변수
        int result = 0; // K번째 약수 저장 변수

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) { // i가 N의 약수인지 체크
                count++;
                if (count == K) { // K번째 약수일 경우
                    result = i; // K번째 약수를 저장
                    break; // 더 이상 찾을 필요 없음
                }
            }
        }

        // K번째 약수가 존재하지 않을 경우 0 출력
        System.out.println(count >= K ? result : 0);

        br.close();
    }
}


// 백준 2501번 약수 구하기

// 어떤 자연수 p와 q가 있을 때, 만일 p를 q로 나누었을 때 나머지가 0이면 q는 p의 약수이다.
//
// 6을 예로 들면
//
// 6 ÷ 1 = 6 … 0
// 6 ÷ 2 = 3 … 0
// 6 ÷ 3 = 2 … 0
// 6 ÷ 4 = 1 … 2
// 6 ÷ 5 = 1 … 1
// 6 ÷ 6 = 1 … 0
// 그래서 6의 약수는 1, 2, 3, 6, 총 네 개이다.
//
// 두 개의 자연수 N과 K가 주어졌을 때, N의 약수들 중 K 번째로 작은 수를 출력하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 N과 K가 빈칸을 사이에 두고 주어진다. N은 1 이상 10,000 이하이다. K는 1 이상 N 이하이다.

// 출력
// 첫째 줄에 N의 약수들 중 K 번째로 작은 수를 출력한다.
// 만일 N의 약수의 개수가 K 개보다 적어서 K 번째 약수가 존재하지 않을 경우에는 0을 출력하시오.
