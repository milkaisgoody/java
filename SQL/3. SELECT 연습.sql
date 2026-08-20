-- ctrl + enter 한 문장 실행
select *
from emp;

-- emp 테이블에서 사원의 이름과 급여만 조회
select emp_name, emp_no
from emp;

SELECT EMP_NAME, SALARY
FROM EMP
WHERE EMP_NAME = '오미자'; -- 문자열은 ''로 감싸야한다.

-- 급여가 350만원 이상이고 부서가 회계관리부인 사람을 조회
-- 1. 부서코드 확인하기
SELECT *
FROM DEPT;

--
SELECT EMP_NAME, SALARY -- 컬럼을 ,로 연결
FROM EMP
WHERE SALARY >= 3500000 -- 조건을 연산자(AND, OR)을 이용해서 연결
AND (DEPT_ID = 'D2'
OR DEPT_ID = 'D9')
; -- 문자열을 ''로 감쌉니다. 

-- 별칭 - 컬럼이름에 연산식, 함수식이 들어간 경우 조회된 결과 컬럼명에 별칭을 달아준다
-- 연봉 계산 * + - /
-- 월급여 * 12
SELECT EMP_NAME, SALARY * 12 AS 연봉
FROM EMP;

-- 집계함수를 이용해서 사원의 수를 카운트 21명
SELECT COUNT(*) FROM EMP;

-- 급여 + (급여*보너스)
-- NULL은 연산이 불가능함
-- NULL을 다른값으로 치환하는 함수 값을 변경
-- IFNULL(컬럼이름, 변경할값): 컬럼의 값이 NULL인 경우 다른값으로 저장
-- 보너스를 합한 연봉
SELECT EMP_NAME, SALARY, IFNULL(BONUS, 0),
	SALARY*IFNULL(BONUS, 0) 보너스, SALARY+(SALARY*IFNULL(BONUS, 0)) '보너스를 포함한 급여'
FROM EMP;

-- || 문자열 연결
-- JAVA 출력할때 + 와 비슷
SELECT concat(EMP_NAME, '님의 연봉은 ', FLOOR(SALARY+(SALARY*IFNULL(BONUS, 0))), '원 입니다.')
		, FLOOR(SALARY+(SALARY*IFNULL(BONUS, 0))) 연봉, '원' 단위
FROM EMP;

-- 인사관리부 소속 사원 모든 컬럼 조회
-- 급여가 150만원이상 300만원 이하인
-- BETWEEN A AND B A와 B사이에 있는 데이터 (범위의 조건)
-- NOT BETWEEN 반대
SELECT *
FROM EMP
WHERE DEPT_ID = 'D1'
AND SALARY nOT BETWEEN 1500000 AND 3000000;



