package since_240522;

import java.util.Arrays;

// 프로그래머스 > 코딩테스트 연습 > 서울에서 김서방 찾기
public class Programmers_SeekKim {
    public static void main(String[] args) {
    String[] seoul = {"Jane", "Ahn", "Kang", "Kim", "Choi"};
    String[] seoul1 = {"Jane", "Kim"};

    Programmers_SeekKim sol = new Programmers_SeekKim();
        System.out.println(sol.solution(seoul));
    }

    // String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"
    // 는 String을 반환하는 함수, solution을 완성하세요.
    // seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
    // 제한 사항
    // seoul은 길이 1 이상, 1000 이하인 배열입니다.
    // seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
    // "Kim"은 반드시 seoul 안에 포함되어 있습니다.
    public String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder();
        int x = -1;
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                x = i;
                break;
            }
        }
        if( x == -1){
            return "김서방은 없다.";
        }
        String answer = sb.append("김서방은 ").
                        append(x).append("에 있다").toString();
        return answer;
//        int x = Arrays.asList(seoul).indexOf("Kim");
//        return "김서방은 " + x + "에 있다";
    }

}
