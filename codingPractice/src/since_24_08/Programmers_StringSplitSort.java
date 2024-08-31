package since_24_08;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

// 프로그래머스 코딩테스트 연습 > 코딩 기초 트레이닝 > 문자열 잘라서 정렬하기
public class Programmers_StringSplitSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String myString = br.readLine();
        br.close();

        bw.write(Arrays.toString(solution(myString)));
        bw.flush();
        bw.close();

    }

//    public static String[] solution(String mystring) {
//        String[] arr = mystring.split("x");
//        int n = 0;
//
//        for (int i = 0; i < arr.length; i++){
//            if (!arr[i].isEmpty()){
//                arr[n] = arr[i];
//                n++;
//            }
//        }
//// 반례 : dxccxbbbxxxaaaa
//// n을 정의하고 새 배열 result 를 만든 이유 :
//// arr.length 를 그대로 result 배열의 크기로 가져오게 되면
//// arr.length = 5 일때 result 배열의 크기도 5로 가져와지는데
//// 실제 저장은 다음과 같이: [aaaa, bbb, cc, d, ] 마지막 값에 아무것도 안들어간 배열이 생성되어
//// arr[i] 가 빈값이 아닌경우의 크기를 가져오려고 for 문 안에 n++ 카운트세서
//// result[n] 으로 만들어줌
//        String[] result = new String[n];
//        for (int i = 0; i < n; i++){
//            if (!arr[i].isEmpty()){
//                result[i] = arr[i];
//            }
//        }
//        Arrays.sort(result);
//        return result;
//    }


    public static String[] solution(String mystring) {
        List<String> result = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(mystring, "x");

        System.out.println("토큰 갯수 새는 메서드: st.countTokens() : " + st.countTokens());
//      ㄴ나중에 알아낸 메서드 이런게 있더라~


        while (st.hasMoreTokens()){
            result.add(st.nextToken());
        }

        String[] rst = result.toArray(new String[0]);
        Arrays.sort(rst);
        System.out.println(Arrays.toString(rst));

        return rst;
    }


}
// 문자열 myString 이 주어집니다.
// "x"를 기준으로 해당 문자열을 잘라내 배열을 만든 후
// 사전순으로 정렬한 배열을 return 하는 solution 함수를 완성해 주세요.