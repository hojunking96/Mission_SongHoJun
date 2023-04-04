# 1Week_송호준.md

## Title: [1Week] 송호준

### 미션 요구사항 분석 & 체크리스트

---


### N주차 미션 요약

---

**[접근 방법]**

- [ ] 호감 목록 삭제 기능 구현
  - [ ] 삭제 전 소유권이 본인(로그인한 사람)에게 있는지 체크
  - [ ] 삭제 기능 구현
    - [ ] likeablePerson/list.html에서 form 과 post 기능 구현 
    - [ ] LikeablePersonController 에서 post 요청 받는 기능 구현
      - [x] likeablePersonService delete 메소드 구현
        - [ ] likeableRepository 에서 해당 id 삭제
  - [ ] 삭제 후 호감 목록 페이지로 돌아와야함
    - [ ] rq.redirectWithMsg 함수 사용


**[특이사항]**

- 호감 목록 페이지 : likeablePerson/list
- LikeablePersonController에서 likeablePerson/list.html로 likeablePeople을 전달한다.
  - likeablePeople : fromInstaMemberId와 일치하는 likeablePerson 객체다. 
