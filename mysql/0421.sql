SELECT @@AUTOCOMMIT;

desc member;

select * from member;

insert into member(name,email, password) values('kang','kang@gmail.com','1111');

set autocommit = 0;
commit;
rollback;

update member set name = 'kkm' where id = 8;