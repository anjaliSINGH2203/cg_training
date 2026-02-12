-- Q0) Switch to the SCOTT database/schema.
USE SCOTT;

-- Q1) Display names of employees earning more salary than ADAMS.
SELECT ENAME
FROM EMP
WHERE SAL > (SELECT SAL
            FROM EMP
            WHERE ENAME='ADAMS');

-- Q2) Display name and salary of employees earning less than KING.
SELECT ENAME, SAL
FROM EMP
WHERE SAL < (SELECT SAL
             FROM EMP
             WHERE ENAME='KING');

-- Q3) Display the salary of KING.
SELECT SAL
FROM EMP
WHERE ENAME='KING';

-- Q4) Display employee name and department number for employees working in the same department as JONES.
SELECT ENAME, DEPTNO
FROM EMP
WHERE DEPTNO = (SELECT DEPTNO
                FROM EMP
                WHERE ENAME ='JONES');

-- Q5) Describe the structure of the DEPT table.
DESC DEPT;

-- Q6) Display employee name and job for employees who have the same job as JAMES.
SELECT ENAME, JOB
FROM EMP
WHERE JOB = (SELECT JOB
             FROM EMP
             WHERE ENAME='JAMES');

-- Q7) Display employee number, name, and annual salary for employees whose annual salary is greater than WARD’s annual salary.
SELECT EMPNO, ENAME, SAL*12 AS "ANNUAL_SAL"
FROM EMP
WHERE SAL*12 > (SELECT SAL*12
                FROM EMP
                WHERE ENAME= 'WARD');

-- Q8) Display employee name and hire date of employees hired before SCOTT.
SELECT ENAME, HIREDATE
FROM EMP
WHERE HIREDATE < (SELECT HIREDATE
                  FROM EMP
                  WHERE ENAME='SCOTT');

-- Q9) Display employee name and hire date of employees hired after the PRESIDENT.
SELECT ENAME, HIREDATE
FROM EMP
WHERE HIREDATE > (SELECT HIREDATE
                  FROM EMP
                  WHERE JOB='PRESIDENT');

-- Q10) Display employee name and salary of employees earning less than employee number 7839.
SELECT ENAME, SAL
FROM EMP
WHERE SAL < (SELECT SAL
             FROM EMP
             WHERE EMPNO=7839);

-- Q11) Display all details of employees hired before MILLER.
SELECT *
FROM EMP
WHERE HIREDATE < (SELECT HIREDATE
                  FROM EMP
                  WHERE ENAME='MILLER');

-- Q12) Display employee name and employee number of employees earning more salary than MILLER.
SELECT ENAME, EMPNO
FROM EMP
WHERE SAL > (SELECT SAL
             FROM EMP
             WHERE ENAME='MILLER');

-- Q13) Display employee name and salary of employees earning more than MILLER but less than ALLEN.
SELECT ENAME, SAL
FROM EMP
WHERE SAL > (SELECT SAL
             FROM EMP
             WHERE ENAME = 'MILLER')
  AND SAL < (SELECT SAL
             FROM EMP
             WHERE ENAME = 'ALLEN');

-- Q14) Display all employee details for employees in department 20 who have the same job as SMITH.
SELECT *
FROM EMP
WHERE DEPTNO=20
  AND JOB=(SELECT JOB
           FROM EMP
           WHERE ENAME='SMITH');

-- Q15) Display all employee details of MANAGERs who work in the same department as TURNER.
SELECT *
FROM EMP
WHERE JOB='MANAGER'
  AND DEPTNO= (SELECT DEPTNO
               FROM EMP
               WHERE ENAME= 'TURNER');

-- Q16) Display employee name and hire date for employees hired after 31-Dec-1980 but before KING was hired.
SELECT ENAME, HIREDATE
FROM EMP
WHERE HIREDATE > '1980-12-31'
  AND HIREDATE < (SELECT HIREDATE
                  FROM EMP
                  WHERE ENAME='KING');

-- Q17) Display all employees (all columns) from the EMP table.
SELECT *
FROM EMP;

