package day09;

import java.util.concurrent.Callable;

class CaramiClass{
    private int i;
    
    public CaramiClass(int i){
        this.i = i;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;

        CaramiClass c = (CaramiClass) obj;
        if(this.i == c.i){
            return true;
        }
        return false;
    }
}
public class Exam04 {
    public static void main(String[] args) {
        CaramiClass class1 = new CaramiClass(10);
        CaramiClass class2 = new CaramiClass(10);
        
        //같은 클래스인가요? 다른 클래스 인가요? 
        //두개의 객체를 같다고 볼까요?? 
        
        if(class1 == class2)  //== 주소만 비교!!
            System.out.println("같아요.");
        else
            System.out.println("달라요");

        Object obj = null;

        if(class1.equals(class2))  //Object가 구현한 equals() == 주소만 비교!!
            System.out.println("같아요.");
        else
            System.out.println("달라요");


        System.out.println(class1.getClass());
        System.out.println(class2.getClass());
    }
}
