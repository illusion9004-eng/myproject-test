package day11;

public class Exam01 {
    public static void main(String[] args) {
        int[] iarr =/* new int[3]*/ null;

        try {
            iarr[2] = 10;
            System.out.println("try 블럭내의 예외발생 다음라인");

            System.out.println(iarr[2]);

        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("예외발생됨!!");
//            exception.printStackTrace();
            System.out.println(exception.getMessage());
            System.out.println(exception);
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("iarr : "+iarr);

        System.out.println("종료!!");
    }
}
