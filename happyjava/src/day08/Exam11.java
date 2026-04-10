package day08;
interface TV{
    void turnOn();
    void turnOff();
}

class STV implements TV{
    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}
class LTV implements TV{
    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }
}
class TVFactory{
    public static TV getTV(String brand){
        if(brand.equals("s"))
            return new STV();
        if(brand.equals("l"))
            return new LTV();
        return null;
    }
}
public class Exam11 {
    public static void main(String[] args) throws Exception{
        TV tv = TVFactory.getTV(args[0]);
        tv.turnOn();
        tv.turnOff();


        Class classz = Class.forName("day08.STV");
        classz.newInstance();
        STV stv = (STV)classz.getDeclaredConstructor().newInstance();
        stv.turnOn();
        stv.turnOff();

    }

}
