package since_240522;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// collection, stream 연습하기
// 코드 가독성 높이기 (뎁스 신경쓰고 라인 신경쓰기)
public class CP0522 {
    public static void main(String[] args) {
        CP0522 sol = new CP0522();

        int[] dot = {4,-5};
        System.out.println(sol.solutionDotLocation(dot));

        int n = 2;
        int[] numArr = {1,2,3,4,5,60,77,88,521};
        System.out.println(Arrays.toString(sol.solutionMulN(n,numArr)));

        System.out.println(Arrays.toString(sol.solutionIntArr(numArr)));

        System.out.println(sol.solutionBacteria(2,10));

        System.out.println(sol.solutionBiggerThanN(numArr, 10));


    }
    public int solutionDotLocation(int[] dot) {

        if( dot[0] > 0 && dot[1] > 0 ) return 1;
        else if( dot[0] < 0 && dot[1] > 0 ) return 2;
        else if( dot[0] < 0 && dot[1] < 0 ) return 3;
        else return 4;
    }

    public int[] solutionMulN(int n, int[] numArr) {
//        int[] answer = {};
//        answer = Arrays.stream(numArr).filter(e -> e % n == 0).toArray();
//        return answer;
        List<Integer> List = new ArrayList<>();
        for(int i = 0; i < numArr.length; i++){
            if(numArr[i] % n == 0){
                List.add(numArr[i]);}
        }
        int[] answer = new int[List.size()];
        for(int i = 0; i< List.size(); i++){
            answer[i] = List.get(i);
        }
        return answer;
    }

    public int[] solutionIntArr(int[] arr) {
//        int[] answer = Arrays.stream(arr)
//                .map(e -> {
//                    if ((e >= 50) && (e % 2 == 0))
//                        return e / 2;
//                    else if ((e < 50) && (e % 2 == 1))
//                        return e * 2;
//                    else
//                        return e;
//                }).toArray();
//
//        return answer;
        //list로 풀어보기
        List<Integer> intList = new ArrayList<>();
        for(int n : arr) {
            intList.add(n);
        }
        for(int i = 0; i < arr.length; i++) {
            if(intList.get(i) >= 50 && intList.get(i) % 2 == 0)
                intList.set(i, intList.get(i) / 2);
            else if(intList.get(i) < 50 && intList.get(i) % 2 == 1)
                intList.set(i, intList.get(i) * 2);
        }
        return intList.stream().mapToInt(Integer::intValue).toArray();
    }
    public int solutionBacteria(int n, int t) {
//        while(t!=0){
//            n *= 2;
//            t--;
//        }
//        return n;

//        2,10 = 2048 = 2^2 )^2 )^2...
//        int answer = n * (int)Math.pow(2,t);
//        return answer;

        int answer = 0;
        answer = n << t;
        return answer;
    }

    public int solutionBiggerThanN(int[] numbers, int n) {
        final int[] sum = {0};
        IntStream.of(numbers).reduce(0, (a, b) -> {
            if (sum[0] > n) return a;
            sum[0] += b;
            return sum[0];
        });
        return sum[0];
    }


}
