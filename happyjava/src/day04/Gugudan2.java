package day04;

public class Gugudan2 {
    public static void main(String[] args){
        for(int k = 2; k <= 9; k++) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(k + " * " + i + " = " + (k * i));
            }
            System.out.println(); // 단 구분을 위한 줄바꿈
            //\n   개행   \t  탭키
        }


        for(int k = 1; k <= 9; k++) {
            for (int i = 2; i <= 9; i++) {
                System.out.print(i + " * " + k + " = " + (k * i)+"\t");
            }
            System.out.println();
        }
    }
}