DROP TABLE IF EXISTS contacts;

create table contacts
(
  id int primary key, 
  name varchar(255)
) engine=InnoDB;

set names 'utf8';

insert into contacts values(1, 'Zaporizke shosse str. 22');
insert into contacts values(2, 'Nissan Center');
insert into contacts values(3, 'Laguna');
insert into contacts values(4, 'Dnipro, Slobozhanski avn. 127');
