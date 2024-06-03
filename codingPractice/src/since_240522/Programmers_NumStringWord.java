package since_240522;


import java.util.Arrays;
import java.util.stream.IntStream;

// 프로그래머스 코딩테스트 연습 > 숫자 문자열과 영단어
public class Programmers_NumStringWord {
    public static void main(String[] args) {
        String s = "12four9nine88nine";
        Programmers_NumStringWord sol = new Programmers_NumStringWord();
        System.out.println(sol.solution(s));

    }

    public int solution(String s) {
//        int answer = 0;
//        String result = "";
//
//        result = s.replaceAll("one","1");
//        result = result.replaceAll("two","2");
//        result = result.replaceAll("three","3");
//        result = result.replaceAll("four","4");
//        result = result.replaceAll("five","5");
//        result = result.replaceAll("six","6");
//        result = result.replaceAll("seven","7");
//        result = result.replaceAll("eight","8");
//        result = result.replaceAll("nine","9");
//        result = result.replaceAll("zero","0");
//
//        answer = Integer.parseInt(result);
//        return answer;
        String[] strArr = {"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < strArr.length; i++) {
            if (s.contains(strArr[i])) {
                s = s.replaceAll(strArr[i], Integer.toString(i));
            }
        }
        return Integer.parseInt(s);
    }

}
// 네오와 프로도가 숫자놀이를 하고 있습니다.
// 네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면
// 프로도는 원래 숫자를 찾는 게임입니다.
//
// 다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
//
// 1478 → "one4seveneight"
// 234567 → "23four5six7"
// 10203 → "1zerotwozero3"
// 이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나,
// 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다.
// s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.