## Title: [1Week] 송호준

### 미션 요구사항 분석 & 체크리스트

---

### 필수 항목

- [x] 호감 목록 삭제 기능 구현
    - [x] 삭제 전 소유권이 본인(로그인한 사람)에게 있는지 체크 - LikeablePersonService.delete() 에서 구현
        - [x] 삭제할 항목이 본인의 소유가 아닌 경우
            - [x] 인스타 아이디가 없는데 삭제를 시도하는 경우 : F-1
            - [x] 인스타 아이디가 있지만 타인의 항목 삭제를 시도하는 경우 : F-2
        - [x] 존재하지 않는 항목 삭제를 시도하는 경우 : F-3
    - [x] 삭제 기능 구현
        - [x] likeablePerson/list.html 컨트롤러 연결 구현
            - [x] LikeablePersonController 컨트롤러 기능 구현
                - [x] likeablePersonService 삭제 메소드 구현
                    - [x] likeableRepository 해당 id 삭제 기능 구현
    - [x] 삭제 후 호감 목록 페이지로 돌아와야함
        - [x] rq.redirectWithMsg 함수 사용

### 기타
- [x] 민감정보 숨기기 - 카카오 토큰 (application.yml)
- [ ] 호감 목록 페이지 CSS,HTML 개선

### 1주차 미션 요약

---

**[접근 방법]**

- 먼저 테이블들의 관계를 분석했다.
    - LikeablePerson 테이블에서 데이터를 삭제하는 과정은 다른 테이블에게 영향을 끼치지 않았다.
- 삭제 기능 구현 -> 예외 처리 -> 리팩토링 순서로 진행했다.

1. Likeable 클래스를 살펴봤다.
    - 기본키인 id 가 Long 으로 선언되어 LikeablePersonRepository 의 인자 값을 변경했다.
2. JPARepository 가 제공하는 메소드를 확인하고 필요한 메소드를 찾았다.
    - deleteById() 를 사용했다.
3. Service 의 메소드를 이용하기 위해 Controller 에서 Service 를 호출했다.
4. Controller 의 경우 likeablePerson/like 를 보며 모방했다.
    - 점프투스프링부트 QnA 게시판의 기능을 참고하기도 했다.

**[특이사항]**

- 미션을 시작하는 과정에서 많이 해맸다.
    - repo 클론 -> remote 연결 해제 -> 내 repo 에 연결
  
- 단위 커밋을 하려고 시도했지만, 너무 세세하게 나누면 오히려 가독성이 떨어질 것 같아 그만 뒀다.
  - 수정을 한꺼번에 많이 하게 되어 세세하게 나누지 못하는 경우도 있었다.
    - 요구 사항에 따라 단계적으로 코드를 작성해야 할 필요가 있다.

- 호감 목록 페이지가 너무 초라해 보인다.
    - html, css 를 수정해도 될 것 같다.
    - 특히 삭제의 경우 버튼으로 생각하기 힘들다.

- 테스트 케이스를 작성해야 한다.