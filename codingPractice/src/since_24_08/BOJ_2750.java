package since_24_08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class BOJ_2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] result = new int[N];

        for(int i = 0; i < N; i++){
            result[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < result.length-1; i++){
            for (int j = 0; j < result.length -1 -i; j++){
                if(result[j] > result[j+1]){
                    swap(result, j, j+1);
                }
            }
        }

//        for (int num : result) {
//            System.out.println(num);
//        }
        for (int i = 0; i < N; i++) {
            System.out.println(result[i]);
        }

    }

    public static void swap(int[] arr, int a , int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
}

// 백준 2750번 수 정렬하기

// N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

// 입력
// 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다.
// 둘째 줄부터 N개의 줄에는 수가 주어진다.
// 이 수는 절댓값이 1,000보다 작거나 같은 정수이다.
// 수는 중복되지 않는다.

// 출력
// 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
