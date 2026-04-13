package day09;
class Box{
    int i = 10;

    public void setI(int i){
        this.i = i;
    }
}
public class StringExam {
    public static void main(String[] args) {
        String name = "kang";

        System.out.println(name.toUpperCase());

        System.out.println(name);

        Box box = new Box();
        box.setI(30);
        System.out.println(box.i);

        System.out.println(box.i);
        String str = "hello";
        String str2 = "hello";
        String str3 = new String("hello"); //이렇게 생성하는 것은 비권장

        //일반객체는 자기 자신이 바뀌므로 다시 대입해줄필요가 없다.
//        그러나 String은 불변클래스라서 자기자신이 안바뀌고, 새롭게 만들어낸다.
        str = str.toUpperCase();

        if(str == str2){
            System.out.println("같은주소");
        }else{
            System.out.println("다른주소");
        }

    }
}
