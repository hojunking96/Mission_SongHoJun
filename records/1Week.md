# 1Week_송호준.md

## Title: [1Week] 송호준

### 미션 요구사항 분석 & 체크리스트

---


### N주차 미션 요약

---

**[접근 방법]**

- [ ] 호감 목록 삭제 기능 구현
  - [ ] 삭제 전 소유권이 본인(로그인한 사람)에게 있는지 체크
  - [x] 삭제 기능 구현
    - [x] likeablePerson/list.html 과 컨트롤러 연결 
    - [x] LikeablePersonController 에서 get 요청 받는 기능 구현
      - [x] likeablePersonService delete 메소드 구현
        - [x] likeableRepository 에서 해당 id 삭제
  - [x] 삭제 후 호감 목록 페이지로 돌아와야함
    - [x] rq.redirectWithMsg 함수 사용


**[특이사항]**

- 호감 목록 페이지 : likeablePerson/list
- LikeablePersonController 에서 likeablePerson/list.html 로 likeablePeople 을 전달한다.
  - likeablePeople : fromInstaMemberId와 일치하는 likeablePerson 객체다. 
