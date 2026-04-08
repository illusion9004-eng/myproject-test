package day06;
class Pen{
    String 색;
    int 잉크양;
    public void 쓰다(String message){
        System.out.println("pen 이 씁니다."+message);
    }
}
public class Exam01 {
    public static void main(String[] args) {
        Pen 볼펜;
        int i;
        String str;
        볼펜 = new Pen();
        볼펜.쓰다("안녕");

        new Pen();
        new Pen();
        new Pen();
        new Pen();

//        위의 4개의 펜은 내가 사용 할 수 있을 까요??



    }
}
