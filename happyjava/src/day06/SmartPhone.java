package day06;

public class SmartPhone {
    String brand;
    String model;
    int batteryLevel;

    public void checkBattery(){
        System.out.println("현재 배터리 잔량은" +batteryLevel+ "% 입니다.");
    }

    public void charge(){
        batteryLevel += 10;
        System.out.println( "충전 중... 배터리가 10% 증가했습니다.");
    }
}
