CREATE TABLE account(
	accountNum VARCHAR2(9),
	money NUMBER(10,0),
	today VARCHAR2(20)
);

INSERT INTO account(accountNum, money, today)
VALUES('1111-1111', 5000, '1994.06.13');

SELECT * FROM account;

DROP TABLE account;

DELETE FROM account WHERE money LIKE 5000;

