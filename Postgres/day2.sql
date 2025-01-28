select * from employee;
create table role (DESIGNATION varchar(20) primary key, MAX_LIMIT int, MIN_SALARY decimal(10, 2));
insert into role values
('TESTER', 100, 20000),
('ADMIN', 2, 1000000),
('PROGRAMMER', 100, 9999999),
('MANAGER', 15, 8888888);


select e.name, e.salary, r.min_salary, e.salary < r.min_salary as not_equal from employee e
join role r on (cast(e.designation as text) = r.designation)
where e.salary < r.min_salary;
select * from employee;
INSERT INTO public.employee (eid, name, age, gender, salary, designation, mgr_id, email_id, married, joining_date)
VALUES
(1, 'John Doe', 35, 'MALE', 55000.00, 'MANAGER', NULL, 'johndoe@email.com', TRUE, '2015-05-12 09:00:00'),
(2, 'Jane Smith', 28, 'FEMALE', 48000.00, 'TESTER', 1, 'janesmith@email.com', FALSE, '2017-08-23 10:30:00'),
(3, 'James Brown', 45, 'MALE', 62000.00, 'MANAGER', NULL, 'jamesbrown@email.com', TRUE, '2012-03-19 14:00:00'),
(4, 'Emily Davis', 32, 'FEMALE', 53000.00, 'ADMIN', 3, 'emilydavis@email.com', TRUE, '2014-11-03 08:45:00'),
(5, 'Michael Wilson', 40, 'MALE', 60000.00, 'MANAGER', NULL, 'michaelwilson@email.com', TRUE, '2011-01-21 16:00:00'),
(6, 'Sophia Taylor', 25, 'FEMALE', 47000.00, 'PROGRAMMER', NULL, 'sophiataylor@email.com', FALSE, '2018-07-29 09:30:00'),
(7, 'David Lee', 50, 'MALE', 70000.00, 'MANAGER', NULL, 'davidlee@email.com', TRUE, '2010-06-15 13:00:00'),
(8, 'Olivia White', 30, 'FEMALE', 52000.00, 'ADMIN', 5, 'oliviawhite@email.com', FALSE, '2016-02-27 11:15:00'),
(9, 'Daniel Clark', 38, 'MALE', 58000.00, 'PROGRAMMER', 3, 'danielclark@email.com', TRUE, '2013-09-05 09:45:00'),
(10, 'Ava Rodriguez', 27, 'FEMALE', 49000.00, 'TESTER', 1, 'avarodriguez@email.com', FALSE, '2017-11-12 10:00:00'),
(11, 'Lucas Martinez', 42, 'MALE', 61000.00, 'MANAGER', NULL, 'lucasmartinez@email.com', TRUE, '2011-07-20 14:30:00'),
(12, 'Mia Harris', 31, 'FEMALE', 54000.00, 'PROGRAMMER', NULL, 'miaharris@email.com', TRUE, '2014-12-11 08:00:00'),
(13, 'Liam Scott', 37, 'MALE', 59000.00, 'ADMIN', 1, 'liamscott@email.com', FALSE, '2015-01-29 10:30:00'),
(14, 'Ella Lewis', 29, 'FEMALE', 50000.00, 'TESTER', 3, 'ellalewis@email.com', TRUE, '2016-10-15 11:00:00'),
(15, 'Noah Walker', 48, 'MALE', 68000.00, 'MANAGER', NULL, 'noahwalker@email.com', TRUE, '2010-09-04 12:30:00'),
(16, 'Charlotte Hall', 33, 'FEMALE', 51000.00, 'PROGRAMMER', 5, 'charlottehall@email.com', TRUE, '2013-03-25 13:45:00'),
(17, 'Ethan Young', 39, 'MALE', 60000.00, 'ADMIN', 1, 'ethanyoung@email.com', FALSE, '2012-05-10 09:00:00'),
(18, 'Isabella King', 26, 'FEMALE', 46000.00, 'TESTER', 3, 'isabellaking@email.com', TRUE, '2018-04-30 09:30:00'),
(19, 'Sebastian Wright', 34, 'MALE', 55000.00, 'PROGRAMMER', 5, 'sebastianwright@email.com', FALSE, '2014-06-20 15:00:00'),
(20, 'Amelia Green', 29, 'FEMALE', 52000.00, 'ADMIN', 1, 'ameliagreen@email.com', TRUE, '2016-08-19 10:00:00');

select e1.*, (select e3.salary from employee e3 where e3.eid = e1.mgr_id) as manager_salary from employee e1
where e1.salary > (select e3.salary from employee e3 where e3.eid = e1.mgr_id);

update employee 
set salary = 40000
where eid = 5;

select COALESCE(cast(Designation as Text), 'Total') as designation, sum(salary)
from employee
group by ROLLUP(Designation)
order by sum(salary);

create or replace procedure insert_into_employee(
e_name varchar(20),
e_age smallint,
e_salary int,
e_desig employee_designation,
e_email varchar(50)
)
language plpgsql
as $$
begin
	INSERT INTO public.employee (name, age, gender, salary, designation, mgr_id, email_id, married, joining_date)
VALUES
(e_name, e_age, 'MALE', e_salary, e_desig, NULL, e_email, TRUE, '2015-05-12 09:00:00');
end;
$$

call abc();
call insert_into_employee('Shoyab', 22, 99999, 'MANAGER', 'shoyabsiddique692@gmail.com');

create or replace function max_salary(desig employee_designation)
returns table(name varchar, age int, designation employee_designation, salary decimal)
language plpgsql
as $$
begin
	return query
		select e.name, e.age, e.designation, max(e.salary) 
		from employee e 
		where e.designation=desig
		and e.salary = (select max(e1.salary) from employee e1 where e1.designation = desig);
end;
$$

select * from max_salary('MANAGER');
select avg(salary) from employee group by designation having designation = 'PROGRAMMER';
select * from employee where eid in (select e1.eid from employee e1 where e1.salary > (select avg(e2.salary) from employee e2 group by e2.designation having e2.designation = e1.designation));

create or replace function validate_salary()
returns trigger as $$
begin
if new.salary < 12000 then
salary = 12000;
end if;
return new;
end;
$$ language plpgsql;

create trigger before_updating_salary
before update on employee
for each row
execute function validate_salary();