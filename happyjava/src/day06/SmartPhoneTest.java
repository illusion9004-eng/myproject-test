package day06;

public class SmartPhoneTest {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone();
        myPhone.brand = "samsung";
        myPhone.model = "S24";
        myPhone.batteryLevel = 90;

        myPhone.checkBattery();
        myPhone.charge();
        myPhone.charge();
        myPhone.charge();
        myPhone.checkBattery();
    }
}
