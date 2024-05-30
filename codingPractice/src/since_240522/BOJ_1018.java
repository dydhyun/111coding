package since_240522;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ_1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();//10; // 행 수
        int M = sc.nextInt();//13; // 열 수
        sc.nextLine();
//        int[] chessBoard = new int[8];
        int cap = N * M;
        List<String> inputLst = new ArrayList<>(cap);

        // 리스트에 NM크기의 보드입력
        for(int i = 0; i < N; i++){
            inputLst.add(sc.nextLine());
        }

        String[] totalInFilter = getTotalInFilter(N, M, inputLst);

        // 최소 변경 횟수 출력
        System.out.println(getMinChanges(totalInFilter));

    }

    // 8*8 filter로 문자열 저장하는 동작
    public static String[] getTotalInFilter(int N, int M ,List<String> inputLst) {
        int repeatN = N - 8 + 1;
        int repeatM = M - 8 + 1;
        String[] totalInFilter = new String[repeatN * repeatM];
        int filterIndex = 0;
        int index = 0;
        for (int i = 0; i < repeatN; i++) {//행반복
            for (int j = 0; j < repeatM; j++) {//열반복
                totalInFilter[filterIndex] =
                        inputLst.get(i).substring(j, j + 8);
            }
        }
        return totalInFilter;
    }
    private static int getMinChanges(String[] totalInFilter) {
        int minChanges = Integer.MAX_VALUE;
        for (String board : totalInFilter) {
            minChanges = Math.min(minChanges, getChangesForBoard(board));
        }
        return minChanges;
    }

    private static int getChangesForBoard(String board) {
        int changes1 = 0; // 'W'로 시작하는 체스판
        int changes2 = 0; // 'B'로 시작하는 체스판
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0 && board.charAt(i * 8 + j) != 'W') {
                    changes1++;
                } else if ((i + j) % 2 != 0 && board.charAt(i * 8 + j) != 'B') {
                    changes1++;
                }
                if ((i + j) % 2 == 0 && board.charAt(i * 8 + j) != 'B') {
                    changes2++;
                } else if ((i + j) % 2 != 0 && board.charAt(i * 8 + j) != 'W') {
                    changes2++;
                }
            }
        }
        return Math.min(changes1, changes2);
    }

}

// 지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M×N 크기의 보드를 찾았다.
// 어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다.
// 지민이는 이 보드를 잘라서 8×8 크기의 체스판으로 만들려고 한다.
//
// 체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다.
// 구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고,
// 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다.
// 따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다.
// 하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.
//
// 보드가 체스판처럼 칠해져 있다는 보장이 없어서,
// 지민이는 8×8 크기의 체스판으로 잘라낸 후에
// 몇 개의 정사각형을 다시 칠해야겠다고 생각했다.
// 당연히 8*8 크기는 아무데서나 골라도 된다.
// 지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.
//
//입력 8 <= N,M <= 50
// 첫째 줄에 N과 M이 주어진다.
// N과 M은 8보다 크거나 같고, 50보다 작거나 같은 자연수이다.
// 둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다.
// B는 검은색이며, W는 흰색이다.
//
// 출력
// 첫째 줄에 지민이가 다시 칠해야 하는 정사각형 개수의 최솟값을 출력한다.