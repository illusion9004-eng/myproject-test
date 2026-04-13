package day09;

public class InnerClassTest {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        OuterClass.StaticNestedClass nested = new OuterClass.StaticNestedClass();
        nested.display();

        outer.methodWithLocalClass();

        outer.createAnonymousClass();


        Runnable runnable = new Runnable(){
            @Override
            public void run() {
                System.out.println("익명 클래스 실행");
            }
        };


    }


}
