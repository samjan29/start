/*
    문제 1 ]
        직급이 MANAGER인 사원의
            사원이름, 직급, 입사일, 급여, 부서이름을 조회하세요.
*/
SELECT
    ename 사원이름, job 직급, hiredate 입사일, sal 급여, dname 부서이름
FROM
    emp e, dept d
WHERE
    job = 'MANAGER'
    AND e.deptno = d.deptno
;

SELECT
    ename 사원이름, job 직급, hiredate 입사일, sal 급여, dname 부서이름
FROM
    emp e
JOIN
    dept d
ON
    e.deptno = d.deptno
WHERE
    job = 'MANAGER'
;
/*
    문제 2 ]
        사원이름이 5글자인 사원들의
            사원이름, 직급, 입사일, 급여, 급여등급을 조회하세요.
*/
SELECT
    ename 사원이름, job 직급, hiredate 입사일, sal 급여, grade 급여등급
FROM
    emp, salgrade
WHERE
    LENGTH(ename) = 5
    AND sal BETWEEN losal AND hisal
;

SELECT
    ename 사원이름, job 직급, hiredate 입사일, sal 급여, grade 급여등급
FROM
    emp
JOIN
    salgrade
ON
    sal BETWEEN losal AND hisal
WHERE
    LENGTH(ename) = 5
;
/*
    문제 3 ]
        입사일이 81년이고 직급이 MANAGER인 사원들의
            사원이름, 직급, 입사일, 급여, 급여등급, 부서이름, 부서위치를 조회하세요.
*/
SELECT
    ename 사원이름, job 직급, hiredate 입사일, sal 급여, grade 급여등급, dname 부서이름, loc 부서위치
FROM
    emp e, salgrade, dept d
WHERE
    TO_CHAR(hiredate, 'yy') = 81        -- 조인조건이 일반적으로 많이 걸러내서 더 많이 쓴다는데
    AND job = 'MANAGER'                 -- 여기서는 일반조건이 더 많이 걸러내는거 아닌감
    AND sal BETWEEN losal AND hisal
    AND e.deptno = d.deptno
;

SELECT
    ename 사원이름, job 직급, hiredate 입사일, sal 급여, grade 급여등급, dname 부서이름, loc 부서위치
FROM
    emp e
JOIN
    salgrade
ON
    sal BETWEEN losal AND hisal
JOIN
    dept d
ON
    e.deptno = d.deptno
WHERE
    TO_CHAR(hiredate, 'yy') = '81'
    AND job = 'MANAGER'
;
/*
    문제 4 ]
        사원들의
            사원이름, 직급, 급여, 급여등급, 상사이름을 조회하세요.
            
            보너스 ]
                상사가 없는 사원은 상사이름을 '상사없음'으로 조회하세요.
*/
SELECT
    e.ename 사원이름, e.job 직급, e.sal 급여, grade 급여등급, NVL(s.ename, '상사없음') 상사이름
FROM
    emp e, salgrade, emp s
WHERE
    e.mgr = s.empno(+)
    AND e.sal BETWEEN losal AND hisal       -- 별칭 잘 써줘야함
;

SELECT
    e.ename 사원이름, e.job 직급, e.sal 급여, grade 급여등급, NVL(s.ename, '상사없음') 상사이름
FROM
    emp e
JOIN
    salgrade
ON
    e.sal BETWEEN losal AND hisal
LEFT OUTER JOIN
    emp s
ON
    e.mgr = s.empno
;
/*
    문제 5 ]
        사원들의
            사원이름, 직급, 급여, 상사이름, 부서이름, 급여등급을 조회하세요.
*/
SELECT
    e.ename 사원이름, e.job 직급, e.sal 급여, NVL(s.ename, '상사없음') 상사이름, dname 부서이름, grade 급여등급
FROM
    emp e, emp s, salgrade, dept d
WHERE
    e.mgr = s.empno(+)
    AND e.deptno = d.deptno
    AND e.sal BETWEEN losal AND hisal
;

SELECT
    e.ename 사원이름, e.job 직급, e.sal 급여, NVL(s.ename, '상사없음') 상사이름, dname 부서이름, grade 급여등급
FROM
    emp e
LEFT OUTER JOIN
    emp s
ON
    e.mgr = s.empno
INNER JOIN
    dept d
ON
    e.deptno = d.deptno
INNER JOIN
    salgrade
ON
    e.sal BETWEEN losal AND hisal
;