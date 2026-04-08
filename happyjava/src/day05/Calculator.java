package day05;

import java.util.concurrent.Callable;

public class Calculator {
    //메서드(기능)
    //더하다.
    //접근제한자 리턴타입 메서드명(매개변수)
    public static int add(int i, int j){
        return i+j;
    }

    public static int add(int i, int j,int x){
        return i+j+x;
    }

    public static int add(int... numbers){
        int sum = 0;
        for(int num:numbers){
            sum += num;
        }
        return sum;
    }


    public static void main(String[] args) {
        int sumResult = Calculator.add(10,20);

        System.out.println(sumResult);
       Calculator.add(10,20,30);
        System.out.println(Calculator.add(10,20));
        System.out.println(Calculator.add(10,20,30,40,50));
        System.out.println(Calculator.add(10,2,43,5));


        System.out.println('c');
        System.out.println(10);
        System.out.println("abc");
        System.out.println(10.1);

    }
}
