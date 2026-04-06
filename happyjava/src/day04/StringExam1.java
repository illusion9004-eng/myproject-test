package day04;

import java.util.Scanner;

public class StringExam1 {
    public static void main(String[] args) {
        String str1 = "hello" + 1;
        String str2 = "hello" + true;
        String str3 = "hello" + 50.4;

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println("hello"+(10+20));

        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));

        for(int i = 0; i < str1.length(); i++){
            System.out.println(str1.charAt(i));
        }

        System.out.println(str1.length());
        System.out.println(str3.length());

//        명령행 매개변수로 입력 받은 숫자만큼 hello가 반복되는 문자열을 만들고 싶어요.
//        ex) 2 를 입력받았다면 hellohello
//        ex)4 를 입력받았다면 hellohellohellohello 이런 문자열을 만들고 싶어요.

        int count = Integer.parseInt(args[0]);
        System.out.println(count);
        String message="";
        for(int i = 0; i < count; i++){
            message += "hello";
        }

        System.out.println(message);

        //io를 이용하는 방법  -- Scanner 객체를 이용해서 입력받기!!

        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요::");
        int i = sc.nextInt();
        System.out.println(i);
        for(int j = 0; j < i; j++){
            System.out.println("hello");
        }



    }
}
