package day06;

public class Car {
    String color;

    //내가 구현안해도 컴파일러가 자동으로 만들어요.
    public  Car(){
        //객체가 생성되는 시점에 할일 있다!!
        color = "빨강";
        System.out.println("Car 생성자 호출!! ");
    }
    public Car(String color){
        this.color = color;
    }
    public void 색깔을바꾸다(String color){
        this.color = color;
    }
}
