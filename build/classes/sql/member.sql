SELECT * FROM tab;

--//============계정생성
CREATE USER oracle IDENTIFIED BY password;
    <!-- (user name) -->
--//============권한부여
GRANT RESOURCE, CONNECT, DBA TO oracle;

SHOW USER; --->유저를 보여줘라

SELECT * FROM member;

--//=========테이블 생성
CREATE TABLE member(
    id VARCHAR2(10), 
    name VARCHAR2(10), 
    pass VARCHAR2(10), 
    ssn VARCHAR2(14)
);

--//==========
DROP TABLE member;

--//==========인스턴스 생성 - DB에서 한 row를 추가하는 것
INSERT INTO member(id, name, pass, ssn)
VALUES('hong', '홍길동', '1', '940613-1111111');

--id로 data를 찾겠다.
SELECT * FROM member WHERE id LIKE 'eunji06';

--
DELETE FROM member WHERE name LIKE '류지혁';

