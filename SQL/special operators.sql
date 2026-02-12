## WAQTD DETAILS OF EMP WORKING AS PRESIDENT WITH SALARY OF RS 4000

use scott;
DESC emp;

select * from emp;

select * 
from emp
where job='PRESIDENT' AND sal=5000;

select *
from emp
where deptno in (10,20,30,40);

# waqtd details of the emp who are working as a salesaman clerk or analyst

select * from emp where job in ('SALESMAN', 'CLERK', 'ANALYST');

#WAQTD details of employees who are not working in dept no 20,30
SELECT *
FROM EMP
WHERE NOT DEPTNO IN(20,30);

#details of emp who are earning sal more than1500 but less than 3000
select * from emp
where sal between 1501 and 2999;

#WAQTD DETAILS OF THE EMP WHO ARE NOT EARNING S;ARY IN THE RANGE OF 1000 TO 3000

SELECT * FROM EMP 
WHERE SAL NOT BETWEEN 1000 AND 3000;


