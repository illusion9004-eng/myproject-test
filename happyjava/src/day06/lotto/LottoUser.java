package day06.lotto;

public class LottoUser {
    public static void main(String[] args) {
        LottoMachine lottoMachine = new LottoMachine();
        lottoMachine.putBall();
        lottoMachine.mix();
        for(int i = 0; i < 6; i++){
            Ball ball = lottoMachine.getBall();
            System.out.println(ball.number);
        }
    }
}
