use scott;
/* =========================
   SELF JOIN (EMP as employee + EMP as manager)
   ========================= */

-- 1) Display employee name and their manager name (only for employees whose job is CLERK)
SELECT E.ENAME, M.ENAME AS MGRNAME 
FROM EMP E INNER JOIN EMP M
ON E.MGR=M.EMPNO
WHERE E.JOB='CLERK';

select e.ename, m.ename
 from emp e
 inner join emp m
   on e.mgr = m.empno
 where e.job = 'CLERK';

-- 2) Display employee name and manager job, where manager belongs to dept 10 or 20
select e.ename, m.job
from emp e
inner join emp m
  on e.mgr = m.empno
where m.deptno in (10, 20);

-- 3) Display employee name and manager salary where:
--    employee salary > 2300 AND manager salary > 2300
select e.ename, m.sal
from emp e, emp m
where e.mgr = m.empno
  and e.sal > 2300
  and m.sal > 2300;

-- 4) Display employee name and manager hiredate for employees hired before 1982
select e.ename, m.hiredate
from emp e, emp m
where e.mgr = m.empno
  and year(e.hiredate) < 1982;

-- 5) Display salesman name and manager commission where:
--    employee is SALESMAN and manager is from dept 30
select e.ename, m.comm
from emp e, emp m
where e.mgr = m.empno
  and e.job = 'SALESMAN'
  and m.deptno = 30;

-- 6) Display employee name + employee salary + manager name + manager salary
--    where employee salary > manager salary
select e.ename, e.sal, m.ename, m.sal
from emp e, emp m
where e.mgr = m.empno
  and e.sal > m.sal;

-- 7) Display employee & manager hiredates where employee was hired after the manager
select e.ename, e.hiredate, m.ename, m.hiredate
from emp e, emp m
where e.mgr = m.empno
  and e.hiredate > m.hiredate;

-- 8) Display employee name and manager name where both have the same job
select e.ename, m.ename
from emp e, emp m
where e.mgr = m.empno
  and e.job = m.job;

-- 9) Display employee name and manager name where manager's job is MANAGER
select e.ename, m.ename
from emp e, emp m
where e.mgr = m.empno
  and m.job = 'MANAGER';

-- 10) Display employee annual salary and manager annual salary where:
--     employee dept is 10 or 20 AND manager salary > employee salary
select e.ename, e.sal*12 as annual_sal,
       m.ename, m.sal*12 as annual_sal
from emp e, emp m
where e.mgr = m.empno
  and e.deptno in (10, 20)
  and m.sal > e.sal;

-- 11) Display employee name and manager job for all employees having a manager
select e.ename, m.job
from emp e
join emp m
  on e.mgr = m.empno;

-- 12) Display employee name and manager salary where manager salary ends with 50.00
--     (Note: LIKE on a numeric column works only if DB auto-converts to string; otherwise CAST is needed)
select e.ename, m.sal
from emp e
join emp m
  on e.mgr = m.empno
where m.sal like ('%50.00');


/* =========================
   CORRELATED SUBQUERY
   ========================= */

-- Display employees who earn more than the average salary of their own department
select *
from emp e
where sal > (
  select avg(sal)
  from emp e2
  where e.deptno = e2.deptno
);

-- Display average salary per department
select avg(sal), deptno
from emp
group by deptno;


/* =========================
   STRING / DATE / PATTERN PRACTICE
   ========================= */

-- Display employee name and the length of their name
select ename, length(ename)
from emp;

-- Dummy table example: length of a literal string
select length('PUNJAB') from dual;

-- (This CONCAT usage is not valid in MySQL: CONCAT takes multiple args though; in Oracle CONCAT takes only 2.)
-- Intention: make a sentence using ename, job, hiredate
select concat(ename, ' is working as a ', job, ' hired on ', hiredate)
from emp;

-- Just concatenating two long strings
select concat(
  'ek din mar jayega kutte ki maut jag me sab kahenge mar gaya la la lal llal al ala la lal a',
  'la'
);

-- Employees whose name length is 4
select *
from emp
where length(ename) = 4;

-- Employees whose job length is 7
select *
from emp
where length(job) = 7;

-- Count occurrences of 'S' in a string
select length('Q SPIDERS') - length(replace('Q SPIDERS', 'S', '')) as s_count;

-- Employees whose job ends with "MAN" (e.g., SALESMAN)
select *
from emp
where job like '%MAN';

-- 5) Employees whose job starts with "MAN" using substring
select *
from emp
where substring(job, 1, 3) = 'MAN';

-- 6) Employees having exactly 1 occurrence of letter 'L' in ENAME
select *
from emp
where (length(ename) - length(replace(ename, 'L', ''))) = 1;

-- 7) Employees whose name contains 'O'
select *
from emp
where ename like '%O%';

-- 8) Count occurrences of 'L' in a string
select length('HELLLLL') - length(replace('HELLLLL', 'L', '')) as s_count;

-- 9) Employees whose job contains "MAN" anywhere
select *
from emp
where job like '%MAN%';

-- 10) Employees whose job starts with "MAN"
select *
from emp
where job like 'MAN%';

-- 11) Employees whose job ends with "MAN"
select *
from emp
where job like '%MAN';

-- 12) Make first 3 letters lowercase and keep the rest as-is (your substring indices overlap)
select concat(lower(substring(ename, 1, 3)), substring(ename, 3))
from emp;

-- 13) Build a sentence using ename, job and salary
select concat(ename, ' IS A ', job, ' AND GETS SALARY ', sal)
from emp;

-- 14) Employees hired on a Wednesday
select *
from emp
where dayname(hiredate) = 'Wednesday';


/*Co-related subquery:
In subquery we were giving user input but in this correlated subquery: outer query will start first and then inner query;

BUT IT WILL SEARCH OR DO OPERATION FOR EACH ROW OF OUTER QUERY WHOLE INNER QUERY WILL BE RUN
SO IT’S EXECUTION IS HEAVIER
That’s why we go for exists , it will wait for first valid value, then it will display the records and will not check the duplicate 



Single row functions:

Length(col_name)
Concat(first_arg,second_arg) : will accept only 2 arguments not more Than that(in oracle)
But in mySQL concatenation of multiple works fine;


-> When case sensitive data is there then we can do for common case of data	
	Select * from emp where LOWER(ename)=‘smith’;
	Here this lower will convert the data in lower always so that we can validate data 			irrespective of case.

Length:
Select length(ename) from EMP;


Select length(‘PUNJAB’) from emp;
It will give 14 times 6 because of number of rows of emp dataset,the length of Punjab will be given as output:
So for these cases we can use dummy table:
Select length(‘Punjab’) from dual.

NVL(comm,0) if comm is null it will give 0 else comm (for oracle only)


Substr

Select ename,substr(ename,1,3) from emp;
Negative works also here same like python.

Select ename,substr(ename,-3,3) from emp;*/


