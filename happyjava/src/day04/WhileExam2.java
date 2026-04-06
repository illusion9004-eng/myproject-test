package day04;

public class WhileExam2 {
    public static void main(String[] args) {
        int i = 1;
        while (true){   //반드시 while 블럭안에서 빠져나갈 부분을 만들어줘야함.
            if(i==11) break;
            System.out.println(i++);
        }


        //1에서 100까지 출력 가능??
        //1에서 100까지 더하는것은 가능할까요?
        i = 1;
        int sum = 0;  // 1에서 100까지 더하는데 더한값을 저장할 그릇!!
        while(i <= 10){
            if(i % 2 == 0) {
                sum = sum + i;
                sum += i;
            }
            i++;
        }
        System.out.println(sum);


    }
}
