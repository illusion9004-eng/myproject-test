package day05;

public class MultiArrayExample {
    public static void main(String[] args) {
        int[][] iarr; //2차원 배열을 가리킬 수 있는 레퍼런스변수 iarr
//        iarr = new int[5]; iarr은 2차원배열을 가리키는 변수이므로 에러.
        iarr = new int[5][3];

        int[][][] iarr2 = new int[2][3][2];
        iarr2[0][1][0] = 10;

        int[][][]  iarr3 = new int[3][][];
//        iarr3[0][0][0] = 20;
        iarr3[0] = new int[2][3];
        iarr3[0][0][1] = 10;
        System.out.println(iarr3[0][0][1]);

        int[][] iarr4 = new int[3][];
        iarr4[0] = new int[5];
        iarr4[1] = new int[2];
        iarr4[2] = new int[3];

        iarr4[0][1] = 20;
        iarr4[1][1] = 100;

        // 2차원 배열 선언과 초기화
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };


//        new int[3][3];
        for(int i = 0 ; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        System.out.println("-".repeat(50));





    }
}
