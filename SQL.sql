create table admin(
id int auto_increment primary key,
name varchar(45) not null,
pwd varchar(45) not null
)engine=innodb
charset=utf8;

create table user(
id int auto_increment primary key,
num varchar(45) not null,
name varchar(45) not null,
password varchar(45) not null
)engine=innodb
charset=utf8;

create table firstpage(
id int auto_increment primary key,
description varchar(1000) 
)engine=innodb
charset=utf8;

create table teacher(
id int auto_increment primary key,
name varchar(45) ,
sex varchar(45),
degree varchar(45),
eduBackground varchar(45),
college varchar(45),
address varchar(45),
direction varchar(45),
intro varchar(1000),
achievement varchar(1000),
photo varchar(100)
)engine=innodb
charset=utf8;

create table book(
id int auto_increment primary key,
name varchar(450) ,
path varchar(45),
description varchar(2000)
)engine=innodb
charset=utf8;

create table ppt(
id int auto_increment primary key,
name varchar(50) ,
path varchar(100),
date varchar(2000)
)engine=innodb
charset=utf8;