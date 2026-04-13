package day09;
class MyObject /*extends Object*/{
    int i ;

    @Override
    public String toString() {
        return "나는 MyObject 입니다. 나의 i 는 "+i +"입니다.";
    }
}
public class Exam01 {
    public static void main(String[] args) {
        MyObject myObject = new MyObject();
        myObject.toString();

        System.out.println(myObject);
        System.out.println(myObject.toString());

        //myObject 의 toString() 은 누가 구현한 메소드인가요??


        String str = "abc";
        System.out.println(str);  //.toString() 생략된것!!
        System.out.println(str.toString());

        System.out.println(myObject.getClass());
    }
}
