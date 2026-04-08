package day05;

public class VarArgsExample {
    // 가변 길이 매개변수를 받는 메서드
    public static int sum(int... numbers) {
        int total = 0;
        for (int num : numbers) {
            total += num;
        }
        return total;
    }
    // 일반 매개변수와 함께 사용
    public static void printInfo(String name, int... scores) {
        System.out.print(name + "의 점수: ");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println("(총 " + scores.length + "과목)");
    }

    public static void main(String[] args) {
        printInfo("강경미",90,100,100);
        printInfo("홍길동",100,200,100,80);

        int result = sum(100,20,30);
        System.out.println(result);
    }

}
