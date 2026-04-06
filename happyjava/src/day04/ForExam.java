package day04;

public class ForExam {
    public static void main(String[] args) {
        //반복하는거 있나요?
        //안녕을 10 번출력하고 싶어요.
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("안녕");
        System.out.println("안녕");


        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

//        System.out.println(i);

        //for 어떻게 동작하는지 이해되시나요?
        //실행 순서가 중요해요!!!

        int count = 0; //변수의 스코프(범위) - 자바는 블록단위

        for(;count < 10; ){
            System.out.println(count++);
        }

        System.out.println(count);

        while (true){

        }
//        for (;;){  //무한루프
//
//        }

    }
}
