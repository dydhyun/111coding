package since_24_06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_31403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        int[] intArr = new int[3];
        int intSum = 0;
        for (int i = 0; i < 3; i++){
            intArr[i] += Integer.parseInt(br.readLine());
        }
        int A = intArr[0];
        int B = intArr[1];
        int C = intArr[2];
        System.out.println(A+B-C);
        System.out.println(Integer.parseInt(Integer.toString(A)+Integer.toString(B))-C);

    }
}
// JavaScript에서
// +, - 은 수에 대해서는 일반적인 의미의 덧셈 뺄셈의 의미를 가지고 있습니다.
// 하지만 문자열에 대해서 + 는 두 문자열을 이어붙이라는 의미이고,
// - 는 양쪽 문자열을 수로 해석한 이후에 빼라는 의미입니다.
//
//
// A, B, C를 각각 수와 문자열로 생각했을 때
// A+B-C를 출력하세요