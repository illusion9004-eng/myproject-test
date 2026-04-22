SELECT @@AUTOCOMMIT;

desc member;

select * from member;

insert into member(name,email, password) values('kang','kang@gmail.com','1111');

set autocommit = 0;
commit;
rollback;

update member set name = 'kkm222' where id = 8;

desc member;

select * from member;
select id, email, name from member;

select version();


insert into member(name,email, password) values('','kang@gmail.com','1111');

