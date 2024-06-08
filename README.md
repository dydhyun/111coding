# 파일 작성 및 업로드 가이드

이 문서는 파일 작성 및 업로드에 관한 양식을 제공합니다.
<br>이 가이드라인을 따름으로써 커밋 메시지 관리를 연습하며,
<br> 일관성을 유지하고 프로젝트 관리를 용이하게 합시다.

## 커밋 메시지 규칙

커밋 메시지는 다음 정보를 포함해야 합니다:

- 형식: `날짜+플랫폼+문제 이름`
- 예시: `2024/05/25 프로그래머스 코딩 테스트 연습 > 오픈 채팅방`

## 클래스 이름 양식

클래스 이름은 플랫폼과 문제 이름을 기반으로 합니다:

- 형식: `플랫폼_문제이름`
- 예시: `Programmers_seekPY`

#### 클래스파일 작성 예시

```java
package since_24_05;

// 프로그래머스 > 코딩테스트 연습 > 문자열 내 p와 y의 개수
public class Programmers_seekPY {
    // 클래스 구현 내용...
}
```

## 패키지 이름 양식

패키지 이름은 다음과 같은 형식을 따릅니다:

- 형식: `패키지 생성일자 월 까지 표시`
- 예시: `since_24_05`
