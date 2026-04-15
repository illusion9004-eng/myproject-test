package day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception3 {
    public static void main(String[] args){
        ExceptionObj3 exobj = new ExceptionObj3();
        int value = 0;
        try {
            value = exobj.divide(10, 0);
        }catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(value);


//            FileInputStream fis = new FileInputStream("abc");

    }
}
//예외의 종류는 checked Exception,  unChecked Exception 으로 나뉨!!
class ExceptionObj3 {
    public int divide(int i, int k) throws Exception {
        int value = 0;
        value = i / k; // 0으로 나누기 - ArithmeticException 발생!
        return value;
    }
}