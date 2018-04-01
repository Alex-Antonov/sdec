create database sdec_db CHARACTER SET utf8 COLLATE utf8_general_ci;
use sdec_db;

create user 'apantonov'@'localhost' identified by '0000';
grant all privileges on sdec_db.* to 'apantonov'@'localhost';


create table user (
  id bigint NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  PRIMARY KEY (id)
);

insert into sdec_db.user (name)
values('Frank');

insert into sdec_db.user (name)
values('Moris');

insert into sdec_db.user (name)
values('Ivan');