package since_24_06;

import java.io.*;
import java.util.StringTokenizer;

// 스택 구현하기
public class BOJ_10828 {

    private static int size = 0;
    private static int[] stack = new int[10000];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();

            switch (input){

                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;

                case "pop" :
                    sb.append(pop()).append('\n');
                    break;

                case "size" :
                    sb.append(size()).append('\n');
                    break;

                case "empty" :
                    sb.append(empty()).append('\n');
                    break;

                case "top" :
                    sb.append(top()).append('\n');
                    break;

                default : break;
            }

        }
        br.close();
        bw.write(sb.toString());
        bw.flush();
        bw.close();

    }


    public static void push(int n){
        stack[size++] = n;
    }

    public static int pop(){
        if (size == 0)
            return -1;
        else
            return stack[--size];
    }

    public static int size(){
        return size;
    }

    public static int empty(){
        if (size == 0)
            return 1;
        else
            return 0;
    }

    public static int top(){
        if (size == 0)
            return -1;
        else
            return stack[size-1];
    }

}
// BOJ_10828 스택
//
// 정수를 저장하는 스택을 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
// 명령은 총 다섯 가지이다.

// push X: 정수 X를 스택에 넣는 연산이다.
// pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다.
// 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
// size: 스택에 들어있는 정수의 개수를 출력한다.
// empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
// top: 스택의 가장 위에 있는 정수를 출력한다.
// 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다

// 예를 들어 A = 150, B = 266, C = 427 이라면,
// A × B × C = 150 × 266 × 427 = 17037300 이 되고,
// 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.

// 입력
// 첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다.
// 둘째 줄부터 N개의 줄에는 명령이 하나씩 주어진다.
// 주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다.
// 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

// 출력
// 출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다.