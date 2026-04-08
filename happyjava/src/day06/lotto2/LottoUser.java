package day06.lotto2;

public class LottoUser {
    public static void main(String[] args) {
        LottoMachine lottoMachine = new LottoMachine();
//        lottoMachine.putBall();
        lottoMachine.mix();
        for(int i = 0; i < 6; i++){
            Ball ball = lottoMachine.getBall();
            System.out.println(ball.number);
        }

        Ball[] balls = new Ball[20];
        String[] strArr = new String[10];

//        로또머신이 20 대필용해요.
        LottoMachine[] lottoMachines = new LottoMachine[20];
    }
}
