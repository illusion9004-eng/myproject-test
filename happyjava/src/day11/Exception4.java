package day11;

class ScoreException extends Exception{
    ScoreException(){
        super("점수는 0 - 100 사이의 값만 입력 가능");
    }
    ScoreException(String msg){
        super(msg);
    }
}

class StudentMgr{
    public void inputScore(int score) throws ScoreException{
//        점수를 입력받아서 일을 처리하려고 한다.
//        0-100 까지의 값만 입력 받고 싶어요.
        if(score < 0 || score > 100){
//            throw new RuntimeException
//                    ("점수는 0 - 100 사이의 값만 입력 가능  score: "+score);
            throw new ScoreException("점수는 0 - 100 사이의 값만 입력 가능  score: "+score);
        }

        System.out.println("학생의 점수 :: "+score);
    }
}
public class Exception4 {
    public static void main(String[] args) {
        StudentMgr mgr = new StudentMgr();
        try {
            mgr.inputScore(-30);
            mgr.inputScore(200);
        }catch (ScoreException e){
            System.out.println(e.getMessage());
        }


    }
}
