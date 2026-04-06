package day04;

public class ForExam02 {
    public static void main(String[] args) {
        int count = 1;
        for(int j = 0; j < 5; j++) {
            for (int i = 0; i < count; i++) {
                System.out.print("*");
            }
            count++;
            System.out.println();
        }

        for(int j = 0; j < 5; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
//오늘의 연습문제
//        for(){
//            //전제가 동작되는  랙
//            for(){
//               공백출력
//            }
//            for(){
//                별출력
//            }
//        }
    }
}
