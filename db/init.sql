DROP
DATABASE IF EXISTS gram__dev;
CREATE
DATABASE gram__dev;
USE
gram__dev;

DROP
DATABASE IF EXISTS gram__test;
CREATE
DATABASE gram__test;
USE
gram__test;

desc insta_member;

desc likeable_person;

desc member;

select username from member;

select * from member;

select * from insta_member;

select from_insta_member_username, to_insta_member_username from likeable_person;

select * from likeable_person;

select m.username from member m, insta_member i where m.insta_member_id=i.id;



SELECT username
FROM `member`
WHERE provider_type_code = 'KAKAO'
ORDER BY id DESC
    LIMIT 1;


# 5번 항목의 삭제버튼을 눌렀을 경우에 실행되어야 하는 SQL
DELETE
FROM likeable_person
WHERE id = 5;
