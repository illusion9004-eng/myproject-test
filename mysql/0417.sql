desc emp;

desc employees;
select empno, ename, job from emp;

select distinct job as "직 업" from emp;
select * from emp;
select * from emp where deptno=10;
select * from emp where deptno = 20 order by sal;

select * from emp where deptno = 10 or deptno = 20;
select * from emp where deptno in (10,20);
select * from emp where deptno not in (10,20);

select * from emp where sal between 500 and 950;
select * from emp;

select * from emp where hiredate between '1981-01-01' and '1981-12-31';

select * from emp where ename = 'SMITH';
select * from emp where ename like 'SMITH%';
select * from emp where ename like 'SM%';
select * from emp where ename like 'SMITH_'; -- SMITH(?) 한글자가 반드시 있어야 찾는다. 
select * from emp where ename like '_a____';
select * from emp where hiredate like '1981%';

select * from emp where mgr is not null;

select * from emp where comm is not null;

select empno, sal, comm,sal + ifnull(comm,0) from emp; 

select empno, ename, sal from emp order by sal, ename desc;

select empno, ename, sal from emp order by 3, 2 desc;
select empno, ename e, sal s from emp order by e, s desc;
select * from emp order by sal desc limit 3,3;

select lower(ename) from emp;
select * from emp where lower(ename)='smith';
select lpad(ename,10,'*') from emp;

SELECT CURDATE(), CURTIME(), NOW();
select date_format(hiredate,'%Y년 %m월 %d일') from emp;
SELECT DATEDIFF('2024-12-31', NOW());
SELECT 
    YEAR(NOW()),
    MONTH(NOW()),
    DAY(NOW()),
    DAYOFWEEK(NOW());
    select ename, month(hiredate) 입사월 from emp order by 2;
    select count(ename) from emp;
    select sum(sal) from emp;
    -- 그룹함수와 함께..  그룹핑에 참여 하지 않는 컬럼을 같이 사용 할 수 없어요. 
    select deptno, sum(sal) from emp group by deptno; 
    select count(mgr) from emp;
    select count(comm) from emp;
    select count(*) from emp;
    select deptno,job, sum(sal) from emp 
    where job != 'clerk'
    group by deptno, job
    having sum(sal) > 3000
    order by deptno;
    
    select * from emp;
    select * from dept;
    -- smith 라는 사원의 사번과 부서 이름을 알고 싶다. 
	desc emp;
    desc dept;
    select empno, dname from emp, dept order by empno; -- 조인조건을 주지 않으면 이런 결과.
    
    select e.*, d.* from emp e, dept d where e.deptno = d.deptno;
     select e.*, d.* from emp e, dept d;
     
     select e.empno, d.dname from emp e, dept d where e.deptno = d.deptno and ename='smith';
     
     select e.email, c.country_name from employees e, departments d, locations l, countries c
     where e.department_id = d.department_id and d.location_id = l.location_id
     and l.country_id = c.country_id;
    
    
    select e.*, d.* from emp e, dept d where e.deptno = d.deptno;
    
    
    insert into emp values( 8000, 'CARAMI', 'CLERK', null, STR_TO_DATE('23-1-1982','%d-%m-%Y'), 10000, null, null);
    insert into emp values( 8001, 'KYUNGMI', 'CLERK', 8888, STR_TO_DATE('23-1-1982','%d-%m-%Y'), 10000, null, null);
    
    rollback; -- 트랜잭션!! 
    
    delete from emp where empno = 8001;
    -- 각 사원의 매니저 이름을 알고 싶어요. 
    
    
    select e.empno 사번, e.ename 사원명, e.mgr "매니저사번", m.ename "매니저 이름" 
    from emp e, emp m 
    where e.mgr = m.empno;

    