package since_24_09;

import java.io.IOException;
import java.util.Arrays;

// 프로그래머스 코딩테스트 연습 > 입문 > 배열 두 배 만들기
public class Programmers_IntArrDouble {
    public static void main(String[] args) throws IOException {

        int[] arr = {1,2,3,4,5};

        System.out.println(Arrays.toString(solution(arr)));


    }
    public static int[] solution(int[] numbers) {
        int len = numbers.length;

        int[] answer = new int[len];
        for(int i = 0; i < len; i++){
            answer[i] = 2*numbers[i];
        }
        return answer;
    }

}
// 정수 배열 numbers가 매개변수로 주어집니다.
// numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.