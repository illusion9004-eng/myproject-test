package day06;

public class Person {
    //필드는 초기값을 자동으로 갖는다.
    String name;
    int age;
    String address = "seoul";

    static int count = 0;
    static  final int MAX_AGE = 150;
    public void test(){
        //지역변수는 반드시 초기화해서 사용해야함.
        int age;
    }
}
