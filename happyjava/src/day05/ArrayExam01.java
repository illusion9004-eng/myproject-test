package day05;

public class ArrayExam01 {
    public static void main(String[] args) {
        //선언, 생성, 사용법.
        int[] iarr;
        int iarr2[];
        int[][] iarr3;
        int[][] iarr4[];  //[] 개수가 배열의 차원을 결정한다.

        //배열은 선언만 하는것은 배열 자체를 가리킬 수 있는 변수.
        //실제 값을 저장하는 공간은 아니다!!
        iarr = new int[4];
        iarr[0] = 10;
        iarr[3] = 20;
//        iarr[4] = 50;  배열은 인덱스를 벗어나서 값을 저장할 수 없다.

        int i = iarr[2];

        System.out.println(i);
        System.out.println("실습끝!!");
        boolean[] boolArr = new boolean[2];

        System.out.println(boolArr[0]);

        String[] strArr = new String[2];
        System.out.println(strArr[0]);
        strArr[0] = "hello";

        int[] arr2 = {10,20,30};
        System.out.println(arr2[2]);

        int[] arr3 = new int[]{10, 20, 30, 40, 50};

        //배열의 초기화는 생성시만 가능
        int[] arr4 = new int[3];
//        arr4 = {10,20,30};    생성한 후에 이렇게 값을 넣는것은 불가능!!










    }
}
