package day05;

public class ArrayTraversalExample {
    public static void main(String[] args) {
        int[] scores = {95, 87, 66, 73, 82};

        // 1. 기본 for문으로 순회
        System.out.println("=== 기본 for문 ===");
        for (int i = 0; i < scores.length; i++) {
            System.out.println("scores[" + i + "] = " + scores[i]);
        }
        System.out.println("=== 기본 for each 문 ===");
        for(int score:scores){
            System.out.println(score);
        }

        // 2. 총점과 평균 계산
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double avg = (double)sum / scores.length;

        System.out.println("\n총점: " + sum);
        System.out.println("평균: " + avg);

        // 3. 최대값 찾기
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        System.out.println("최고점: " + max);

        //scores의 [0]번 인덱스에 있는 값과, [1] 번 인덱스에 값을
        //바꾸고 싶어요.
//        코드를 만들어 주세요.
        int temp = scores[0];
        scores[0] = scores[1];
        scores[1] = temp;
        System.out.println(scores[0]);
        System.out.println(scores[1]);
    }
}
