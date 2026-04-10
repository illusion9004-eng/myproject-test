package day08;
interface TestA{
    int LEVEL = 10;
    default void aa(){
        System.out.println("TestA 의 aa()");
    }
}
interface TestB{
    default void aa(){
        System.out.println("TestB 의 aa()");
    }
}

class Test{

}
class TestClass extends Test implements TestA,TestB{
    int i;
    static final int II = 10;
    @Override
    public void aa() {
        System.out.println("TestClass 의 aa()");
    }
}
public class Exam09 {
    public static void main(String[] args) {
        int level = TestA.LEVEL;
        TestClass test = new TestClass();
        if(test instanceof Object)
            System.out.println("test instanceof Object");

        if(test instanceof TestA)
            System.out.println("test instanceof TestA");

        if(test instanceof TestB)
            System.out.println("test instanceof TestB");

        if(test instanceof Test)
            System.out.println("test instanceof Test");

        if(test instanceof TestClass)
            System.out.println("test instanceof TestClass");
    }
}
