package day05;

import java.util.Arrays;

public class ArraysUtilExample {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 3};

        System.out.println(Arrays.toString(numbers));
        String[] strArr = {"hello","hi","hohoho"};
       String result =  Arrays.toString(strArr);

        System.out.println(result);


        // 5. fill() - 배열 채우기
        int[] filled = new int[5];
        Arrays.fill(filled, 7);
        System.out.println("채워진 배열: " + Arrays.toString(filled));
    }
}
