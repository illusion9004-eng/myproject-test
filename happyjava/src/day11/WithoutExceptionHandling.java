package day11;

public class WithoutExceptionHandling {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3} ;
        System.out.println("1");
        try {
            System.out.println("2");
            System.out.println("numbers[1]::"+numbers[3]); // ArrayIndexOutOfBoundsException 발생
            System.out.println("3");
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println("4"); //예외가 발생될 때만 실행됨!!
        }finally {
//            어떤 상황에서라도 반드시 처리되어야 할 문장
            System.out.println("finally!!");
        }
        System.out.println("5");
        System.out.println("프로그램 종료"); // 이 코드는 실행되지 않음

//        String str = 10;
    }
}