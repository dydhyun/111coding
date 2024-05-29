package since_240522;

import java.util.Scanner;

public class BOJ_1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세준이가 시험본 과목 N:");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("세준이의 성적" + n + "개 입력:");
        String score = sc.nextLine();

        String[] numArr = score.split(" ");
        int sum = 0;
        int max = 0;
        int[] scoreArr = new int[n];
        for (int i = 0; i < n; i++) {
//            scoreArr[i] = Integer.parseInt(numArr[i]);
//            max = max <= Integer.parseInt(numArr[i]) ?
//                    Integer.parseInt(numArr[i]) : max;
//            sum += scoreArr[i];
            int curScore = Integer.parseInt(numArr[i]);
            max = Math.max(max, curScore);
            sum += curScore;
        }
        double avg = (double) sum / n ;
        double newAvg = avg / max * 100;
        System.out.println(newAvg);
    }
}
// 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다.
// 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다.
// 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
// 예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면
// 수학점수는 50/70*100이 되어 71.43점이 된다.
// 세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.

