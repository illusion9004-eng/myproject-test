package day04;

public class ArrayExam01 {
    public static void main(String[] args) {
        //배열 - String[]
        //변수는 값을 하나 담을 수 있다.
        //하나의 그릇에 여러개의 값을 담고 싶을때 언제있나요?

        String name = "강경미";
        String name2 = "박준성";
        String name3 = "김선우";


        //우리반 전체 이름을 출력하고 싶다.
        String[] nameArr;  //배열 사용방법  --  선언만 했을때.. 값을 담는 공간이 있을까요?
        //모든 객체는 인스턴스화 (생성) 해야만 만들어져요.
        nameArr = new String[5]; //배열생성
//        선언만 했을 때는 실제 값을 담을 공간은 없다!!!
        // int값을 5개 담고 싶어요.  iarr  선언과 생성을 해볼까요?
        int[] iarr = new int[5];
        //위에 생성한 배열에 값을 넣고 싶어요.
        iarr[0] = 1;
        iarr[1] = 2;

        //반복문을 이용해서 값을 채울 수 있겠네요.
        for(int i = 0; i < iarr.length; i++){
            iarr[i] = i + 10;
        }

        //배열에서 값을 꺼낼때는..  iarr[4];
        System.out.println(iarr[3]);

        for(int i =0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }

//        원하는 배열을 선언, 생성 할수 있나?
//        이 배열을 사용할 수 있다.  배열에 값을 넣거나, 값을 꺼낼 수 있나?

        // 학생 5명의 점수를 입력 받아서, 총점, 평균을 구해보세요.

        int[] studentScores=new int[10];
        studentScores[0] = 10;







    }
}