-- Q18) Display employee name, salary, and annual salary for employees earning less than BLAKE and annual salary greater than 3500*12? (as written: SAL>3500).
SELECT ENAME, SAL, SAL*12 AS "ANNUAL_SAL"
FROM EMP
WHERE SAL < (SELECT SAL
             FROM EMP
             WHERE ENAME='BLAKE')
  AND SAL > 3500;

-- Q19) Display all employees who earn more than SCOTT but less than KING.
SELECT *
FROM EMP
WHERE SAL > (SELECT SAL
             FROM EMP
             WHERE ENAME ='SCOTT')
  AND SAL < (SELECT SAL
             FROM EMP
             WHERE ENAME='KING');

-- Q20) Display employee names starting with 'A' who work in the same department as BLAKE.
SELECT ENAME
FROM EMP
WHERE ENAME LIKE 'A%'
  AND DEPTNO = (SELECT DEPTNO
                FROM EMP
                WHERE ENAME ='BLAKE');

-- Q21) Display employee name and commission for employees who earn commission and have the same job as SMITH.
SELECT ENAME, COMM
FROM EMP
WHERE COMM IS NOT NULL
  AND JOB = (SELECT JOB
             FROM EMP
             WHERE ENAME='SMITH');

-- Q22) Display all employee details for CLERKs who work in the same department as TURNER.
SELECT *
FROM EMP
WHERE JOB = 'CLERK'
  AND DEPTNO = (SELECT DEPTNO
                FROM EMP
                WHERE ENAME ='TURNER');

-- Q23) Display employee name, salary, and job for employees whose annual salary is more than SMITH’s annual salary but less than KING’s annual salary.
SELECT ENAME, SAL, JOB
FROM EMP
WHERE SAL*12 > (SELECT SAL*12
                FROM EMP
                WHERE ENAME='SMITH')
  AND SAL*12 < (SELECT SAL*12
                FROM EMP
                WHERE ENAME= 'KING');

-- ==================== ASSIGNMENT ON CASE 2 ====================

-- Q24) Display department name and department number for the department in which SMITH works.
SELECT DNAME, DEPTNO
FROM DEPT
WHERE DEPTNO = (SELECT DEPTNO
                FROM EMP
                WHERE ENAME='SMITH');

-- Q25) Display department name and location for the department in which KING works.
SELECT DNAME, LOC
FROM DEPT
WHERE DEPTNO = (SELECT DEPTNO
                FROM EMP
                WHERE ENAME ='KING');

-- Q26) Display the location of the department in which employee number 7902 works.
SELECT LOC
FROM DEPT
WHERE DEPTNO IN (SELECT DEPTNO
                 FROM EMP
                 WHERE EMPNO= 7902);

-- Q27) Display department name, location, and department number for departments that have at least one employee whose name ends with 'R'.
SELECT DNAME, LOC, DEPTNO
FROM DEPT
WHERE DEPTNO IN (SELECT DEPTNO
                 FROM EMP
                 WHERE ENAME LIKE '%R');

-- Q28) Display department name of the department where the PRESIDENT works.
SELECT DNAME
FROM DEPT
WHERE DEPTNO IN (SELECT DEPTNO
                 FROM EMP
                 WHERE JOB='PRESIDENT');

-- Q29) Display employee names who work in the ACCOUNTING department.
SELECT ENAME
FROM EMP
WHERE DEPTNO = (SELECT DEPTNO
                FROM DEPT
                WHERE DNAME='ACCOUNTING');

-- Q30) Describe the structure of the EMP table.
DESC EMP;

-- Q31) Display employee details including annual salary for employees working in departments located in NEW YORK.
SELECT EMPNO, ENAME, JOB, MGR, HIREDATE, SAL, COMM, DEPTNO, SAL*12 AS "ANNUAL_SAL"
FROM EMP
WHERE DEPTNO = (SELECT DEPTNO
                FROM DEPT
                WHERE LOC='NEW YORK');

