 --maanger table--
--drop table AAA;
create table AAA (id serial primary key, username varchar(50), user_password varchar(50) not null, roles varchar(50));

select * from AAA; 


insert into AAA values(-5, 'mike mike', 'mike mike', 'defeated');
insert into AAA values(-4, 'mike mike', 'mike mike', 'defeated');

create table employees (id serial primary key, username varchar(50), user_password varchar(50), roles varchar(50));
select * from employees;



--reimbursement table--
drop table reimbursement;
create table reimbursement (id serial primary key, employee_id int references AAA(id), reimbursement_request integer, request_reason varchar(100));

select * from reimbursement;

-- request table--

-- 1. combine employee/manager table into one table... add username/password/roles
-- 2.  create reimbursement request table
-- 3. in service layer you would check provided login credentials against the username/passwords in database to see if login is successful or not

