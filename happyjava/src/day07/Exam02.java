package day07;

public class Exam02 {
    String name;
    static int totalCount;

    public void test(int i){
        String str = "abc";
    }

    public static void main(String[] args) {

//
        Exam02.totalCount =0;
//        Exam02.name;

        Exam02 e = new Exam02();
        Exam02 e2 = new Exam02();
        Exam02 e3 = new Exam02();

        e.totalCount = 10;

        System.out.println(e3.totalCount);
        System.out.println(e2.totalCount);
        System.out.println(Exam02.totalCount);

        e.test(10);


    }
}
