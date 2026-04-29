package lambdaexam;
//@FunctionalInterface
interface Test {
    public void test();
    public void test2();
}

class TestImpl implements Test{
    @Override
    public void test(){
        System.out.println("test");
    }
    @Override
    public void test2(){}
}

public class Exam02 {
    public static void main(String[] args) {
        Test test=new TestImpl();
        test.test();

        Test test2 = new Test() {
            @Override
            public void test() {
                System.out.println("test2");
            }

            @Override
            public void test2() {

            }
        };

        Test test3 = new Test() {
            @Override
            public void test() {
                System.out.println("test3");
            }
            @Override
            public void test2() {

            }
        };
//        FunctionalInterface 만 람다식으로 변환이 가능 하다!!!

//        Test test4 = ()-> System.out.println("test4");
//
//        test4.test();
//        test3.test();
//
//        Test test5 = ()-> System.out.println("test5");
//        test5.test();




    }
}
