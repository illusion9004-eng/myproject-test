package day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exam05 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("abc.txt");

            //파일을 사용했어요.
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally {
            if(fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        try(FileInputStream fileInputStream = new FileInputStream("abc.txt")){

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

//        try(ExceptionObj3 obj = new ExceptionObj3()){
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
    }
}
