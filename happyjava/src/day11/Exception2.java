package day11;

public class Exception2 {
    public static void main(String[] args) {
        ExceptionObj2 exobj = new ExceptionObj2();
        int value = 0;
        try {
            value = exobj.divide(10, 0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println(value);
    }
}

class ExceptionObj2 {
    public int divide(int i, int k) throws ArithmeticException{
        int value = 0;
        value = i / k;
        return value;
    }
}