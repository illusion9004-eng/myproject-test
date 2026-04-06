package test;

public class Exam01 {
    public static void main(String[] args) {
        //형변환
        //기본타입
        //타입이 공통점이 있는 것들끼리는 변환이 가능하다.
        byte b = 10;
        int i = b;  //형변환 - 작은그릇을있는것을 큰 그릇으로
        // 옮겨담을때는 컴파일러가 자동으로 형변환해줌. (묵시적 형변환)

        //반대의 경우!!
//        b = i ;  //컴파일러는 그릇의 크기만 비교!! 값은 비교하지 않음.
        b = (byte)i; //명시적 형변환 (프로그래머가 판단!!)

        i = 255;
        byte b2 = (byte)i;
        //주의점 : 오버프로우를 조심해야함.
        System.out.println(b2);

        char c = 'a';

        System.out.println((int)c);
    }
}
