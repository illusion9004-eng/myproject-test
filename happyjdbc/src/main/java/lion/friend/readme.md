# Friend Console Program

간단한 JDBC 기반 친구 관리 콘솔 프로그램입니다.  
데이터베이스에 친구 정보를 저장하고 조회, 수정, 삭제 기능을 제공합니다.

---

## 1. 프로젝트 구조

```

lion.friend
├─ FriendApplication.java
├─ common
│  └─ DBUtil.java
├─ dto
│  └─ FriendDTO.java
├─ dao
│  └─ FriendDAO.java
└─ service
└─ FriendService.java

````

---

## 2. 주요 기능

- 친구 등록
- 친구 단건 조회
- 친구 전체 조회
- 친구 정보 수정
- 친구 삭제

---

## 3. 실행 흐름

사용자가 콘솔에서 메뉴를 선택합니다.  
입력값이 서비스로 전달됩니다.  
서비스가 DAO를 호출합니다.  
DAO가 DB에 SQL을 실행합니다.  
결과를 다시 사용자에게 출력합니다.

---

## 4. 데이터베이스 설정

다음은 테이블 생성 예제입니다.

```sql
CREATE TABLE friend (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    phone VARCHAR(30) NOT NULL,
    email VARCHAR(100)
);
````

---

## 5. DB 연결 설정

DBUtil 클래스에서 DB 정보를 수정해야 합니다.

```java
private static final String URL = "jdbc:mysql://localhost:3306/liondb?serverTimezone=Asia/Seoul";
private static final String USER = "lion";
private static final String PASSWORD = "lion1234";
```

---

## 6. 실행 방법

1. MySQL 실행
2. liondb 데이터베이스 생성
3. friend 테이블 생성
4. 프로그램 실행
5. 콘솔 메뉴 선택 후 기능 사용

---

## 7. 기술 스택

* Java
* JDBC
* MySQL
* Gradle

---

## 8. 학습 포인트

* JDBC 기본 사용 방법
* CRUD 흐름 이해
* 계층 분리 구조 이해
* DTO, DAO, Service 역할 구분

---

## 9. 특징

* 인터페이스 없이 단순한 구조
* 최소한의 클래스로 구성
* 콘솔 기반으로 빠르게 실행 가능
* JDBC 흐름 학습에 적합

---

## 10. 향후 확장 아이디어

* 입력값 검증 강화
* 예외 처리 분리
* 검색 기능 추가
* 페이징 처리
* GUI 또는 웹으로 확장

