package streamexam;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exam01 {
    public static void main(String[] args) {
        int[] iarr = {1,2,3,4,5,6,7,8,9,10};
//        이 배열에서 짝수만 출력하고 싶다.
        for(int j=0;j<iarr.length;j++){
            if(iarr[j] % 2 == 0)
             System.out.println(iarr[j]);
        }
        System.out.println("=".repeat(50));
        for(int value:iarr){
            if(value % 2 == 0)
                System.out.println(value);
        }

        System.out.println("=".repeat(50));
        IntStream stream = Arrays.stream(iarr);
//        stream.filter(new IntPredicate() {
//            @Override
//            public boolean test(int value) {
//                return value%2==0;
//            }
//        });
        IntStream intStream = stream.filter(x -> x % 2 == 0);
        System.out.println("===스트림 사용 전 =======");
        intStream.forEach(i -> System.out.println(i));
        System.out.println("==== 스트림 사용 후 =======");
//        intStream.forEach(System.out::println);
        System.out.println("===== 스트림 다시 사용=======");
        System.out.println("=".repeat(50));
//        메서드 체이닝
        Arrays.stream(iarr)
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);

    }
}
