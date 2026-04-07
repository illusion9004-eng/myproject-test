package day05;

public class ArrayExceptionExample {
    public static void main(String[] args) {
        int[] arr = new int[3];

        try {
            arr[0] = 20;
            arr[5] = 30;
        }catch (Exception e){
            System.out.println("예외가 발생될 때만 실행!!");
        }

        //트럭, 스포츠카, 버스
        System.out.println("다음 코드!! ");
    }
}
