-- DML (INSERT, UPDATE, DELETE)

-- 데이터 입력

/*
    문제 1 ]
        emp1 테이블에 다음 데이터를 입력하세요.
        이름  : 둘리
        직급  : 머슴
        급여  : 10
        입사일 : 현재시간
*/
INSERT INTO
    emp1(ename, job, sal, empno)  -- sysdate는 디폴트값으로 설정해놔서 안써도 됨
VALUES(
    '둘리', '머슴', 10, 1005
);
/*
    문제 2 ]
        emp1 테이블에 다음데이터를 입력하세요.
        이름  : 고길동
        직급  : 어른
        입사일 : 2022년 03월 21일
*/
INSERT INTO
    emp1(ename, job, hiredate, empno)
VALUES(
    '고길동', '어른', '2022/03/21', 1006 -- TO_DATE('2022년 03 21일', 'YYYY"년 "MM"월 "DD"일"') 해도 똑같이 들어감
    -- 주말에 공부할거 많은
);
/*
    문제 3 ]
        emp1 테이블에 다음 데이터를 입력하세요.
        이름  : 희동이
        직급  : 대장
        급여  : NULL
        입사일 : 2022년 01월 01일
*/
INSERT INTO
    emp1(ename, job, hiredate, empno)  -- 이것도 굳이 필드이름에 sal을 넣어주지 않아도 null로 들어간다.
VALUES(
    '희동이', '대장', '2022/01/01', 1007
);

-- 데이터 수정
ALTER TABLE emp1
MODIFY ename VARCHAR2(10 CHAR);

ALTER TABLE emp1
MODIFY job VARCHAR2(10 CHAR);

-- 고길동 job 애완동물로 바꾸기
UPDATE
    emp1
SET
    job = '애완동물'
WHERE
    empno = 1006
;
/*
    문제 4 ]
        emp1 테이블에서 다음 데이터를 수정하세요.
        감자, 양파, 당근, 마늘
        사원의 이름 앞에 'Miss.' 붙여서 이름이 만들어지게 수정하세요.
        나머지 사원들은 이름 앞에 'Mr.'을 붙여서 수정하세요.
*/
UPDATE
    emp1
SET
--    ename = CASE ename WHEN 'Miss.감자' THEN 'Mr.' || ename
--                       ELSE null
--            END
--;
--ROLLBACK;
    ename = DECODE(empno, 1001, 'Miss.' || ename,
                          1002, 'Miss.' || ename,
                          1003, 'Miss.' || ename,
                          1004, 'Miss.' || ename,
                          'Mr.' || ename
                )
;  
        /*
            문제가 이름으로 되어있는데 어째서 empno로 했을까
            DECODE(ename, '감자', 'Miss.' || ename,
                          '양파', 'Miss.' || ename,
                          '당근', 'Miss.' || ename,
                          '마늘', 'Miss.' || ename,
                          'Mr.' || ename
                )
            나는 바본가바
        */

/*
    문제 5 ]
        emp1 테이블에서 입사년도가 81년인 사원만
        급여를 25% 인상하는데 10단위 이하는 버림으로 처리하세요.
*/
UPDATE
    emp1
SET
    sal = TRUNC(sal * 1.25, -1)
WHERE
    TO_CHAR(hiredate, 'YY') = '81'
;

-- 다른 테이블의 데이터 복사

/*
    문제 6 ]
        emp 테이블의 'SMITH' 사원의 데이터를 복사해서
        emp1 테이블에 입력하세요.
*/
INSERT INTO     -- 다른 테이블에서 복사할 때는 VALUES 안씀
    emp1
(
    SELECT
        *
    FROM
        emp
    WHERE
        ename = 'SMITH'
);

-- 데이터 삭제

/*
    문제 7 ]
        emp1 테이블에서 부서번호가 10번인 사원만 삭제하세요.
*/
DELETE
FROM
    emp1
WHERE
    deptno = 10
;

/*
    문제 8 ]
        emp1 테이블에서 이릉이 'H'로 끝나는 사원만 삭제하세요.
*/

DELETE
FROM
    emp1
WHERE
    SUBSTR(ename, LENGTH(ename), 1) = 'H'
;