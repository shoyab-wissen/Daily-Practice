create type employee_designation as ENUM ('PROGRAMMER','TESTER','ADMIN','MANAGER');
create type employee_gender as ENUM ('MALE', 'FEMALE');
create table employee (
	eid serial primary key,
	name varchar(20) not null,
	age smallint not null,
	gender employee_gender not null,
	salary decimal(8, 2),
	designation employee_designation,
	mgr_id int,
	email_id varchar(40),
	married bool,
	joining_date TIMESTAMP,
	constraint fk_mgr foreign key (mgr_id) references employee(eid)
);

alter table employee add constraint age_check check(age > 20 and age < 61);
alter table employee add constraint email_check check(email_id ~ '^\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}$');

INSERT INTO employee (name, age,gender, salary, designation, mgr_id, email_id, married, joining_date)
VALUES
('Shoyab Siddique', 22, 'MALE', 999999.99, 'ADMIN', NULL, 'shoyabsiddique692@gmail.com', false, '2020-05-01 08:30:00'),
('Sanjana Panda', 22, 'FEMALE', 999999.99, 'MANAGER', NULL, 'sanjanapanda@gmail.com', FALSE, '2021-03-15 09:00:00'),
('Kaif Ali', 21, 'MALE', 999.99, 'TESTER', 1, 'kaifali@gmail.com', TRUE, '2019-07-22 08:45:00'),
('Omkar Shirwadkar', 21, 'MALE', 999.99, 'PROGRAMMER', 1, 'omkar@gmail.com', TRUE, '2018-10-10 10:00:00'),
('Sarvesh Birla', 21, 'MALE', 999.99, 'TESTER', NULL, 'sarveshbirla@gmail.com', FALSE, '2017-06-01 09:15:00'),
('Sachit Patil', 21, 'MALE', 999.99, 'PROGRAMMER', 2, 'sanchit@gmail.com', TRUE, '2022-01-10 08:30:00');

select * from employee;

-- adding incorrect data to check

INSERT INTO employee (name, age,gender, salary, designation, mgr_id, email_id, married, joining_date)
VALUES
('Shoyab Siddique', 22, 'Male', 999999.99, 'ADMIN', NULL, 'shoyabsiddique692@gmail.com', false, '2020-05-01 08:30:00');