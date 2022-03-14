
-- 1) 'SCOTT'의 급여를 구함 (서브 쿼리)
-- 2) 'SCOTT'의 급여보다 많은 사람을 구함 (메인 쿼리) 

SELECT ename, sal
FROM emp
WHERE sal > ( 
    SELECT sal 
    FROM emp 
    WHERE ename = 'SCOTT'
    );
-- 서브 쿼리가 먼저 수행되고 결과값을 메인 쿼리로 전해준 다음
-- 그 값을 받아서 메인 쿼리가 실행됨
-- 서브 쿼리 부분은 WHERE 절에서 연산자 오른쪽에 위치해야 하며 
-- 반드시 괄호로 묶어야 함


-- At student, department TABLE, '이윤나' 학생과 1전공이 동일한 학생들의
-- 이름, 1전공 출력

-- 1) '이윤나'학생의 1전공 구함
-- 2) 1) 값과 같은 1전공을 가진 학생들의 이름, 1전공 출력

SELECT s.name, d.dname
FROM student s, department d
WHERE s.deptno1 = d.deptno
    And s.deptno1 = ( 
        SELECT deptno1
        FROM student
        WHERE name = '이윤나'
        );


-- At student TABLE, 1전공이 101번인 학생의 평균 몸무게보다 몸무게가 많은 학생들의
-- 이름과 몸무게 출력

-- 1) 1전공 = 101 인 학생들의 평균 몸무게
-- 2) 1) 값보다 몸무게가 더 많이 나가는 학생들의 이름과 몸무게 출력

SELECT s.name, s.weight
FROM student s
WHERE s.weight > (
    SELECT NVL(AVG(weight), 0) 
    FROM student 
    WHERE deptno1 = 101
    );


-- At professor, department TABLE, 입사일이 '송도권' 교수보다 나중에 입사한 교수의
-- 이름, 입사일, 학과명 출력

-- 1) 이름 = '송하권'인 교수의 입사일
-- 2) 1) 값보다 나중에 입사한 교수의 이름, 입사일, 학과명 출력

SELECT p.name, p.hiredate, d.dname 
FROM professor p, department d
WHERE p.deptno = d.deptno
    AND p. hiredate > (
        SELECT hiredate 
        FROM professor 
        WHERE name = '송도권'
        );


-- At professor TABLE, '심슨' 교수와 같은 입사일에 입사한 교수 중 '조인형' 교수보다
-- 월급을 작게 받는 교수 이름, 급여, 입사일 출력

-- 1) 이름 = '심슨'인 교수 입사일
-- 2) 이름 = '조인형'인 교수 월급
-- 3) 1) 값과 입사일 같고, 2) 값보다 월급이 적은 교수 이름, 급여, 입사일 출력

SELECT name, pay, hiredate
FROM professor
WHERE hirdate = (
    SELECT hiredate 
    FROM professor 
    WHERE name = '심슨'
    )
    AND (
        SELECT pay 
        FROM professor 
        WHERE name = '조인형'
        );

