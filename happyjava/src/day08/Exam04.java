package day08;
//인터페이스는 기능을 모아둔 것!!
interface 나는것{
    public void 날다();
    default public void test(){
        System.out.println("test의 기본기능으로 구현");
    };

    static void show(){
        System.out.println("나는것이 구현한 show@@");
    }
}
class 비행기 implements 나는것{
    public void 날다(){
        System.out.println("비행기가 날아요.");
    }
}
class 헬리콥터 implements 나는것{
    String name;
    public void 태우다(){

    }
    public void 날다(){
        System.out.println("헬리콥터가 날아요.");
    }
}
class 나비 implements 나는것{
    public void 날다(){
        System.out.println("나비가 날아요.");
    }

    @Override
    public void test() {
        System.out.println("나비의 test 구현!!! ");
    }
}
public class Exam04 {
    public static void main(String[] args) {
        나는것 a = new 비행기();

        //사용하는 코드
        a.날다();

        나는것.show();

    }
}