-- Q32) Display employee names who work in the OPERATIONS department.
SELECT ENAME
FROM EMP
WHERE DEPTNO IN (SELECT DEPTNO
                 FROM DEPT
                 WHERE DNAME='OPERATIONS');

-- Q33) Display all employees (all columns) from EMP table. (Verification query)
SELECT *
FROM EMP;

-- ==================== ASSIGNMENT ON CASE 1 AND 2 ====================

-- Q34) Display employee names who earn more than SCOTT and work in the ACCOUNTING department.
SELECT ENAME
FROM EMP
WHERE SAL > (SELECT SAL
             FROM EMP
             WHERE ENAME='SCOTT')
  AND DEPTNO = (SELECT DEPTNO
                FROM DEPT
                WHERE DNAME='ACCOUNTING');

-- Q35) Display all MANAGERs who work in departments located in CHICAGO.
SELECT *
FROM EMP
WHERE JOB= 'MANAGER'
  AND DEPTNO = (SELECT DEPTNO
                FROM DEPT
                WHERE LOC='CHICAGO');

-- Q36) Display employee name and salary of employees earning more than KING and working in ACCOUNTING department.
SELECT ENAME, SAL
FROM EMP
WHERE SAL > (SELECT SAL
             FROM EMP
             WHERE ENAME='KING')
  AND DEPTNO = (SELECT DEPTNO
                FROM DEPT
                WHERE DNAME='ACCOUNTING');

-- Q37) Display all SALESMAN employees who work in the SALES department.
SELECT *
FROM EMP
WHERE JOB='SALESMAN'
  AND DEPTNO = (SELECT DEPTNO
                FROM DEPT
                WHERE DNAME= 'SALES');

-- Q38) Display employee name, salary, job, and hire date of employees in OPERATIONS department who were hired after KING.
SELECT ENAME, SAL, JOB, HIREDATE
FROM EMP
WHERE DEPTNO IN (SELECT DEPTNO
                 FROM DEPT
                 WHERE DNAME='OPERATIONS')
  AND HIREDATE > (SELECT HIREDATE
                  FROM EMP
                  WHERE ENAME='KING');

-- Q39) Display all employees who work in departments whose names end with 'S'.
SELECT *
FROM EMP
WHERE DEPTNO IN (SELECT DEPTNO
                 FROM DEPT
                 WHERE DNAME LIKE '%S');

-- Q40) Display department names for departments that have at least one employee whose name contains 'A'.
SELECT DNAME
FROM DEPT
WHERE DEPTNO IN (SELECT DEPTNO
                 FROM EMP
                 WHERE ENAME LIKE '%A%');

-- Q41) Display department name and location for departments that have employees earning salary 800.
SELECT DNAME, LOC
FROM DEPT
WHERE DEPTNO IN (SELECT DEPTNO
                 FROM EMP
                 WHERE SAL=800);

-- Q42) Display department names for departments that have employees who earn commission (COMM is not null).
SELECT DNAME
FROM DEPT
WHERE DEPTNO IN (SELECT DEPTNO
                 FROM EMP
                 WHERE COMM IS NOT NULL);

-- Q43) Display location of department 40 only if that department has employees who earn commission.
SELECT LOC
FROM DEPT
WHERE DEPTNO=40
  AND DEPTNO IN (SELECT DEPTNO
                 FROM EMP
                 WHERE COMM IS NOT NULL);

-- ==================== ANY / ALL OPERATOR QUERIES ====================

-- Q44) Display employee name and salary of employees earning more than every SALESMAN.
SELECT ename, sal
FROM emp
WHERE sal > ALL (
    SELECT sal
    FROM emp
    WHERE job = 'SALESMAN'
);

-- Q45) Display employees hired after all CLERKs (later than the latest CLERK hire date).
SELECT *
FROM EMP
WHERE HIREDATE > ALL (SELECT HIREDATE
                      FROM EMP
                      WHERE JOB ='CLERK');

