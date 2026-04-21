package lion.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertExam {
    public boolean insertMember(String name, String email, String password){

//        쓰기 불편해요.  성능도 떨어져요.
        String sql = "insert into member(name,email, password) values('"+name+"','"+email+"','"+password+"')";


        return false;
    }
    public static void main(String[] args) throws Exception{
        //1. 접속
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/liondb";
        String user = "lion";
        String password = "lion1234";
        conn = DriverManager.getConnection(url,user,password);

//        conn.setAutoCommit(false);   -- 기본 설정은 true


        //2. 쿼리문 작성 = 쿼리문이 추상화된 객체 Statement
//        String sql = "insert into member(name,email, password) values('kkk','kang@gmail.com','1111')";
        String sql = "insert into member(name,email, password) values(?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1,"kkk");
        ps.setString(2,"kkk@gmail.com");
        ps.setString(3,"1234");

        //3. 쿼리 실행
        int resultCount = ps.executeUpdate();

//        conn.commit();
        System.out.println(resultCount + "건 입력됨!!");
    }
}
