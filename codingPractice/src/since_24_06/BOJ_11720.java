package since_24_06;

import java.io.*;

public class BOJ_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        long n = Long.parseLong(br.readLine());
//        long input = Long.parseLong(br.readLine());
//        long sum = 0;
//        for(int i = 0; i < n; i++){
//            sum += input % 10;
//            input /= 10;
//        }

        String n = br.readLine();
        String input = br.readLine();
        System.out.println(n);

        int sum = 0;
        for(int i = 0; i < Integer.parseInt(n); i++){
//            sum += Integer.parseInt(String.valueOf(input.charAt(i)));
            sum += input.charAt(i) - '0';
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
}
// BOJ_11720 숫자의 합
//
// N개의 숫자가 공백 없이 쓰여있다.
// 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
//
// 입력:
// 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다.
// 둘째 줄에 숫자 N개가 공백없이 주어진다.
// 출력:
// 입력으로 주어진 숫자 N개의 합을 출력한다.