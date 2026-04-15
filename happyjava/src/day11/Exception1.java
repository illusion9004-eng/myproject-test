package day11;

public class Exception1 {
    public static void main(String[] args) {
        ExceptionObj1 exobj = new ExceptionObj1();
        int value = exobj.divide(10, 0);
        System.out.println(value);
    }
}

class ExceptionObj1 {
    public int divide(int i, int k) {
        int value = 0;
        try {
            value = i / k; // 0으로 나누기 - ArithmeticException 발생!
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
//            예외가 발생 했을 때 처리하고싶은 로직이 있다면 여기 구현
            value = i;
        }
        return value;
    }
}