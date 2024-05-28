package since_240522;

// 프로그래머스 > 코딩테스트 연습 > 핸드폰 번호 가리기
public class Programmers_HideNum {
    public static void main(String[] args) {
        Programmers_HideNum sol = new Programmers_HideNum();
        String phone_number = "01033334444";
        System.out.println(sol.solution(phone_number));
    }

    // 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때
    // 고객들의 전화번호의 일부를 가립니다.
    // 전화번호가 문자열 phone_number로 주어졌을 때,
    // 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수,
    // solution을 완성해주세요.
    // 제한 조건
    // phone_number는 길이 4 이상, 20이하인 문자열입니다.
    public String solution(String phone_number) {
        if(20 < phone_number.length() || phone_number.length() < 4){
            return "잘못된 입력입니다.";
        }

        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < phone_number.length()-4; i++){
            sb.append("*");
        }
//        sb.append("*".repeat(phone_number.length()-4));
        sb.append(phone_number.substring(phone_number.length() - 4));
        answer = sb.toString();
        return answer;


//        char[] ch = phone_number.toCharArray();
//        for(int i = 0; i < ch.length - 4; i ++){
//            ch[i] = '*';
//        }
//        return String.valueOf(ch);
    }

}
