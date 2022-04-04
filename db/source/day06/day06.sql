/*
    제약조건
    ==> 데이터가 입력될 때 이상이 있는 데이터가 막는 기능의 오라클 개체
    
    목적 ]
        데이터베이스의 이상현상을 제거할 목적으로 사용
    
    종류 ]
        기본키(PRIMARY KEY) 제약조건
            ==> 속성값으로 데이터를 구분할 수 있어야 한다.
                기본키 제약조건은 필수는 아니지만 되도록이면 기본키 제약조건은 추가하는 것이 좋다.
                
                기본키는 유일키 + NOT NULL 제약조건
                
        유일키(UNIQUE) 제약조건
            ==> 속성값이 다른 데이터와 구분이 되어야 한다.
                NULL 데이터는 입력할 수 있다.
                
        참조키(외래키, FOREIGN KEY) 제약조건
            ==> 참조하는 테이블의 키값을 반드시 사용해야 하는 제약조건
                입력되지 않은 키값은 입력하지 못하도록 막는 제약조건
                만약 테이블을 삭제하려고 하면 먼저 참조하고 있는 테이블을 삭제하고 해당 테이블을 삭제해야 한다.
                
        NOT NULL 제약조건
            ==> 속성값으로 NULL 데이터가 입력 안되도록 막는 제약조건
                
        CHECK 제약조건
            ==> 입력되어야 할 속성값이 정해져 있는 경우(예 ] 성별, 노출여부)
                입력될 속성값 이외의 값이 입력되는 것을 방지하는 제약조건
*/

-- emp 테이블에 둘리 사원을 입력하는데 사원의 입사일은 현재시간으로
-- 부서는 50번 부서로 입력   -- 참조키 제약조건에 걸림

INSERT INTO
    emp(empno, ename, hiredate, deptno)
VALUES(
    (
        SELECT
            NVL(MAX(empno) + 1, 1001)
        FROM
            emp
    ), '둘리', sysdate, 50
);


/*
    과제 ]
        방명록을 만들려고 한다.
        방명록은 회원가임을 하면 이 페이지로 자동 전환되도록 할 예정이다.
        방명록에는 회원아이디와 인삿말이 포함되어야 한다.
        
        방명록의 ER Model Diagram, ER-D, 테이블 명세서,
        DDL 질의명령을 작성하세요.
*/

/*
    오라클에서 사용할 수 있는 데이터 형태
    
        1. 문자형
            CHAR
                ==> 고정길이형 문자형
                
                형식 ]
                    CHAR(최대길이)
                    ==> 이때 사용가능한 최대 길이는 2000 바이트까지만 사용할 수 있다.
                    
            VARCHAR2
                ==> 가변길이형 문자형
                
                형식 ]
                    VARCHAR2(최대길이)
                    ==> 이때 최대길이는 4000 바이트까지 사용할 수 있다.
                    
            LONG
                ==> 가변길이형 문자형
                
                형식 ]
                    LONG
                    ==> 최대길이 2Gb 까지 사용할 수 있다.
                    
            CLOB
                ==> 가변길이형 문자형
                
                형식 ]
                    CLOB
                    ==> 최대길이는 4Gb 까지 사용할 수 있다.
                
                ==> 이 타입은 VARCHAR2가 4Kb 까지만 허락하기 때문에
                    그 이상의 글자수를 가진 데이터는 입력받지 못한다.
                    이 문제를 해결하기 위한 방식으로 만들어놓은 타입
                    
    참고 ]
        고정길이 문자형 ( 처리속도가 더 빠르다 )
            ==> 문자의 길이를 미리 지정한 후 입력한 문자가 길이보다 부족하면 공백을 이용해서
                반드시 같은 길이의 문자를 만들어서 입력하는 방식
                ==> 우편번호와 같이 길이가 완전히 고정된 데이터에 한해서
                    주로 사용되는 타입
                    
        가변길이 문자형
            ==> 입력한 문자의 길이에 따라서 스스로 사용하는 공간을 변경해서 
                문자열의 길이를 입력한 문자의 길이에 맞추는 형태
                ==> 데이터의 길이를 알 수 없는 경우에 주로 많이 사용한다.
                    
        2. 숫자형
            NUMBER
            
                형식 ]
                    NUMBER(숫자1[,숫자2])
                    
                    숫자1 : 전체 자리수를 의미(유효자릿수)
                    숫자2 : 소수점이하 자리수를 의미
                    
                    참고 ]
                        숫자1보다 큰 수는 입력받지 못한다.
                        숫자2보다 소수점 이하가 많으면 자동으로 반올림해서 입력한다.
                        
        3. 날짜형
            DATE
            
                형식 ]
                    DATE
                    
    참고 ]
        데이터베이스에 따라 데이터 형태도 약간씩 달라진다.
        요사이 ANSI 데이터 형태라고 해서 모든 데이터베이스에 적용 가능한 공통 형태를 표준화협회에서 제시하고 있다.
        
-----------------------------------------------------------------------------------------------

1. 테이블 만들기

    형식 ]
        CREATE TABLE 테이블이름(
            필드이름    데이터타입(길이),
            필드이름    데이터타입(길이),
            ...
        );
        
    테이블이 만들어져있는지 확인하는 방법
        
        SELECT tname FROM tab;
        
    테이블 구조를 간단하게 확인하는 방법
    
        DESCRIBE 테이블이름;
        DESC 테이블이름;
        
*/

