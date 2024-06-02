package since_240522;


// 프로그래머스 > 코딩테스트 연습 > 수박수박수박수박수박수?
public class Programmers_Watermelon {
    public static void main(String[] args) {
        Programmers_Watermelon sol = new Programmers_Watermelon();
        System.out.println(sol.solution(5));
    }
    // 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수,
    // solution을 완성하세요.
    // 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
//        sb.append("수");

//        for(int i = 2; i <= n; i++){
//            if(i % 2 == 0){
//                sb.append("박");
//            }
//            else {
//                sb.append("수");
//            }
//        }
        for (int i = 0; i < n; i++){
             sb.append( (i%2==0) ? "수" : "박");
        }
        return sb.toString();
    }


}