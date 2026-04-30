package streamexam;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Exam03 {
    public static void main(String[] args) {
        int[] iarr = {1,2,3,4,5,6,7,8,9,10};

//        1. 스트림 생성
        IntStream step1 = Arrays.stream(iarr);

//        2. 중간 연산
        IntStream step2 = step1.filter(i -> {
            System.out.println("filter 실행!!");
            return i % 2 == 0;
        });

        System.out.println("filter 이후!!!");

//        3. 최종 연산
        step2.forEach(System.out::println);
    }
}
