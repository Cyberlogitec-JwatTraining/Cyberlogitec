create table student (
ID int NOT NULL auto_increment,
NAME VARCHAR(100) NOT NULL,
BRANCH VARCHAR(255) NOT NULL,
PERCENTAGE INT NOT NULL,
PHONE INT NOT NULL,
EMAIL VARCHAR(255) NOT NULL,
primary key (ID)
);

insert into student(name, branch, percentage, phone, email) values ('Do Duy Thinh', 'CNTT', 88, 091111111, 'email1@gmail.com');
insert into student(name, branch, percentage, phone, email) values ('John Wick', 'ART MATURE', 81, 0922222222, 'email2@gmail.com');
insert into student(name, branch, percentage, phone, email) values ('Hitman', 'PSYCHOLOGY', 91, 0933333333, 'email3@gmail.com');
insert into student(name, branch, percentage, phone, email) values ('Agent khong khong bay', 'ASSASSIN', 88, 01677777777, 'email4@gmail.com');

SELECT 1 FROM STUDENT WHERE PHONE = 0933333333