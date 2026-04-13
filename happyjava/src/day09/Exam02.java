package day09;


import java.util.Objects;

class Pen{
    String color;
    String 제조사;
    String 상품명;

    public Pen(String color,String 제조사, String 상품명){
        this.color = color;
        this.제조사 = 제조사;
        this.상품명 = 상품명;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pen pen = (Pen) o;

//        return Objects.equals(color, pen.color) && Objects.equals(제조사, pen.제조사) && Objects.equals(상품명, pen.상품명);

        return this.color.equals(pen.color) && this.제조사.equals(pen.제조사)&& this.상품명.equals(pen.상품명);

    }

    @Override
    public int hashCode() {
        return Objects.hash(color, 제조사, 상품명);
    }
}
public class Exam02 {
    public static void main(String[] args) {
        //Pen을 생성하고,  이 펜을 출력하면 pen 의 정보가 출력되면 좋겠다.
        //ex) 이 펜은 모나미에서 만든 볼펜 입니다. 색상은 빨강입니다.
        Pen pen = new Pen("빨강","모나미","볼펜");
        System.out.println(pen);

        Pen pen2 = new Pen("빨강","abc","볼펜");

        if(pen.equals(pen2))
            System.out.println("같은펜");
        else
            System.out.println("다른펜");
    }

}
