package since_240522;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class CP0523 {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5,6,7};
//        Arrays.stream(intArr).forEach(System.out::print);
        CP0523 sol = new CP0523();
        System.out.println(Arrays.toString(sol.solutionCollatz(100)));

        System.out.println(sol.solutionCollatzSequenceLength(100));

        System.out.println(sol.solutionMod1(38));

    }


//    모든 자연수 x에 대해서 현재 값이 x이면 x가 짝수일 때는 2로 나누고,
//    x가 홀수일 때는 3 * x + 1로 바꾸는 계산을 계속해서 반복하면
//    언젠가는 반드시 x가 1이 되는지 묻는 문제를 콜라츠 문제라고 부릅니다.
//    그리고 위 과정에서 거쳐간 모든 수를 기록한 수열을 콜라츠 수열이라고 부릅니다.
//    계산 결과 1,000 보다 작거나 같은 수에 대해서는 전부
//    언젠가 1에 도달한다는 것이 알려져 있습니다.
//    임의의 1,000 보다 작거나 같은 양의 정수 n이 주어질 때
//    초기값이 n인 콜라츠 수열을 return 하는 solution 함수를 완성해 주세요
    public int[] solutionCollatz(int n) {
        List<Integer> iL = new ArrayList<Integer>();
        while( n != 1) {
            iL.add(n);
//            if (n % 2 == 0) {
//                n = n / 2;
//            } else {
//                n = 3 * n + 1;
//            }
            n = n % 2 == 0 ? (n / 2) : (3 * n + 1);

        }
        iL.add(n);
        return iL.stream().mapToInt(Integer::intValue).toArray();
    }

    public int solutionCollatzSequenceLength(int num) {
        long currentNum = (long)num;
        final int MAX_ITERATIONS = 500;
        // int 자료형이 가질 수 있는 값은
        // - 2_147_483_648 ~ 2_147_483_647 범위를 갖는다
        // 626331을 입력으로 받으면, 삼항연산 과정에서 int num 에 3 * currentNum + 1 과정 중
        // int 형의 범위를 초과해 오버플로우가 발생한다 -> long 자료형 변환 필요하다.
        int iterNum = 0;
        while (currentNum != 1){
           currentNum = ( currentNum % 2 == 0 ?  currentNum / 2 : 3 * currentNum + 1);
           iterNum++;
           if(iterNum >= MAX_ITERATIONS) return -1;
        }

        return iterNum;
    }

    public int solutionMod1(int n) {
        int answer = 2;
        // n % x = 1
        // n % x + 1 = 0
        // n - 1 % x = 0
//        for (int i = 2; i < n; i++){
//            if(n % i == 1) {
//                answer = i;
//                break;
//            }
//        }
//        return answer;
        return IntStream.range(2,n).filter(e -> n % e == 1).min().orElse(0);
    }


}
