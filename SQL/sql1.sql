select user from mysql.user;
create database employdb;

show databases;
use employdb;
show schemas;

create database employedb;
use employedb;
create schema employedb;

create table employe_details( 
emp_id int not null auto_increment,
emp_name varchar(45) not null,
occupation varchar(50) not null,
emp_age int not null,
primary key(emp_id));
show tables;

describe employe_details;
insert into employe_details values(1,'sanju','developer',22);
insert into employe_details values(2,'chinju','nurse',27);
insert into employe_details values(3,'rinju','engineer',26);
select*from employe_details;

select lower('Oracle') from dual;
alter table employe_details add address varchar(100);
alter table employe_details drop emp_age;

create table javasql(name varchar(50));
insert into javasql values ('Oracle');
select lower('Oracle');
select upper('oracle');
select instr(name,'a') from javasql;
select concat(name,'for') from javasql;
select concat(concat(name,' for'),' developers') from javasql;
select name || 'for' from javasql;
select 'dave' || 'Anderson' from dual;
select substr('Oracle',2) from dual;
select substr('Oracle',2,3) from dual;
select length ('Oracle for Developers') from dual;
select ltrim ('   Oracle for Developers') from dual;
select rtrim ('   Oracle for Developers   ') from dual;
select lpad('Oracle',10,'*') from dual;
select rpad('Oracle',10,'*') from dual;


select ceil(24.567);
select floor (24.567) from dual;
select round (24.567) from dual;
select round (24.567,1) from dual;
select round (24.567,-1) from dual;
select truncate (24.567,1) from dual;
select trunc (24.567,1) from dual;
select power(5,2) from dual;
select sqrt(16) from dual;
select mod(5,2) from dual;



create table celebrity(celebrity_id int not null,
celebrity_Fname varchar(45) not null,
celebrity_gender int not null,
celebrity_age int not null);
drop table celebrity;
create table celebrity(celebrity_id int not null,
celebrity_Fname varchar(45) not null,
celebrity_gender int not ,
celebrity_age int not null);
drop table celebrity;
create table celebrity(celebrity_id int not null,
celebrity_Fname varchar(45) not null,
celebrity_gender varchar(30) not null ,
celebrity_age int not null);
insert into celebrity values(1,'john','male',45);
insert into celebrity values(2,'Alex','male',35);
insert into celebrity values(3,'manju','male',30);


select celebrity_Fname,lpad('*',length(celebrity.celebrity_Fname),'*') as e from celebrity;
select sysdate() from dual;
select current_date from dual;
select adddate(sysdate(),7) from dual;
select adddate(sysdate(),-7) from dual;
select adddate(sysdate(),interval 3 month) from dual;
select period_diff (202110,202001);
select last_day(sysdate()) from dual;
select date_add(sysdate(),interval 3 day) from dual;
select date_add(sysdate(),interval 1 day) from dual;
select extract(year from sysdate())from dual;
select extract(month from sysdate())from dual;
select extract(day from sysdate())from dual;


select cast(2560 as char) from dual;

create database employedb;
use employedb;
create schema employedb;

create table emp( 
emp_id int not null auto_increment,
sal int not null,
occupation varchar(50) not null,
emp_name varchar(50) not null,
primary key(emp_id));
insert into emp values(1,20000,'nurse','Chinchu');
insert into emp values(2,23000,'engineer','Rinchu');
insert into emp values(3,25000,'Developer','Sanju');
truncate emp;
select (concat('$',lpad(sal,7,0))) from emp;
select (concat('$',lpad('2560.00',9,0))) from emp;
select cast(sysdate() as char) from dual;
select str_to_date('17/10/20','%d/%m/%y');
select date_format('17-10-20','%D/%M/%Y');
select cast(sysdate()as char) from dual;
select convert('17-11-1998',char) from dual;
select day(sysdate());

drop table emp;
create table emp( 
emp_id int not null auto_increment,
sal int not null,
hiredate int not null,
occupation varchar(50) not null,
emp_name varchar(50) not null,
primary key(emp_id));
insert into emp values(1,20000,25/01/1995,'nurse','Chinchu');
insert into emp values(2,23000,21/09/1995,'engineer','Rinchu');
insert into emp values(3,25000,15/09/1998,'Developer','Sanju');
select floor(sysdate()-hiredate)/365)from 