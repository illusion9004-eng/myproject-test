package day10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MathUtilExample {
    // 두 점 사이의 거리 계산
    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // 로또 번호 생성 (1~45 중 6개)
    public static int[] generateLotto() {
        Set<Integer> numbers = new HashSet<>();
        while(numbers.size() < 6) {
            numbers.add((int)(Math.random() * 45) + 1);
        }
//        return numbers.stream().sorted().mapToInt(i -> i).toArray();

        //결과값 담을 배열 생성
        int[] result = new int[6];
        int index = 0;
        //set에 들어있는 값을 배열에 복사
        for(int num:numbers){
            result[index++] = num;
        }
        //.sorted()  정렬해줘요.
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("거리: " + distance(0, 0, 3, 4)); // 5.0
        System.out.println("로또: " + Arrays.toString(generateLotto()));

       int[] lottos =  generateLotto();
        for (int i = 0; i < lottos.length; i++) {
            System.out.println(lottos[i]);
        }

    }
}
