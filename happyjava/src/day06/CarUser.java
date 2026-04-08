package day06;

public class CarUser {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.color);
        car.색깔을바꾸다("흰색");
        System.out.println(car.color);


        Car car2 = new Car("초록");
        System.out.println(car2.color);

        Car[] cars = new Car[10];
        cars[0] = new Car();
        cars[1] = new Car();
    }
}
