package day07;
class Pen{
    String 색깔;
    static String 제조사;
    int 잉크량;
    String 상품명;

    public Pen(){

//        색깔 = "검정";
//        제조사 ="모나미";
//        잉크량 = 10;
        this("검정","모나미");
        System.out.println("Pen() 생성자 실행!!");
    }
    public Pen(String 색깔){
//        this.색깔 = 색깔;
//        제조사 ="모나미";
//        잉크량 = 10;
        this(색깔,"모나미");
    }
    public Pen (String 색깔, String 제조사){
        this.색깔 = 색깔;
        this.제조사 = 제조사;
        잉크량 = 10;
        상품명 = "볼펜";
    }
    public void 쓰다(){

    }
    public void 머리에꽂다(){

    }
}
public class Exam01 {
    public static void main(String[] args) {
        int i = 10;  //i라는 변수에 10 이라는 초기값을 준거!!
        char c = 'c';

        Pen pen = new Pen();
        System.out.println(pen.잉크량);
        System.out.println(pen.색깔);
        System.out.println(pen.제조사);

        Pen redPen = new Pen("빨강");
        System.out.println(redPen.잉크량);
        System.out.println(redPen.색깔);
        System.out.println(redPen.제조사);

        new Pen();
        new Pen();
        new Pen();

    }
}
