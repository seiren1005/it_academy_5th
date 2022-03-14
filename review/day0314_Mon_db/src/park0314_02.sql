
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

