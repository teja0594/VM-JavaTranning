create database dtc;/*to create database*/
create schema dtc;/*to create schema which is same as database*/
use dct;/* to use data base*/
create table department(deptid int primary key ,name varchar(30));/* table creation*/
create table employee(empid int primary key ,name varchar(30),salary int,deptid int,  foreign key(deptid) references department(deptid));
insert into department values (100,'HR'); /* data inserting to table*/
insert into department values (101,'Devloper');
insert into department values (102,'Tester');
commit;/*commiting the data*/
insert into employee values(1,"Teja",50000,101);
insert into employee values(2,"Prem Kumar",100000,100);  /* insertion of data*/
insert into employee(empid,name,deptid) values(3,'john',102);
insert into employee(empid,name,deptid) values(4,'suresh',101);
select * from employee ;   /* retriving of data*/
update employee set age=46 where empid=2;   /*updating the table data*/
update employee set salary=47000 where empid=4;
alter table employee add column age int;  /* altering of table structure*/
 select * from employee where deptid in(select deptid from department where name='HR');
 select * from employee where age between 20 and 30;
  select * from employee where age > 20;
select * from employee where salary >(select salary from employee where empid=3);
select * from employee where salary in(5000,50000);
select * from employee where salary in any(5000,50000);
select * from employee where name like '%a_';
select * from employee where name like '%a%';
desc employee;
select * from employee order by salary;
select * from employee order by age desc;
select * from employee where salary =(select max(salary) from employee);
select * from employee  order by salary desc  limit 1,1;
/*-----------------Aggregate Functions-----------------------*/
select sum(salary) as salarysum from employee ;
select count(*)as employeecount from employee;
select max(salary)as employeecount from employee;
select min(salary)as employeecount from employee;
/*----------------Scalar functions--------------------------*/
/*---Character Functions---*/
select upper(name) from employee;
select lower(name) from employee;
select name,concat(name,upper(name)) from employee;
select name,concat(name,'vm') from employee;
select char_length(name) from employee;
select insert(name,1,char_length(name),upper(name)) from employee;
select reverse(name) from employee;
/*-------------------Group by Clause-----------------*/
select * from employee ;
select e.empid,e.name,d.name from employee e ,department d where e.deptid=d.deptid;
select d.name, count(e.name) as empcount,max(e.salary) as maxsalary,
min(e.age) as minage 
from employee e,department d 
where e.deptid=d.deptid 
group by d.name
having empcount>1 
order by empcount desc;
select d.name,max(e.salary) as deptsalary from employee e ,department d where e.deptid=d.deptid
group by d.name
order by deptsalary;
select d.name,max(e.salary) as deptsalary from employee e ,department d where e.deptid=d.deptid
group by d.name
having deptsalary>75000
order by deptsalary;
select d.name,max(e.salary) as deptsalary from employee e ,department d where e.deptid=d.deptid
group by d.name
order by deptsalary limit 1,1;
select empid,e.name,salary,age,d.name as department from employee e,department d where e.deptid=d.deptid;
select * from employee limit 1,1;