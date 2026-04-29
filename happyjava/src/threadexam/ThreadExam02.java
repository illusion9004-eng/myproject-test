package threadexam;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class MyRunnable implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<=10;i++){
            System.out.println("안녕");
        }
    }
}
public class ThreadExam02 {
    public static void main(String[] args) {
        System.out.println("main 시작");

        MyRunnable myRunnable = new MyRunnable();
        Thread thread1 = new Thread(myRunnable);
        thread1.start();

        MyThread myThread = new MyThread("myThread");
        myThread.start();

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=0;i<=10;i++){
                    System.out.println("t2 안녕");
                }
            }
        });


        Thread t3 = new Thread(()->{
            for(int i=0;i<=10;i++){
                System.out.println("t3 안녕");
            }
        });


        t3.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main work!");
        }
    }
}
