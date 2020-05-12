create database if not exists demo;

use demo;

create table Employee(
	 id int primary key auto_increment not null,
     name varchar(255) not null,
     age int not null
);