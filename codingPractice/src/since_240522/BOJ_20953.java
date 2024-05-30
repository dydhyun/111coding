package since_240522;

import java.util.Scanner;

public class BOJ_20953 {
    public static void main(String[] args) {
        BOJ_20953 sol = new BOJ_20953();
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine();

        int[] rst = new int[input];

        for (int i = 0 ; i < input; i++){
            String twoNum = sc.nextLine();
            String[] numArr = twoNum.split(" ");
            rst[i] = sol.dolmen(Integer.parseInt(numArr[0]),
                                Integer.parseInt(numArr[1]));
        }
        for(int i = 0; i < input; i++) {
            System.out.println(rst[i]);
        }
    }
    public int dolmen(int a, int b) {
//        int sum, i, j, k;
//        sum = 0;
//        for (i = 0; i < a + b; i++) {
//            for (j = 0; j < a + b; j++) {
//                for (k = 0; k < j; k++) {
//                    sum++;
//                }
//            }
//        }
//        return sum;
        /*
        * 0 3 i++
        *   0 3 j++
        *       0 j k++
        * i->0  j-1 k0
        *       j-2 k0,1
        * i->1  j-1 k0
        *       j-2 k0,1
        * i->2  j-1 k0
        *       j-2 k0,1

        * */ //하지만 문제조건 범위를 벗어나서 롱타입으로 계산해야됨
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int a = sc.nextInt();

            int b = sc.nextInt();

            System.out.println((long)(a + b - 1) * (a + b) * (a + b) / 2);
        }

        sc.close();
    }
}*/
        return (a + b) * (a + b) * (a + b - 1) / 2;
    }
}
// 예린은 고고학자이다. 예린은 강원대학교 백록관 지하에서 고인돌이 발견되었다는 소식을 듣고
// 누구보다 빠르게 백록관에 도착하였다.
// 고인돌을 본 순간 예린은 놀라 자빠질 수밖에 없었다.
// 고인돌에 의미를 알 수 없는 문자들이 가득 새겨져 있었기 때문이다.
// 예린은 이 문자들을 누구보다 빠르게 그리고 남들과는 다르게 해석하기로 결심하였다.
//열심히 연구한 결과 예린은 이 문자들이 어셈블리 언어의 함수 코드를 의미함을 발견하였다.
// 아래 코드는 고인돌의 어셈블리 언어 코드와 동일한 기능을 하는 C 코드이다.
//
// int dolmen(int a, int b) {
//    int sum, i, j, k;
//    sum = 0;
//    for (i = 0; i < a + b; i++) {
//        for (j = 0; j < a + b; j++) {
//            for (k = 0; k < j; k++) {
//                sum++;
//            }
//        }
//    }
//    return sum;
// }
// 정수 a와 b가 주어졌을 때,
// 함수 dolmen(a, b)의 실행 결과를 구하는 프로그램을 작성하시오.