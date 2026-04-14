package day10;

public class Exam01 {
    public static void test(Object obj ){

    }

    public static void main(String[] args) {
        int i = 10;
//        Integer ii = new Integer(i);  버전 1.4까지는 사용자가 직접해줬다.
        //1.5부터는 자바가 알아서 바꿔줌.  오토박싱
        test(i);
    }
}