-- jennie 계정 생성 ( system 계정에서 실행 )
CREATE USER jennie IDENTIFIED BY "12345" ACCOUNT UNLOCK;
GRANT resource, connect TO jennie;
ALTER USER jennie DEFAULT TABLESPACE USERS; -- DDL 명령 데이터베이스에 바로 적용되는, COMMIT 안해도됨

-- jennie 계정에서 실행
-- Memb 테이블 생상
CREATE TABLE memb(
    mno NUMBER(4), 
    name VARCHAR2(20 CHAR), 
    id VARCHAR2(15 CHAR), 
    pw VARCHAR2(15 CHAR), 
    mail VARCHAR2(50 CHAR), 
    tel VARCHAR2(13 CHAR), 
    addr VARCHAR2(100 CHAR),
    gen CHAR(1),
    joindate DATE DEFAULT sysdate,
    isShow CHAR(1) DEFAULT 'Y'
);

/*
    제약조건 부여하는 방법
        참고 ]
            제약조건의 이름을 부여하는 규칙
            
                테이블이름_필드이름_제약조건 의 형태로 부여하면 된다.
                
                예 ]
                    memb 테이블의 기본키 제약조건
                    ==> MEMB_NO_PK
    
        1. 테이블 생성할 때 추가하는 방법
            *****
            1-1. 필드를 정의할 때 추가하는 방법 / 권장
                형식 ]
                    필드이름    데이터타입(길이)
                        CONSTRAINT  제약조건이름  제약조건1
                        CONSTRAINT  제약조건이름  제약조건2
                        
                참고 ]
                    참조키 제약조건
                        CONSTRAINT  제약조건이름  REFERENCES  테이블이름(필드이름)
                        
                    체크 제약조건
                        CONSTRAINT  제약조건이름  CHECK   (필드이름 IN (데이터1, 데이터2, ...))
            
            1-2. 필드를 미리 정의하고 나중에 제약조건을 추가하는 방법
            
            1-3. 무명 제약조건으로 등록하는 방법 / 되도록이면 쓰지 않기
            
*/

-- memb 테이블 삭제
DROP TABLE memb;

CREATE TABLE memb(
    mno NUMBER(4) PRIMARY KEY, 
    name VARCHAR2(20 CHAR), 
    id VARCHAR2(15 CHAR), 
    pw VARCHAR2(15 CHAR), 
    mail VARCHAR2(50 CHAR), 
    tel VARCHAR2(13 CHAR), 
    addr VARCHAR2(100 CHAR),
    gen CHAR(1),
    joindate DATE DEFAULT sysdate,
    isShow CHAR(1) DEFAULT 'Y'
);

INSERT INTO
    memb(mno, name)
VALUES(
    1001, '고길동'
);

INSERT INTO
    memb(mno, name)
VALUES(
    1001, '또치'
);

DROP TABLE memb;