-- Q46) Display employee name and salary of employees earning less than at least one MANAGER.
SELECT ENAME, SAL
FROM EMP
WHERE SAL < ANY (SELECT SAL
                 FROM EMP
                 WHERE JOB='MANAGER');

-- Q47) Display employee name and hire date of employees hired after all MANAGERs and earning more than all CLERKs.
SELECT ENAME, HIREDATE
FROM EMP
WHERE HIREDATE > ALL (SELECT HIREDATE
                      FROM EMP
                      WHERE JOB='MANAGER')
  AND SAL > ALL (SELECT SAL
                 FROM EMP
                 WHERE JOB= 'CLERK');

-- Q48) Display all CLERKs who were hired before at least one SALESMAN.
SELECT *
FROM EMP
WHERE JOB='CLERK'
  AND HIREDATE < ANY (SELECT HIREDATE
                      FROM EMP
                      WHERE JOB= 'SALESMAN');

-- Q49) Display all employees who work in either ACCOUNTING or SALES departments.
SELECT *
FROM EMP
WHERE DEPTNO IN (SELECT DEPTNO
                 FROM DEPT
                 WHERE DNAME='ACCOUNTING' OR DNAME= 'SALES');

-- ==================== ASSIGNMENT ON MAX AND MIN ====================

-- Q50) Display employee name(s) who earn the maximum salary.
SELECT ename
FROM emp
WHERE sal = (SELECT MAX(sal) FROM emp);

-- Q51) Display employee name(s) who earn the minimum salary.
SELECT ename
FROM emp
WHERE sal = (SELECT MIN(sal) FROM emp);

-- Q52) Display employee name and hire date of the employee(s) who were hired earliest.
SELECT ENAME, HIREDATE
FROM EMP
WHERE HIREDATE = (SELECT MIN(HIREDATE) FROM EMP);

-- Q53) Display employee name and hire date of the employee(s) who were hired most recently.
SELECT ENAME, HIREDATE
FROM EMP
WHERE HIREDATE = (SELECT MAX(HIREDATE) FROM EMP);

-- Q54) Display employee name and commission of the employee(s) who have the minimum commission.
SELECT ENAME, COMM
FROM EMP
WHERE COMM = (SELECT MIN(COMM) FROM EMP);

-- Q55) Display employee name, salary, and commission of the employee(s) who have the maximum commission.
SELECT ENAME, SAL, COMM
FROM EMP
WHERE COMM IN (SELECT MAX(COMM) FROM EMP);

-- Q56) Display all details of the employee(s) with the highest employee number.
SELECT *
FROM EMP
WHERE EMPNO = (SELECT MAX(EMPNO) FROM EMP);

-- Q57) Display all details of the employee(s) who were hired earliest (same as minimum hire date).
SELECT *
FROM EMP
WHERE HIREDATE IN (SELECT MIN(HIREDATE) FROM EMP);

-- Q58) Display all details of the employee(s) whose annual salary is minimum.
SELECT *
FROM EMP
WHERE SAL*12 = (SELECT MIN(SAL*12) FROM EMP);

-- Q59) Display employee name and annual salary for employees whose annual salary is greater than all SALESMAN annual salaries.
SELECT ENAME, SAL*12 AS "ANNUAL_SAL"
FROM EMP
WHERE SAL*12 > ALL (SELECT SAL*12
                    FROM EMP
                    WHERE JOB= 'SALESMAN');
                    
##############ASSIGNMENT ON NESTED SUBQUERY#########################
#2ND MIN SALARY

SELECT MAX(SAL)
FROM EMP 
WHERE SAL<(SELECT MAX(SAL)FROM EMP);

#5TH MAX SALARY

SELECT MAX(SAL)
FROM EMP 
WHERE SAL > (
    SELECT MAX(SAL)
    FROM EMP
    WHERE SAL > (
        SELECT MAX(SAL)
        FROM EMP
        WHERE SAL > (
            SELECT MAX(SAL)
            FROM EMP
            WHERE SAL > (
                SELECT MAX(SAL)
                FROM EMP
            )
        )
    )
);
