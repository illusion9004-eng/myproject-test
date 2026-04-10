package day08;
class Single{
    private static Single instance;
    private Single(){
        System.out.println("Single 생성됨!!");
    }

    public static Single getInstance(){
        if(instance == null){
            instance = new Single();
        }
        return instance;
    }

}
public class Exam10 {
    public static void main(String[] args) {
        Single s = Single.getInstance();
        Single s2 = Single.getInstance();
        Single s3 = Single.getInstance();
        Single s4 = Single.getInstance();


    }
}
