## Title: [1Week] 송호준

### 미션 요구사항 분석 & 체크리스트

---
### 필수 항목
- [ ] 호감 목록 삭제 기능 구현
  - [ ] 삭제 전 소유권이 본인(로그인한 사람)에게 있는지 체크
  - [x] 삭제 기능 구현
    - [x] likeablePerson/list.html 과 컨트롤러 연결
    - [x] LikeablePersonController 에서 get 요청 받는 기능 구현
      - [x] likeablePersonService delete 메소드 구현
        - [x] likeableRepository 에서 해당 id 삭제
  - [x] 삭제 후 호감 목록 페이지로 돌아와야함
    - [x] rq.redirectWithMsg 함수 사용

- [ ] 호감 목록 페이지 CSS,HTML 개선



### 1주차 미션 요약

---

**[접근 방법]**

- 먼저 테이블들의 관계를 분석했다.
  - LikeablePerson 테이블에서 데이터를 삭제하는 과정은 다른 테이블에게 영향을 끼치지 않았다.

1. Likeable 클래스 정보를 살펴봤다.
   - 기본키인 id 가 Long 으로 선언되어 LikeablePersonRepository 의 인자 값을 변경했다.
2. JPARepository 가 제공하는 메소드를 확인하고 필요한 메소드를 찾았다.
   - deleteById() 를 사용했다.
3. Service 의 메소드를 이용하기 위해 Controller 에서 Service 를 호출했다.
4. Controller 의 경우 likeablePerson/add 와 관련된 메소드를 보며 따라했다.
   - 점프투스프링부트 QnA 게시판의 기능을 참고하기도 했다.

  


**[특이사항]**

- 미션을 시작하는 과정에서 많이 해맸다.
  - repo 클론 -> remote 연결 해제 -> 내 repo 에 연결
- 단위 커밋을 하려고 시도했지만, 너무 세세하게 나누면 오히려 가독성이 떨어질 것 같아 그만 뒀다.

- 호감 목록 페이지가 너무 초라해 보인다.
  - html, css 를 수정해도 될 것 같다.
  - 특히 삭제의 경우 버튼으로 생각하기 힘들다.
- 테스트 케이스를 작성해야 한다.