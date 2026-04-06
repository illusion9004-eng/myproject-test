package day04;

public class WhileExam {
    public static void main(String[] args) {
        //반복문!!
        //어떤일을 반복적으로 여러번 해야할 때..

        int i = 1;
        while (i <=5){
            System.out.println("안녕");
            i++;
        }

        int count = 0;
        while(count <100){
            System.out.println("count::"+ ++count);
        }

    }
}
