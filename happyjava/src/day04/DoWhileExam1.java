package day04;

public class DoWhileExam1 {
    public static void main(String[] args) {
        int i = 11;
        while(i<+10){
            System.out.println("안녕");
        }

        //조건에 상관없이 한 번은 실행되게 하고 싶다.
        i = 1;
        do {
            System.out.println(i);
            i++;
        }  while(i <= 10);

    }
}
