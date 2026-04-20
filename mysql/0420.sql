use liondb;
show tables;

show databases;
select version();
select current_date();
select current_user();
select user();

-- Book (id, title, author, publisher, isbn, price, published_date, create_at)
-- id bigint 자동으로 값이 늘어났으면 좋겠고,  기본키로 사용하고싶다. 
-- title  문자타입으로 (200) null은 허용하고싶지않다. 
-- author 문자(100) not null
-- publisher 문자(100)
-- isbn 문자(20)  중복된 isbn은 안된다. 
-- price  int not null
-- published_date  date 
-- crated_at  날짜와 시간값을 저장하고 싶다. 날짜가 자동으로 입력되도록,  current_timestamp  

create table book(
id bigint auto_increment primary key,
title varchar(200) not null,
author varchar(100) not null,
publisher varchar(100),
isbn varchar(20) unique,
published_date date,
create_at datetime default current_timestamp,
update_at datetime default current_timestamp on update current_timestamp
);

insert into  book (title,author, publisher,isbn,published_date) 
values
('모두의 자바','강경미','길벗','12345444','2019-04-18');

-- 수정 
-- UPDATE 테이블명 SET 컬럼명 = '변경할값' WHERE 조건 
update book set isbn = '123456789' where id = 1;

select * from book;



-- 회원 정보를 저장 할 수 있는 member 테이블을 생성하고 싶어요.  
-- 컬럼으로는 id, name, email, password, created_at(가입일) 을 각각 저장하고 싶습니다. 
-- 이메일은 중복되면 안되고,  이름과 비밀번호는 null값을 허용하지 않습니다.
-- 가입일은 자동으로 입력되게 하고 싶어요. 
-- id를 기본키로 저장하고 싶고,  값이 자동으로 입력되게 하고 싶어요. 

create table member(
id bigint auto_increment primary key,
name varchar(50) not null,
email varchar(100) not null unique,
password varchar(100) not null,
create_at datetime default current_timestamp,
update_at datetime default current_timestamp on update current_timestamp
);

-- 입력 
-- insert into 테이블명 values(값들..);  -- 컬럼이 생략된 경우는 값 쪽에 모든 컬럼대한  값이 나와야 함.
-- insert into 테이블명(컬럼들) values(값들..); 
insert into member values (1, 'carami','carami@gmail.com','1234',default, default);
select * from member;
insert into member(name,email,password) values('kang','kang@gmail.com','1111');
insert into member(name,email,password) values
('둘리','kk22@gmail.com','222'),
('hong','hong@gmail.com','3333'),
('김철수','kim@gmail.com','55555');

update member set name='강둘리', email='kang22@gmail.com' 
where id = 3;
