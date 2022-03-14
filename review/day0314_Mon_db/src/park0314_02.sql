
-- At emp2 TABLE, 직원들 중 자신의 직급이 같은 사람들의 평균 연봉과 같거나 더 많이 
-- 받는 사람들의 이름, 직급, 연봉을 출력
-- 1) 평균 연봉
-- 2) 1)결과값 <= 자기 연봉 인 사람들 이름, 직급, 연봉

SELECT name, position, pay 
FROM emp2 e1
WHERE pay >= ( 
    SELECT AVG(pay) 
    FROM emp2 e2 
    WHERE e1.position = e2.position );
-- sub query에서 main query에서 emp2 e1이라고 따로 선언한 값을 사용


-- At emp2 TABLE, 사원들의 이름과 부서 이름을 출력

-- 조인
SELECT e.name, d.dname
FROM emp2 e, dept2 d
WHERE e.deptno = d.dcode;

-- 스칼라 sub query
SELECT e.name, (
    SELECT dname
    FROM dept2 d
    WHERE e.deptno = d.dcode )
FROM emp2 e;

-- 사원 이름과 해당 사원의 관리자 이름을 출력
SELECT e1.ename, (
    SELECT e2.ename
    FROM emp e2
    WHERE e1.mgr = e2.empno )
FROM emp e1;
-- 스칼라 sub query는 outer join과 동일한 동작을 함
-- 결과가 없을 경우 null 값을 그대로 출력


-- At student, department Table, 학과별로 학생들의 최대 키, 최대 몸무게, 학과이름 출력

SELECT d.dname, s."max_height", s."max_weight"
FROM ( 
    SELECT deptno1, MAX(height) "max_height", MAX(weight) "max_weight"
    FROM student
    GROUP BY deptno1 ) s, department d
WHERE s.deptno1 = d.deptno;
-- FROM절 안에서 만들어진 가상의 뷰를 하나의 테이블로 생각하고 SQL문 실행
-- 해당 SQL 문에서만 사용되고 다른 곳에서 사용될 수 없음


-- At student, department TABLE, 학과별로 가장 키가 큰 학생들의 이름, 키, 학과이름을
-- 출력
-- sub query : 학과별로 가장 큰 키를 구함
-- sub query로 만든 임시 테이블, 다른 테이블들 조인 (student, department)
SELECT s2.name, s2.height, d.dname 
FROM ( 
    SELECT deptno1, MAX(height) "max_height"
    FROM student
    GROUP BY deptno1 ) s1, student s2, department d 
WHERE s1.deptno1 = d.deptno
    AND s1."max_height" = s2.height
ORDER BY s2.height;


-- At student TABLE, 학생의 키가 동일 학년의 평균 키보다 큰 학생들의 학년과 이름, 키,
-- 해당 학년의 평균키 출력
-- 학년으로 오름차순 정렬
-- sub query : 학년별 평균키
-- sub query로 만든 view, 다른 테이블들 조인(student)

SELECT * FROM student ORDER BY grade;
SELECT  s1.grade, s2.name, s2.height, s1."avg_height"
FROM (
    SELECT grade, AVG(height) "avg_height"
    FROM  student
    GROUP BY grade ) s1, student s2
WHERE s2.height > s1."avg_height"
    AND s1.grade = s2.grade
ORDER BY grade;