-- 필드를 선언하면서 제약조건을 추가하는 방법
CREATE TABLE memb(
    mno NUMBER(4) 
        CONSTRAINT MEMB_NO_PK PRIMARY KEY, 
    name VARCHAR2(20 CHAR)
        CONSTRAINT MEMB_NAME_NN NOT NULL, 
    id VARCHAR2(15 CHAR)
        CONSTRAINT MEMB_ID_UK UNIQUE
        CONSTRAINT MEMB_ID_NN NOT NULL, 
    pw VARCHAR2(15 CHAR)
        CONSTRAINT MEMB_PW_NN NOT NULL, 
    mail VARCHAR2(50 CHAR)
        CONSTRAINT MEMB_MAIL_UK UNIQUE
        CONSTRAINT MEMB_MAIL_NN NOT NULL, 
    tel VARCHAR2(13 CHAR)
        CONSTRAINT MEMB_TEL_UK UNIQUE
        CONSTRAINT MEMB_TEL_NN NOT NULL, 
    addr VARCHAR2(100 CHAR)
        CONSTRAINT MEMB_ADDR_NN NOT NULL,
    gen CHAR(1)
        CONSTRAINT MEMB_GEN_CK CHECK(gen IN('F', 'M'))
        CONSTRAINT MEMB_GEN_NN NOT NULL,
    joindate DATE DEFAULT sysdate
        CONSTRAINT MEMB_JOIN_NN NOT NULL,
    isShow CHAR(1) DEFAULT 'Y'
        CONSTRAINT MEMB_SHOW_CK CHECK(isShow IN('Y', 'N'))
        CONSTRAINT MEMB_SHOW_NN NOT NULL
);

INSERT INTO
    memb
VALUES(
    1001, '제니', 'jennie', '1234', 'jennie@mail.com', '010-1111-1111', '몰라요', 'F', sysdate, 'Y'
);

-- 게시판 테이블과 첨부파일 테이블을 만드는 질의명령을 작성하세요.
-- 참조 필드부터 만드는게 좋다!

-- GESI
CREATE TABLE gesi(
    bmno NUMBER(4)
        CONSTRAINT GESI_NO_FK REFERENCES memb(mno)
        CONSTRAINT GESI_NO_NN NOT NULL,
    bno NUMBER(6)
        CONSTRAINT GESI_BNO_PK PRIMARY KEY,
    upno NUMBER(6)
        CONSTRAINT GESI_UPNO_NN NOT NULL,
    title VARCHAR2(30 CHAR)
        CONSTRAINT GESI_TITLE_NN NOT NULL,
    body VARCHAR2(4000)
        CONSTRAINT GESI_BODY_NN NOT NULL,
    bdate DATE DEFAULT sysdate
        CONSTRAINT GESI_BDATE_NN NOT NULL,
    edate DATE,
    click NUMBER(6) DEFAULT 0
        CONSTRAINT GESI_CLICK_NN NOT NULL,
    isShow CHAR(1) DEFAULT 'Y'
        CONSTRAINT GESI_SHOW_NN NOT NULL
        CONSTRAINT GESI_SHOW_CK CHECK(isShow IN('Y', 'N'))
);

-- CHUMBU
CREATE TABLE chumbu(
    fbno NUMBER(6)
        CONSTRAINT CHUMBU_NO_FK REFERENCES gesi(bno)
        CONSTRAINT CHUMBU_NO_NN NOT NULL,
    fno NUMBER(7)
        CONSTRAINT CHUMBU_FNO_PK PRIMARY KEY,
    oriname VARCHAR2(50 CHAR)
        CONSTRAINT CHUMBU_ONAME_NN NOT NULL,
    savname VARCHAR2(50 CHAR)
        CONSTRAINT CHUMBU_SNAME_UK UNIQUE
        CONSTRAINT CHUMBU_SNAME_NN NOT NULL,
    path VARCHAR2(200 CHAR)
        CONSTRAINT CHUMBU_PATH_NN NOT NULL,
    fsize NUMBER(12)
        CONSTRAINT CHUMBU_FSIZE_NN NOT NULL,
    dcount NUMBER(6) DEFAULT 0
        CONSTRAINT CHUMBU_COUNT_NN NOT NULL,
    isShow CHAR(1) DEFAULT 'N'
        CONSTRAINT CHUMBU_SHOW_NN NOT NULL
        CONSTRAINT CHUMBU_SHOW_CK CHECK(isShow IN('Y', 'N'))
);