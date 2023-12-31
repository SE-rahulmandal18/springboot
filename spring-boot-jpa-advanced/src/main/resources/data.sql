/*
insert into course(id, name) values(10001,'JPA in 50 Steps');
insert into course(id, name) values(10002,'Spring in 50 Steps');
insert into course(id, name) values(10003,'Spring Boot in 100 Steps');
*/

insert into course(id, name, created_date, last_updated_date) 
values(10001,'JPA in 50 Steps', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

insert into course(id, name, created_date, last_updated_date) 
values(10002,'Spring in 50 Steps', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());

insert into course(id, name, created_date, last_updated_date) 
values(10003,'Spring Boot in 100 Steps', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP());