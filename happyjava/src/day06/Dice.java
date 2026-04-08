package day06;

public class Dice {
    //속성 - 면(face), 눈(eye)
    int face;
    int eye;

    public Dice(){
        face = 6;
    }
    public Dice(int face){
        this.face = face;
    }

    //행위 - 굴리다 (roll)
    public void roll(){
        eye = (int)(Math.random()*face)+1;
    }

    public static void main(String[] args) {
//        랜덤한 값을 구하고 싶어요!!
        System.out.println(Math.random());
        System.out.println((int)(Math.random() * 6)+1);

        //주사위를 생성하고,
        // 주사위를 100 번 굴렸을 때 눈이 3이 나오는 횟수를 출력해보세요.
        Dice dice = new Dice();
        int count = 0;
        for(int i = 0; i < 100; i++){
            dice.roll();
            if(dice.eye == 3){
                count++;
            }
        }

        System.out.println("주사위를 100 번 굴려서 3이 나온 횟수 : "+count);

        // 주사위를 30 번 굴렸을 때 눈이 5이 나오는 횟수를 출력해보세요.
        count = 0;
        for(int i = 0; i < 30; i++){
            dice.roll();
            if(dice.eye == 5){
                count++;
            }
        }

        System.out.println("주사위를 30 번 굴려서 5이 나온 횟수 : "+count);
        // 주사위를 200 번 굴렸을 때 눈이 6이 나오는 횟수를 출력해보세요.

    }
}
