package day05;

public class EnhancedForExample {
    public static void main(String[] args) {
        String[] fruits = {"사과", "바나나", "오렌지", "포도"};

        // 향상된 for문 사용
        System.out.println("=== 과일 목록 ===");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        //기본 for
        for(int i = 0; i < fruits.length; i++){
            System.out.println("- " + fruits[i]);
        }

        // 숫자 배열 합계
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("\n합계: " + sum);

        char[] charArr = {'a','b','c','d','e'};
        for(char c :charArr){
            System.out.println(c);
        }
    }
}